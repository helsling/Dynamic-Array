package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dynamic list = new Dynamic();
        try {
            list.append(5);
            list.append(3);
            list.add(12,-1);
            list.append(6);
            list.append(1);
        }
        catch (Exception error ){
            System.out.println(error.getMessage());
        }

        System.out.println(list.getSizeOfArray());
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());

    }
}
