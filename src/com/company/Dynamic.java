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
    public void add(int item , int index )  throws Exception{
        if(sizeOfArray < 0 ){
            sizeOfArray = 1;
        }
        else if ( index < 0){
            throw  new Exception(" Index is less than 0");

        }
        else if (index > sizeOfArray- 1){
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
        }else{
            array[index] = item;
            available_index ++;
        }
    }
    public void append(int item) throws Exception {
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
    public void sort(){
        for( int i = 1; i < array.length; i ++){
            int current = array[i];
            int j = i - 1;
            while( j >= 0 && array[j] > current ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

}
