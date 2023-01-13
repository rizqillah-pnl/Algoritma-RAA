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
public class Strassen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[2][2], b[][] = new int[2][2], c[][] = new int[2][2], i, j;
        int m1, m2, m3, m4, m5, m6, m7;

        System.out.println("Enter the 4 elements of first matrix : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Data [" + (i + 1) + "][" + (j + 1) + "] : ");
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("\nEnter the 4 elements of second matrix : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Data [" + (i + 1) + "][" + (j + 1) + "] : ");
                b[i][j] = in.nextInt();
            }
        }

        System.out.println("\nThe first matrix is ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Data [" + (i + 1) + "][" + (j + 1) + "] : " + a[i][j]);
            }
        }

        System.out.println("\nThe second matrix is ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Data [" + (i + 1) + "][" + (j + 1) + "] : " + b[i][j]);
            }
        }

        m1 = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
        m2 = (a[1][0] + a[1][1]) * b[0][0];
        m3 = a[0][0] * (b[0][1] - b[1][1]);
        m4 = a[1][1] * (b[1][0] - b[0][0]);
        m5 = (a[0][0] + a[0][1]) * b[1][1];
        m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        m7 = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1]);

        c[0][0] = m1 + m4 - m5 + m7;
        c[0][1] = m3 + m5;
        c[1][0] = m2 + m4;
        c[1][1] = m1 - m2 + m3 + m6;

        System.out.println("\nAfter multiplication using ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Data [" + (i + 1) + "][" + (j + 1) + "] : " + c[i][j]);
            }
        }
    }

}
