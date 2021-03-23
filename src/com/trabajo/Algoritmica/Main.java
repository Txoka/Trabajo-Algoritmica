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
        long start;
        
        
        //10 LIST
        //for(int i=0;i<10;i++)System.out.println(list10[i]);System.out.println("");
        start=System.nanoTime();
        selectionSort(list10);//-------------
        
        System.out.print("Time sorting 10: \t");
        System.out.print(System.nanoTime()-start);
        System.out.println("ns");
        //for(int i=0;i<10;i++)System.out.println(list10[i]);
        
        
        //1000 LIST
        start=System.nanoTime();
        selectionSort(list1000);//-------------
        
        System.out.print("Time sorting 1000: \t");
        System.out.print(System.nanoTime()-start);
        System.out.println("ns");
        
        
        //100k LIST
        start=System.nanoTime();
        selectionSort(list100000);//-------------
        
        System.out.print("Time sorting 100000: \t");
        System.out.print(System.nanoTime()-start);
        System.out.println("ns");
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
    
    static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }
    static void mergeSort(int[] arr,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }
    static void merge(int[] arr,int p,int q,int r){
    	int n1=q-p+1;
    	int n2=r-q;
    	int[] L=new int[n1+1];
    	int[] R=new int[n2+1];
    	for(int i=0;i<n1;i++)L[i]=arr[p+i];
    	for(int j=0;j<n2;j++)R[j]=arr[q+j+1];
    	L[n1]=Integer.MAX_VALUE;
    	R[n2]=Integer.MAX_VALUE;
    	int i=0;
    	int j=0;
    	for(int k=p;k<=r;k++){
    		if(L[i]<=R[j]){
    			arr[k]=L[i];
    			i++;
    		}else{
    			arr[k]=R[j];
    			j++;
    		}
    	}
    }
    
    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    static void quickSort(int[] arr,int s,int f){
        if(s<f){
            int p=partition(arr,s,f);
            quickSort(arr,s,p-1);
            quickSort(arr,p+1,f);
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
    
    static void selectionSort(int[] arr){
    	int n=arr.length;
    	for(int i=0;i<n-1;i++){
    		int minIndex=i;
    		for(int j=i+1;j<n;j++){
    			if(arr[j]<arr[minIndex]){
    				minIndex=j;
    			}
    		}
    		int t=arr[i];
    		arr[i]=arr[minIndex];
    		arr[minIndex]=t;
    	}
    }
    
    static void countingSort(int[] arr){
    	
    }
}
