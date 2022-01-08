package com.careerdevs;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //SET1
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

        //SET2

        //Alg 6
        System.out.println(reverse(true));

        //Alg 7
        System.out.println(countWords("This a test "));

        //Alg 8


        System.out.println(existsHigher(new int[]{4,5,9}, 10));

        //Alg 9
        System.out.println( getCount(" Hello"));

        //  SET 2 BONUS

        // Reverse the Number

        // Video Length

        // Difference of Max and Min

        // Double Letters

        // Sort Numbers

        //SET3

        //Alg 10
        System.out.println(sum(10,4));

        //Alg 11
        System.out.println(isSameNum(10,20));

        //Alg 12
        System.out.println(calcAge(10));

        //Alg 13
        System.out.println(helloName("Edouard"));

        //Alg 14
        System.out.println(reverse(true));



        // SET 3 BONUS

        // Area of a Triangle

        // Multiple of 100

        // Capture the Rook

        // SET 4

        // Alg 15 Two Makes Ten


        // Alg 16 Count Syllables


        // Alg 17 Case Insensitive Comparison

        // Alg 18 H4ck3r Sp34k

    }


    //SET1

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

    //SET2
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


    // SET 2 BONUS

    // Reverse the Number

    // Video Length

    // Difference of Max and Min

    // Double Letters

    // Sort Numbers


    //SET3

    // Alg 10 Return the Sum of Two Numbers

        public static int sum(int a, int b) {
            return a+b;
        }

    // Alg 11 Are the Numbers Equal?

        public static boolean isSameNum(int x, int y) {
            return x == y;
    }
    // Alg 12 Convert Age to Days

        public static int calcAge(int age) {
            return age*365;
    }

    // Alg 13 Name Greeting!

        public static String helloName(String name) {
            return "Hello " + name + "!";
    }


    // Alg 14 Reverse the Order of a String

    public static String reverse(final String str) {
        StringBuilder strB = new StringBuilder(str);
        String result = strB.reverse().toString();
        return result;
    }

    // SET 3 BONUS

    // Area of a Triangle

    // Multiple of 100

    // Capture the Rook

    // SET 4

    // Alg 15 Two Makes Ten

        public static boolean makesTen(int a, int b) {
            return a==10 || b==10 || a+b==10;
    }


    // Alg 16 Count Syllables


    // Alg 17 Case Insensitive Comparison

    // Alg 18 H4ck3r Sp34k


    // SET 4 BONUS






}


