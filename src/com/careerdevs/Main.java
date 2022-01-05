package com.careerdevs;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Alg 1
        // System.out.println(getFirstElement(new int[] {10,1,4}));

        //Alg 2
        System.out.println(addition(3));

        //Alg 3
        System.out.println(search(new int[]{1,2,3},3));

        //Alg 4
        System.out.println(convert(10));;

        //Alg 5
        System.out.println(giveMeSomething("careerdevs"));

        //Alg 6
        System.out.println(reverse(true));

        //Alg 7
        System.out.println(countWords("This a test "));

        //Alg 8


        System.out.println(existsHigher(new int[]{4,5,9}, 10));

        //Alg 9
        System.out.println( getCount(" Hello"));
        //Alg 10


        //Alg 11

        //Alg 12


        //Alg 13

        //Alg 14


    }

    //Alg 1 Return the First Element in an Array
    public static int getFirstElement(int[] arr) {

        return arr[0];
    }

    //Alg 2
    public static int addition(int num) {
        return ++num;
    }

    //Alg 3 Find the Index

    public static int search(int arr[], int item) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                index = i;
                i += arr.length + 1;
            }
        }
        return index;
    }

    //Alg 4 Convert Minutes into Seconds
    public static int convert(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }

    //Alg 5 Return Something to Me!

    public static String giveMeSomething(String a) {
        return ("something " + a);
    }

    //Alg 6 Flip the Boolean

    public static boolean reverse(boolean b) {
        return !b;
    }

//    Alg 7
//    Get Word
//    Count
//No 1
    public static int countWords(String s) {
        return s.split(" ").length;
    }

//   No 2
//    public static int countWords(String s) {
//        // count the spaces
//        String newStr = s.trim();
//
//        if (newStr == "") {
//            return 0;
//        }
//        // any empty strings will not pass this line of code
//        int numOfSpaces = 0;
//        // iterate through one char at a time , count spaces
//        for (int i = 0; i < newStr.length(); i++) {
//            System.out.println(newStr.charAt(i));
//        }
//        return 0;
//
//    }

        //Alg 8 Exists a Number Higher?

        public static boolean existsHigher ( int[] arr, int n){
            if (arr.length == 0) return false;
            for (int i : arr) {
                if (i >= n) return true;
            }
            return false;
        }


        //Alg 9 How Many Vowels?
        public static int getCount(String str) {
            int vowelsCount = 0;
            // Your code here
            for (int i = 0; i < str.length(); i++) {
                if ("aeiouAEIOU".contains(String.valueOf(str.charAt(i)))) {
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }

}


