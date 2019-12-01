package com.guigu.java;

import com.guigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author xkd
 * @create 2019-12-01 16:43
 */
public class TemplateTest {

    //模板六：prsf：可生成private static final
    private static final Customer cust = new Customer(); //添加Customer依赖   alt+enter
    //变形：psf, psfi, psfs
    public static final  int NUM =1;
    public static final int NUM2 = 2;
    public static final String STR = "HELLO";



    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形soutp / soutm / soutv/ xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");//方法名
        System.out.println("args = " + args);//最近参数
        System.out.println(args);//输出xxx

        //模板三：fori
        String[] arr = new String[]{"lihua","xiaoming","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {     //增强循环
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori     正序
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr     倒序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn     , xxx.null
        if (list == null) {

        }
        String a="cheng";
        if (a == null) {

        }
        //变形：inn      xxx.nn
        if (list != null) {

        }
        if (a != null) {

        }
    }

}
