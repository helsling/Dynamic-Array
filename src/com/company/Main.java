package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dynamic list = new Dynamic();
        list.append(5);
        list.append(3);
        list.append(6);
        list.append(1);
        System.out.println(list.getSizeOfArray());
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());

    }
}
