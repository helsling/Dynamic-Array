package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dynamic<Integer> list = new Dynamic();
        ArrayList<String> array = new ArrayList<>();
        try {
            list.append(4);
            list.append(2);
            list.append(0);

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
