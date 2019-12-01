package com.guigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//单行注释
public class Customer {

    public static void main(String[] args) {
        System.out.println("hellow world!!!");
        say();

    }

    public static void say() {
        try {
            FileInputStream fis = new FileInputStream("asd.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
