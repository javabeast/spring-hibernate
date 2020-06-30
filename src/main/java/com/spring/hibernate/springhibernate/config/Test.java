package com.spring.hibernate.springhibernate.config;

public class Test {

    static void countMultiples(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                ;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                ;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                ;
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                ;
            }
        }
    }

    static boolean areAnagram(String str1, String str2) {
        int[] count = new int[256];
        int i;

        for (i = 0; i < str1.length() && i < str2.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        for (i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    static void findAllAnagrams(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (areAnagram(arr[i], arr[j])) {
                    System.out.println(arr[i] + " is anagram of " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs"};
        int n = arr.length;
        findAllAnagrams(arr, n);

    }
}
