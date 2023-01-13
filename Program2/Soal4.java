/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;

/**
 *
 * @author Mayor Kucing
 */
public class Soal4 {

    static double temp = 0;

    public static void main(String[] args) {
        double i, temp = 0, n = 4;
        for (i = 1; i <= n; i++) {
            temp = temp + (i) / 2;
            System.out.println(temp);
        }
        System.out.println("\n" + temp);
//
//        for (i = 8; i >= 0; i--) {
//            temp = temp + (i) / 2;
//            System.out.println(temp);
//        }
//        System.out.println("\n" + temp);
        System.out.println(algoritma(4));
    }

    static double algoritma(double n) {
        System.out.println(n);
        if (n == 0) {
            return 1;
        }

        return temp += algoritma(n - 1) / 2;
    }

}
