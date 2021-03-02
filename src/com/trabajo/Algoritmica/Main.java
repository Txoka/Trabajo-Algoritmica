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

        long start=System.currentTimeMillis();
        insertionSort(list10);
        System.out.println(System.currentTimeMillis()-start);

        start=System.currentTimeMillis();
        insertionSort(list1000);
        System.out.println(System.currentTimeMillis()-start);

        start=System.currentTimeMillis();
        insertionSort(list100000);
        System.out.println(System.currentTimeMillis()-start);

    }
    static void insertionSort(int[] arr){
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
    static int search(int[] arr,int v){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==v)return i;
        }
        return -1;
    }
    static void mergesort(int[] arr){
        mergesort(arr,0,arr.length-1);
    }
    static void mergesort(int[] arr,int s,int f){
        if(s<f){
            int q=(s+f)/2;
            mergesort(arr,s,q);
            mergesort(arr,q+1,f);
            merge(arr,s,q,f);
        }
    }
    static void merge(int[] arr,int s,int q,int f){
        int[] res=new int[f-s];
        i=0
        j=0
        while i<len(l0) and j<len(l1):
        if l0[i]<l1[j]:
        res+=[l0[i]]
        i+=1
		else:
        res+=[l1[j]]
        j+=1
        if i>=len(l0):
        res+=l1[j:]
	else:
        res+=l0[i:]
        return res
    }
    static void quicksort(int[] arr){
        quicksort(arr,0,arr.length-1);
    }
    static void quicksort(int[] arr,int s,int f){
        if(s<f){
            int p=partition(arr,s,f);
            quicksort(arr,s,p-1);
            quicksort(arr,p+1,f);
        }
    }
    static int partition(int[] arr,int s,int f){
        int pivot=arr[f];
        int i=s;
        for(int j=s;j<f;j++){
            if(arr[j]<=pivot){
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
                i++;
            }
        }
        int t=arr[i];
        arr[i]=arr[f];
        arr[f]=t;
        return i;
    }
}
