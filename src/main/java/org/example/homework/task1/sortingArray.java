package org.example.homework.task1;

public class sortingArray {
    public static void main(String[] args) {
        myArray arr1 = new myArray();

        System.out.println("Using overloaded isSorted:");
        System.out.println(arr1.isSorted(5, new int[]{1,2,3,4,0}));

        System.out.println("Using simple isSorted:");
        int[] arr2 = {1,2,3,4};
        System.out.println(arr1.isSorted(arr2));
    }
}
