package com.company;

import com.company.linkedlist.LinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //LinkedList linkedList = new LinkedList();
//        linkedList.add("Word0");
//        linkedList.add("Word1");
//        linkedList.add("Word2");
//        linkedList.add("Word3");
//        linkedList.add("Word4");
//        linkedList.add("Word4");
//        linkedList.add("Word4");
//        linkedList.add("Word10");

        //LinkedList ll = new LinkedList("This is a test");
        //System.out.println(ll);

        LinkedList ll2 = new LinkedList("first value", "second value", "third value");
        System.out.println(ll2);

        String[] values = new String[3];
        values[0] = "whoa";
        values[1] = "okay";
        values[2] = "yes";
        LinkedList ll3 = new LinkedList(values);
        System.out.println(ll3);

        LinkedList ll4 = new LinkedList("test");
        System.out.println(ll4);
    }
}
