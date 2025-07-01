package org.example.homework.task1;

class myArray {
    public static boolean isSorted(int[] inputArray){
        boolean result = false;
        if(inputArray.length < 2) {
            return false;
        }
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] > inputArray[i+1]){
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static boolean isSorted(int size, int[] inputArray){
        boolean result = false;
        if(size < 2){
            return false;
        }
        for (int i = 0; i < size-1; i++){
            result = inputArray[i] > inputArray[i+1] ? false : true;
        }
        return  result;
    }
}
