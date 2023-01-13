/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program3;

import java.util.Scanner;

public class Soal1 {

    static int sum;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Nilai : ");
        int nilai = in.nextInt();

        if (contoh7(nilai)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    static boolean contoh7(int nilai) {
        for (int i = 1; i < nilai; i++) {
            if (i == 1) {
                return false;
            } else {
                for (int j = 1; j <= nilai; j++) {
                    sum = sum + 2;
                }
            }
        }
        return true;
    }

}
