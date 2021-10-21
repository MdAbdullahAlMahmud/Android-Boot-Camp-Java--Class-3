package com.company;

public class Main {

    static int value = 10;
    public static void main(String[] args) {

        int a = 41;

        int arr[] = new int[5];

        arr[0] = 15;
        arr[1] = 14;
        arr[2] = 13;
        arr[3] = 12;
        arr[4] = 11;

        // System.out.println("Value " + arr[4]);
        // System.out.println("New Value " + num[4]);
        // int i = 1;
        /*while(i<11){
            // body
            System.out.println(" Value "+ i);

            i++;
        }*/

        /*do {
            System.out.println(i);
            i++;

        }while (i<11);*/


        int num[] = {5,4,6,8,5,1,10};

        String language[] = {"c","C++", "Java", "Android"};
        String lan[] = new String[2];
        lan[0]="Dart";
        lan[1]="Java";

      /*  for ( int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }*/
        //printNumber(num);

        //int filterNum[] = filterNumber(15);
        //printNumber(filterNum);
        // static

            addNumber(4,5);
            addNumber(4,5,1);

        final int z = 10;
        // z = 45; // we can't assign a value
        print(z);



        AndroidOS samsungOS = new AndroidOS();
        samsungOS.modifiedBySamsung("11");


        AndroidOS xiaomiOS = new AndroidOS();
        xiaomiOS.modifiedByXiaomi("11");













    }

    private static void addNumber(int a , int b){
        int sum = a+b;
        print(sum);
    }
    private static void addNumber(int a , int b , int c){
            int sum = a+b+c;
            print(sum);
        }

    private static void print(String s){
        System.out.println(s);
    }
    private static void print(int s){
        System.out.println(s);
    }
    private static void print(double s){
        System.out.println(s);
    }





    private static int[] filterNumber(int n){
        /*
        7
        [0,1,4,9,16...36]
         */
        int array[] = new int[n]; // int[7]

        for (int i = 0 ; i < n; i++){

            array[i] = i*i;
            /*
            array[0] = 0*0;
            array[1] = 1*1;
           ...............

            array[6] = 6*6;

             */


        }


        return array;
    }


    private static void  printNumber(int num[]) {
        for(int x : num ){
            System.out.println(x);
        }
    }
}
