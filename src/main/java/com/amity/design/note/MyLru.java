package com.amity.design.note;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU的 Java实现
 * 最新的数据放在最后
 * Created by Amity on 2021/5/24 下午 12:07
 */
public class MyLru<K,V> {

    private Map<K,Node<K,V>> map = new HashMap<>();
    private MyLinkedList<K,V> list = new MyLinkedList<>();
    // 和上面的容量一个意思
    private int capacity;

    public MyLru(int capacity) {
        this.capacity = capacity;
    }

    //往LRU中添加数据，主要用map的put方法
    public void add(K key, V value){
        if(map.containsKey(key)){
            Node<K,V> node = map.get(key);
            node.value = value;
            map.put(key,node);
            list.moveToTail(node);
        }else{
            if(map.size() == capacity){
                K k = list.removeHead();
                map.remove(k);
            }
            Node<K,V> node = new Node<>(key, value);
            map.put(key,node);
            list.add(node);
        }
    }

    // 从LRU中获取数据，要把数据提取到最近使用
    public V get(K key){
        if(map.containsKey(key)){
            Node<K,V> node = map.get(key);
            list.moveToTail(node);
            return  node.value;
        }
        return null;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K,V> prev;
        Node<K,V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class MyLinkedList<K,V> {
        // head 是老数据
        Node<K,V> head;
        Node<K,V> tail;

        // 添加新数据到tail
        private void add(Node<K,V> node) {
            if (node == null) {
                throw new NullPointerException("node 为 空");
            }
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        // 移动数据到tail
        private void moveToTail(Node<K,V> node) {
            if (node == null) {
                throw new NullPointerException("node 为 空");
            }
            // 已经末尾了
            if (node.next == null) {
                return;
            }
            if (node.prev == null) {
                head = head.next;
            }
            node.next.prev = node.prev;
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        }

        // 删除最老的数据
        private K removeHead() {
            if(head == null) {
                return null;
            }
            K key = head.key;
            if(head == tail){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            return key;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node cur = head;
            while(cur != null){
                sb.append(cur.key).append(" ");
                cur = cur.next;
            }
            sb.append("\n头是 ").append(head.key).append(" 尾是 ").append(tail.key);
            return sb.toString();
        }
    }



    public static void main(String[] args) {
        MyLru<String,Integer> myLRU = new MyLru<>(3);
        myLRU.add("A", 1);
        myLRU.add("B", 2);
        myLRU.add("C", 3);
        System.out.println(myLRU.get("A"));
        myLRU.add("D", 4);
        System.out.println(myLRU.get("B"));
        System.out.println(myLRU.list);
    }

}
