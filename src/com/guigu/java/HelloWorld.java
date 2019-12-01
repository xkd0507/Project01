package com.guigu.java;

import java.util.Date;
import java.util.Scanner;

public class HelloWorld {                       //win+F4查看继承类关系。

    public static void main(String[] args) {
        System.out.println("hellow world");
        Date date1 = new Date();                //alt+enter快捷键自动生成返回值
        System.out.println(date1.getTime());   //alt+shift+r 修改全部同名变量的名称
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str);

        say();

    }


    public static void say(){
        String str = "kitty";
        System.out.println("say something"+str);

    }
}
