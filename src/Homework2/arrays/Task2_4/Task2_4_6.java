package Homework2.arrays.Task2_4;

import Homework2.arrays.ArraysUtils;

public class Task2_4_6 {
    public static void main(String[] args) {
        int[] ms = ArraysUtils.arrayFromConsole();
        int sum=0;
        for (int i = 0; i < ms.length; i++) {
            sum+=ms[i];
        }
        System.out.println("Сумма массива:\t"+sum );
    }
}
