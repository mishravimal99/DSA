package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[20];
        int i=0;
        boolean z=true;
        while (z) {
            arr[i]=scanner.nextInt();
            i=i+1;
            if (i==5){
                z=false;
            }
        }
        System.out.println(findSmallestMissingPositiveInteger(arr));
    }
    static int findSmallestMissingPositiveInteger(int[] array){
        int temp=array.length;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=i){
                temp=i;
                break;
            }
        }
        return  temp;
    }
}
