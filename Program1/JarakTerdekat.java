/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.util.Scanner;

/**
 *
 * @author Mayor Kucing
 */
public class JarakTerdekat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Jumlah Array : ");
        int n = in.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input Elemen ke-[" + (i + 1) + "] : ");
            A[i] = in.nextInt();
        }

        int dmin = 1000000000;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {
                    dmin = 0;
                } else if ((A[i] - A[j]) < dmin) {
                    dmin = A[i] - A[j];
                }
            }
        }

        System.out.println("Jarak terpendek adalah = " + Math.abs(dmin));
    }
}
