/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program3;

import java.util.Scanner;

/**
 *
 * @author Mayor Kucing
 */
public class Soal6 {

    static void swap(int arr[], int firstIndex, int secondIndex) {
        int temp;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    static int indexOfMinimum(int arr[], int startIndex, int n) {
        int minValue = arr[startIndex];
        int minIndex = startIndex;

        for (int i = minIndex + 1; i < n; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int index = indexOfMinimum(arr, i, n);
            swap(arr, i, index);
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Input ukuran Array : ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Input elemen ke-[" + (i + 1) + "] : ");
            arr[i] = in.nextInt();
        }

        selectionSort(arr, n);
        System.out.println("Sorted Array : ");
        printArray(arr, n);
    }

}
