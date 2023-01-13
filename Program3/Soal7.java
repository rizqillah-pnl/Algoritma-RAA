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
public class Soal7 {

    public void itemDipilih(int W, int[] wt, int[] p, int n) {
        int Infinit = Integer.MIN_VALUE;
        int[][] temp = new int[n + 1][W + 1];
        int[][] solusi = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                int m1 = temp[i - 1][j];
                int m2 = Infinit;
                if (j >= wt[i]) {
                    m2 = temp[i - 1][j - wt[i]] + p[i];
                }
                temp[i][j] = Math.max(m1, m2);
                solusi[i][j] = m2 > m1 ? 1 : 0;
            }
        }
        int[] dipilih = new int[n + 1];
        for (int N = n, w = W; N > 0; N--) {
            if (solusi[N][w] != 0) {
                dipilih[N] = 1;
                w = w - wt[N];
            } else {
                dipilih[N] = 0;
            }
        }

        System.out.print("\nItem dengan Berat {");
        for (int i = 1; i < n + 1; i++) {
            if (dipilih[i] == 1) {
                System.out.print(wt[i] + ",");
            }
        }
        System.out.println("} dipilih!");

        System.out.print("Item dengan Keuntungan {");
        for (int i = 1; i < n + 1; i++) {
            if (dipilih[i] == 1) {
                System.out.print(p[i] + ",");
            }
        }
        System.out.println("} dipilih!");
    }

    public void maxProfit(int W, int wt[], int p[], int n) {
        int i, j;
        int K[][] = new int[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    K[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    K[i][j] = Math.max(p[i - 1] + K[i - 1][j - wt[i - 1]], K[i - 1][j]);
                } else {
                    K[i][j] = K[i - 1][j];
                }
            }
        }
        System.out.println("Total Profit : " + K[n][W]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Soal7 knapsack = new Soal7();

        System.out.print("Input Jumlah Elemen (N) : ");
        int n = scan.nextInt();

        int[] wt = new int[n + 1];
        int[] p = new int[n + 1];

        System.out.print("Masukkan Kapasitas Total : ");
        int W = scan.nextInt();

        System.out.println("\nBerat(Bobot) ");
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan Bobot elemen ke-" + i + " : ");
            wt[i] = scan.nextInt();
        }
        System.out.println("");
        System.out.println("Profit(Keuntungan) ");
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan Profit elemen ke-" + i + " : ");
            p[i] = scan.nextInt();
        }

        knapsack.itemDipilih(W, wt, p, n);
        knapsack.maxProfit(W, wt, p, n);
    }
}
