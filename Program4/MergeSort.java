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
public class MergeSort {

    static void merge_sort(int i, int j, int a[], int aux[]) {
        if (j <= i) {
            return;
        }
        int mid = (i + j) / 2;
        merge_sort(i, mid, a, aux);
        merge_sort(mid + 1, j, a, aux);

        int pointer_left = i;
        int pointer_right = mid + 1;
        int k;
        for (k = i; k <= j; k++) {
            if (pointer_left == mid + 1) {
                aux[k] = a[pointer_left];
                pointer_right++;
            } else if (pointer_right == j + 1) {
                aux[k] = a[pointer_left];
                pointer_left++;
            } else if (a[pointer_left] < a[pointer_right]) {
                aux[k] = a[pointer_left];
                pointer_left++;
            } else {
                aux[k] = a[pointer_right];
                pointer_right++;
            }
        }

        for (k = i; k <= j; k++) {
            a[k] = aux[k];
        }
    }

    public static void main(String[] args) {
        int n, i, d, swap;
        int a[] = new int[100], aux[] = new int[100];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements in the array : ");
        n = in.nextInt();

        System.out.print("Enter " + n + " Integers\n");
        for (i = 0; i < n; i++) {
            System.out.print("Data [" + (i + 1) + "] : ");
            a[i] = in.nextInt();
        }
        merge_sort(0, n - 1, a, aux);
        System.out.println("\nPrinting the sorted array : ");
        for (i = 0; i < n; i++) {
            System.out.println("Data [" + (i + 1) + "] = " + a[i]);
        }
    }

}
