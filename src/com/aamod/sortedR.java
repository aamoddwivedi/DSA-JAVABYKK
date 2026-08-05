package com.aamod;

public class sortedR {
    public static void main( String[] args ) {
        int [] arr = {1,2,3,4,5,6,7,8,10,9};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted( int[] arr, int index){
        if (index== arr.length){
            return true;
        }
         return arr[index]<arr[index+1]&& sorted(arr,index+1);
    }
}
