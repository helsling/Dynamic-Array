package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dynamic list = new Dynamic(2);
        list.add(1,0);
        list.add (2, 1);
        list.append(4);
        list.append(5);
        System.out.println(list.getSizeOfArray());
        System.out.println(list.toString());
    }
}
