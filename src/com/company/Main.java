package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,3,5,7,9,11,13,15,17,19};
        int max = array[0];
        for(int num : array){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max: " + max);
    }
}
