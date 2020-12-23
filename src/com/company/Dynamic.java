package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
Dynamic array is an indexable array that you can change the size of which can shrink and expand.
 */
public class Dynamic < type extends Comparable> {
    private int sizeOfArray ;
    private int available_index ;
    private type[] array;
    public Dynamic(){
        sizeOfArray = 1;
        available_index = 0;
        array = (type[]) new Comparable[sizeOfArray];
    }
    public Dynamic(int size){
        sizeOfArray = size;
        available_index = 0;
        array = (type[])new Comparable[sizeOfArray];
    }
    public void add(type item , int index )  throws Exception{
        if(sizeOfArray < 0 ){
            sizeOfArray = 1;
        }
        else if ( index < 0){
            throw  new Exception(" Index is less than 0");

        }
        else if (index > sizeOfArray- 1){
                sizeOfArray *=2;
                type[] new_array = (type[])new Comparable[sizeOfArray];
                int i = 0;
                for ( type num : array){
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
    public void append(type item) throws Exception {
        add(item ,available_index );
    }
    public void pop(){
        if(sizeOfArray < 0 && available_index != 0 ){
            System.out.println("Array is empty");
        }else{
            System.out.println("Item remove: " + array[available_index]);
            array[available_index] = null;
            available_index --;
            sizeOfArray --;
            type[] new_array = (type[])new Comparable[sizeOfArray];
            int i = 0;
            for ( type num: array ){
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
            type current = array[i];
            int j = i - 1;
            while( j >= 0 && array[j].compareTo(current) > 1 ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

}
