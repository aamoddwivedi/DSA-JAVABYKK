package Recursion;

import java.util.Arrays;

public class quickShort {
    public static void main (String[] args){
    int[] arr = {4,4,3,6,57,7};
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
      static void sort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int s = start;
        int e = end;
        int m = start+(end-start) / 2;
        int pivot = nums[m];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            } while(nums[e]>pivot){
                e--;
            } if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        } sort(nums,start,e);
        sort(nums,s,end);
    }

}
