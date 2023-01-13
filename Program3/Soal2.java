/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program3;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Nilai : ");
        int nilai = in.nextInt();

        System.out.println("Hasil Rekursif = " + func(nilai));

    }

    static int func(int nilai) {
        if (nilai <= 1) {
            return 1;
        }
        return func(nilai - 1) + func(nilai - 1);
    }
}
