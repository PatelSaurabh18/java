// package com.testProject;


public class immutableString_01 {

    public static void main(String[] args) {

        String s1 = "saurabh";
        String s2 = "patel";

        System.out.println("hello" + s1 + s2);

        // String str1="telusko";
        // System.out.println(str1);

        // String str2="telusko";
        // System.out.println(str2);

        String str1 = new String("Navin");
        String str2 = new String("Navin");

        System.out.println(str1.hashCode());

        System.out.println(str2.hashCode());

        // System.out.println(str1==str2);

    }
}
