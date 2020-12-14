package com.company;

import java.util.Arrays;

/*
Dynamic array is an indexable array that you can change the size of which can shrink and expand.
 */
public class Dynamic {
    private int sizeOfArray ;
    private int available_index ;
    private int[] array ;
    public Dynamic(){
        sizeOfArray = 1;
        available_index = 0;
        array = new int[sizeOfArray];
    }
    public Dynamic(int size){
        sizeOfArray = size;
        available_index = 0;
        array = new int[sizeOfArray];
    }
    public void add(int item , int index ){
        if(sizeOfArray < 0 ){
            sizeOfArray = 1;
        }
        else{
            if (index > sizeOfArray- 1){
                sizeOfArray *=2;
                int [] new_array = new int[sizeOfArray];
                int i = 0;
                for ( int num : array){
                    new_array[i] = num;
                    i ++;
                }
                array = new_array;
                array[index] = item;
                available_index ++;
            }
        }
    }
    public void append(int item){
        add(item ,available_index );
    }
    public void pop(){
        if(sizeOfArray < 0 && available_index != 0 ){
            System.out.println("Array is empty");
        }else{
            System.out.println("Item remove: " + array[available_index]);
            array[available_index] = Integer.parseInt(null);
            available_index --;
            sizeOfArray --;
            int[] new_array = new int[sizeOfArray];
            int i = 0;
            for ( int num: array ){
                new_array[i] = array[i];
                i++;
            }
            array = new_array;

        }


    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "sizeOfArray=" + sizeOfArray +
                ", available_index=" + available_index +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }
}
