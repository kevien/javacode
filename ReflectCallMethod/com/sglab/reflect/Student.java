package com.sglab.reflect;

public class Student {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void hi(int age,String name){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁");
    }
}