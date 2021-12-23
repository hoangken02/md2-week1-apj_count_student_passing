package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arrays;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input your size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Out size");
            }
        }while (size > 20);

        arrays = new int[size];
        int i = 0;
        while (i < arrays.length){
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            arrays[i] = scanner.nextInt();
            i ++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j] + "\t");
                if (arrays[j] > 5 && arrays[j] < 10){
                    count ++;
                }
        }

        System.out.print("\n The number of students passing the exam is " + count);
    }
}
