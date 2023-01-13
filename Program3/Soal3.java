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
public class Soal3 {

    public static void main(String[] args) {
        int x, prima = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        x = in.nextInt();
        if (x < 2) {
            prima = 0;
        } else {
            if (x == 2) {
                prima++;
            } else {
                for (int i = 2; i <= x; i++) {
                    if (x % i == 0) {
                        prima++;
                    }
                }
            }
        }

        if (prima == 1) {
            System.out.println(x + " Bilangan Prima!");
        } else {
            System.out.println(x + " Bukan Bilangan Prima!");
        }
    }

}
