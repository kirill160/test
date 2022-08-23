package com.company.Function.Lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println(evenValues());
        System.out.println();
    }
    static int proisv(){
        int n = 10;
        int prois = 1;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 20 + 1);
            prois *=a[i];

        }
        return prois;
    }
    static int additionPositiveElements(){
        int n = 8;
        int summ = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) ((Math.random() * 10 + 10 + 1) - 10);
            if(arr[i] > 0){
                summ += arr[i];
            }
        }
        return summ;
    }
    static int elements(){
        int n = 16;
        int summ = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20 + 1);
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0){
                summ++;
            }

        }
        return summ;
    }
    static int evenValues(){
        int n = 9;
        int summ = 0;
        int[] arr  = new int [n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =(int) ((Math.random() * 10 + 10 + 1) - 10);
            if(arr[i] % 2 == 0){
                summ +=arr[i];
            }
        }
    return summ;
    }
}
