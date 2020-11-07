package picsart;


import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        //Task 1
        //Create an array and fill it with 2 number.
        int[] task1Array = new int[2];
        task1Array[0] = 5;
        task1Array[1] = 89;

        //Task 2
        //Create an array and fill it with numbers from 1:1000.
        int[] task2Array = new int[1000];
        for (int i = 0; i < task2Array.length; i++) {
            task2Array[i] = i + 1;
        }

        // Task 3
        //Create an array and fill it with odd numbers from -20:20
        int[] myArray1 = new int[20];
        for (int i = 0, j = -19; i < myArray1.length; i++, j += 2) {
            myArray1[i] = j;
            System.out.print(myArray1[i] + " ");
        }
        System.out.println();

        //Task 4
        //Create an array and fill it. Print all elements which can be divided by 5.
        int[] array = {1, 45, 8, 5, 32, 15, 6, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i] + " ");
            }
        }
        System.out.println("------");

        //Task 5
        //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        double[] array1 = {1, 15.6, 78.6, 85, 458.36, 455.8, 455};
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] >= 24.12 && array1[j] <= 467.23) {
                System.out.println(array1[j] + " ");
            }
        }
        //Task 6
        //Create an array and fill it. Print count of elements which can be divided by 2
        int counter = 0;
        int[] task6Array = {2, 78, 21, 15, 8, 88, 35, 54};
        for (int j : task6Array) {
            if (j % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);

        //Task 7
        //Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        //input  N = 2
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}


