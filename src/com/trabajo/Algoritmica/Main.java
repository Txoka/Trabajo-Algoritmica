package com.trabajo.Algoritmica;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand=new Random();
        int[] list10    =new int[10];
        int[] list1000  =new int[1000];
        int[] list100000=new int[100000];
        for(int i=0;i<10;i++)list10[i]=rand.nextInt();
        for(int i=0;i<1000;i++)list1000[i]=rand.nextInt();
        for(int i=0;i<100000;i++)list100000[i]=rand.nextInt();
    }
    void insertionSort(int[] arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
