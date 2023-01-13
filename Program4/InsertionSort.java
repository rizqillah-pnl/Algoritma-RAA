/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program4;

import java.util.Scanner;

/**
 *
 * @author Mayor Kucing
 */
public class InsertionSort {

    static void insertion_sort(int A[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = A[i];
            int j = i;

            while (j > 0 && temp < A[j - 1]) {
                A[j] = A[j - 1];
                j = j - 1;
                A[j] = temp;
            }
        }
    }

    static void insertion(int arr[], int n) {
        int j, k, i;
        for (j = 1; j < n; j++) {
            k = arr[j];
            for (i = j - 1; i >= 0 && k < arr[i]; i--) {
                arr[i + 1] = arr[i];
            }
            arr[i + 1] = k;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[100], i, n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Enter elements [" + (i + 1) + "] : ");
            arr[i] = in.nextInt();
        }

        System.out.println("\nUnsorted List is : ");
        for (i = 0; i < n; i++) {
            System.out.println("Data [" + (i + 1) + "] : " + arr[i]);
        }
        System.out.println("");

        insertion(arr, n);
        System.out.println("Sorted List is : ");
        for (i = 0; i < n; i++) {
            System.out.println("Data [" + (i + 1) + "] : " + arr[i]);
        }
    }

}
