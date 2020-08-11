package com.spring.hibernate.springhibernate.config;

public class StarPattern {
    private static void drawNewLine(){
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printRightAngle(int size){
        for (int i =0 ; i < size; i++){
            for (int j= size - 1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void printEquilateralTriAngle(int size){
        int z = 1;
        for (int i =0 ; i < size; i++){
            for (int j= size - 1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= z ; k++) {
                System.out.print("*");
            }
            z = z+2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRightAngle(5);
        drawNewLine();
        printEquilateralTriAngle(5);
        drawNewLine();
    }
}
