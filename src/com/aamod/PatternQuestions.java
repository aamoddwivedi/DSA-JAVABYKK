package com.aamod;

public class PatternQuestions {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1;row <=2*n; row++) {
            int totalColsInRow = row>n?2*n-row:row;
            for (int col = 1;col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    static void pattern2(int n){
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print( col + " ");
//            }
//            System.out.println();
//        }
//    }
}
