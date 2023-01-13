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
public class Soal5 {

    static void bubbleSort(int arr[], int n) {
        int i, j, temp, flag = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                flag = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = 1;
                }
            }
            if (flag != 1) {
                break;
            }
        }
        System.out.println("Sorted Array : ");
        for (i = 0; i < n; i++) {
            System.out.println("[" + (i + 1) + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        int arr[] = new int[100];
        System.out.print("Input jumlah elemen : ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Masukkan Elemen ke-[" + (i + 1) + "] : ");
            arr[i] = in.nextInt();
        }

        bubbleSort(arr, n);
    }

}
