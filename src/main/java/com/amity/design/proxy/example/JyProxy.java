package com.amity.design.proxy.example;

/**
 * Created by Amity on 2021/2/7 上午 10:25
 * 代理类：建邺代理
 */
public class JyProxy implements Specialty{

    private NjSpecialty realSubject = new NjSpecialty();

    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("建邺代理--对南京特产进行包装。");
    }
    public void postRequest() {
        System.out.println("建邺代理--南京特产加价。");
    }
}
