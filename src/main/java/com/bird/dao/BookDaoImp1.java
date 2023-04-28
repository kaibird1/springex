package com.bird.dao;

/**
 * @title:BookDaoImp1
 * @Author GKY
 * @Date:2023/4/2717:50
 */
public class BookDaoImp1 implements BookDao{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("book dao save"+" "+name+" "+age);
    }
}
