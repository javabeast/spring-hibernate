package com.spring.hibernate.springhibernate.demo;

import java.io.*;
import java.util.*;

public class TestDemo {
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        int leftAmount = k;
        SortedSet<Integer> toys = new TreeSet<>();

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < k){
                toys.add(prices[i]);
            }
        }

        Iterator iterator = toys.iterator();
        while (iterator.hasNext()){
            int val = (int) iterator.next();
            if(val < leftAmount){
                leftAmount = leftAmount - val;
                count++;
            }
        }
        return count;
    }

    public static void checkForReturn(){
        if(1 == 1){
            System.out.println("bye");
            return;
        }
        System.out.println("hi");
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(new FileReader("inputdata.txt"));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();*/

        int[] prices = {1, 12, 5, 111, 200, 1000, 40};
        int k = 50;

        int result = maximumToys(prices, k);
        checkForReturn();
        System.out.println(50 > 50);
    }
}
