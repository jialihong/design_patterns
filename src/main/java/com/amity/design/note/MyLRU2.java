package com.amity.design.note;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amity on 2021/5/24 下午 4:44
 */
public class MyLRU2<K,V> {

    private Map<K,Node<K,V>> lruMap = new HashMap<>(16);
    private MyLinkedList<K,V> linkedList = new MyLinkedList<>();

    /**
     * 容量
     */
    private int capacity;

    public MyLRU2(int capacity) {
        this.capacity = capacity;
    }

    public void add(K key, V value){
        if(lruMap.containsKey(key)) {
            //移动到尾部
            Node<K, V> node = lruMap.get(key);
            node.value = value;
            lruMap.put(key,node);
            linkedList.moveToTail(node);
        }else{
            //添加到尾部

        }

    }

    public void get() {

    }

    private static class Node<K,V> {
        K key;
        V value;
        Node<K,V> prev;
        Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class MyLinkedList<K,V>{
        /**
         * 头部，老数据
         */
        Node<K,V> head;

        /**
         * 尾部，最新的数据
         */
        Node<K,V> tail;


        public void moveToTail(Node<K, V> node) {
            if(node == null) {
                throw new NullPointerException("node为空");
            }

            //node已经是最后节点了
           if(node.next == null) {
                return;
            }

           //node的前一节点为空，即只有node这一个节点
           if(node.prev == null) {
               head.next = null;
           }

           //node为中间节点
            //node的前一节点
            node.prev.next = node.next;
           //node的后一节点
            node.next.prev = node.prev;
            //将node移至尾部节点
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;

        }
    }
}
