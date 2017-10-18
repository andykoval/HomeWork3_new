package com.company;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andy on 17.10.2017.
 */
public class HomeWork3newMeth {
    public static void Task1() {
        int[] arr = new int[20 / 2];
        for (int i = 0, j = 2; i < arr.length; i++, j += 2) {
            arr[i] = j;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void Task2() {
        int[] arr = new int[50];
        for (int i = 0, j = 1; i < arr.length; i++, j += 2)
            arr[i] = j;
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void Task3() {
        int[] arr = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = (int) (Math.random() * 9);
            if (arr[i] % 2 == 0 && arr[i] != 0) count++;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
        System.out.println("Четных элементов в массиве: " + count);
    }

    public static void Task4() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length / 2; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task5() {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        double sumArr1 = 0, sumArr2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5);
            sumArr1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 5);
            sumArr2 += arr2[i];
        }
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        System.out.println("Массив 2: " + Arrays.toString(arr2));
        if (sumArr1 / arr1.length > sumArr2 / arr2.length)
            System.out.println("Наибольшее средннее арифметическое в первом массиве: " + (double) (sumArr1 / arr1.length));
        else if (sumArr1 / arr1.length < sumArr2 / arr2.length)
            System.out.println("Наибольшее средннее арифметическое во втором массиве: " + (double) (sumArr2 / arr2.length));
        else System.out.println("Средние арифметические обоих массивов равны");
    }

    public static void Task6() {
        int[] arr = new int[4];
        boolean ifTrue = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + (int) (Math.random() * 89);
        }
        System.out.println(Arrays.toString(arr));
        int[] arrSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSort);
        if (Arrays.equals(arr, arrSort))
            ifTrue = true;
        if (ifTrue)
            System.out.println("Массив является возрастающим");
        else System.out.println("Массив не является возрастающим");
    }

    public static void Task7() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            if (i < 2)
                arr[i] = 1;
            else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task8() {
        int[] arr = new int[20];
        int max = -15, maxInd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -15 + (int) (Math.random() * 30);
            if (arr[i] >= max) {
                max = arr[i];
                maxInd = i;
            }
        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(arr));
        System.out.println("Индекс последнего максимального числа: " + maxInd);
    }

    public static void Task9() {
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];
        double[] arrOtn = new double[10];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + (int) (Math.random() * 8);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1 + (int) (Math.random() * 8);
        }
        for (int i = 0; i < arrOtn.length; i++) {
            arrOtn[i] = arr1[i] / arr2[i];
            if (arrOtn[i] == (int) arrOtn[i])
                count++;
        }
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        System.out.println("Массив 2: " + Arrays.toString(arr2));
        System.out.println("Массив 3(Отношение 1 к 2): " + Arrays.toString(arrOtn));
        System.out.println("Количество целых элементов массива 3: " + count);
    }

    public static void Task10() {
        int[] arr = new int[11];
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1 + (int) (Math.random() * 3);
            switch (arr[i]) {
                case -1:
                    count1++;
                    break;
                case 0:
                    count2++;
                    break;
                case 1:
                    count3++;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (count1 > count2 && count1 > count3)
            System.out.println("Наибольшее число повторов числа -1: " + count1);
        else if (count2 > count1 && count2 > count3)
            System.out.println("Наибольшее число повторов числа 0: " + count2);
        else if (count3 > count1 && count3 > count2)
            System.out.println("Наибольшее число повторов числа 1: " + count3);
    }

    public static void Task11() {
        Scanner scn = new Scanner(System.in);
        int sumArr1 = 0, sumArr2 = 0, n;
        do {
            System.out.println("Введите четное положительное число: ");
            n = scn.nextInt();
        }
        while (n % 2 != 0);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = -5 + (int) (Math.random() * 10);
        for (int i = 0; i < arr.length / 2; i++)
            sumArr1 += Math.abs(arr[i]);
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            sumArr2 += Math.abs(arr[i]);
        }
        System.out.println("Массив" + Arrays.toString(arr));
        if (sumArr1 > sumArr2)
            System.out.println("Сумма чисел по модулю больше у левой половины массива");
        else if (sumArr1 < sumArr2)
            System.out.println("Сумма чисел по модулю больше у правой половины массива");
        else
            System.out.println("Сумма чисел по модулю у левой и правой половины массива равны");
    }

    public static void Task12() {
        int[] arr = new int[12];
        int countZ, count;
        int i;
        for (; ; ) {
            count = 0;
            countZ = 0;
            for (i = 0; i < arr.length; i++) {
                arr[i] = -10 + (int) (Math.random() * 20);
                if (arr[i] < 0)
                    count++;
                if (arr[i] == 0)
                    countZ++;
            }
            if (count == arr.length / 2 && countZ == 0) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Task13() {
        Scanner scn = new Scanner(System.in);
        int count = 0, n;
        System.out.println("Введите натруральное число больше 3: ");
        do {
            n = scn.nextInt();
            if (n <= 3) System.out.println("Повторите ввод. Введите натруральное число больше 3: ");
        }
        while (n <= 3);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int temp : arr)
            if (temp % 2 == 0 && temp != 0) count++;
        int arrNew[] = new int[count];
        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                arrNew[j] = arr[i];
                j++;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(arrNew));
    }

    public static void Task14() {
        int[][] arr = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 10 + (int) (Math.random() * 89);
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Task15() {
        int[][] arr = new int[5][8];
        int max = -99;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = -99 + (int) (Math.random() * 200);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static void Task16() {
        int[][] arr = new int[7][4];
        int multModI = 1, multModIMax = 0, index = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = -5 + (int) (Math.random() * 11);
                System.out.print(arr[i][j] + " ");
                multModI *= Math.abs(arr[i][j]);
            }
            if (multModI > multModIMax) {
                multModIMax = multModI;
                index = i;
            }
            multModI = 1;
            System.out.print("\n");
        }
        System.out.println("Индекс троки с максимальной мультипликацией элементов по модулю : " + index);
    }

    public static void Task17() {
        int[][] arr = new int[6][7];
        int[] arrRow = new int[7];
        int maxI = 0, temp = 0;
        System.out.println("Массив: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (int) (Math.random() * 9);
                System.out.print(arr[i][j] + " ");
                arrRow[j] = arr[i][j];
            }
            System.out.print("\n");
            Arrays.sort(arrRow);
            for (int j = 0; j < 7; j++) {
                arr[i][j] = arrRow[6 - j];
            }
        }
        System.out.println("Массив с наибольшим элементом строки на первом месте: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Task18() {
        int arr1num[] = new int[15];
        int arr2num[] = new int[15];
        int tempNum1 = 0, tempNum2 = 0;
        //       ?int arr1num =0, arr2num = 0;
        for (int i = 0; i < 15; i++) {
            arr1num[i] = 2 + (int) (Math.random() * 7);
            arr2num[i] = 2 + (int) (Math.random() * 7);
//            String tempNum = String.valueOf(arr1num[i]) + String.valueOf(arr2num[i]);
//            String tempNumRev = String.valueOf(arr2num[i]) + String.valueOf(arr1num[i]);
            System.out.println("Пример для " + (i + 1) + " ученика: " + arr1num[i] + "*" + arr2num[i]);
        }
    }
}