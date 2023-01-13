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
public class MaxMinDnC {

    static int max, min, a[];

    static void maxmin(int i, int j) {
        int max1, min1, mid;
        if (i == j) {
            max = min = a[i];
        } else {
            if (i == j - 1) {
                if (a[i] < a[j]) {
                    max = a[j];
                    min = a[i];
                } else {
                    max = a[i];
                    min = a[j];
                }
            } else {
                mid = (i + j) / 2;
                maxmin(i, mid);
                max1 = max;
                min1 = min;
                maxmin(mid + 1, j);
                if (max < max1) {
                    max = max1;
                }
                if (min > min1) {
                    min = min1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int i, num;
        a = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total of numbers : ");
        num = in.nextInt();
        System.out.print("Masukkan Nomor : ");
        for (i = 1; i <= num; i++) {
            a[i] = in.nextInt();
            max = a[0];
            min = a[0];
            maxmin(1, num);
            System.out.println("Minimum Element in an array : " + min);
            System.out.println("Maximum Element in an array : " + max);
        }
    }

}
