/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program6;

/**
 *
 * @author Mayor Kucing
 */
public class WadahAir {

    public static void main(String[] args) {
        int temp1, temp2;
        int[][] wadah = new int[2][2];
        wadah[0][0] = 3;
        wadah[0][1] = 5;

        temp1 = wadah[1][0] = 3;

        wadah[1][1] = temp1;

        wadah[1][0] = 1;
        if (wadah[1][1] != 4) {
            wadah[1][1] = 0;
        }
        temp2 = wadah[1][0];
        wadah[1][0] = 0;
        wadah[1][0] = 3;
        wadah[1][1] = temp2 + wadah[1][0];
        wadah[1][0] = 0;

        System.out.println("Jumlah wadah = " + wadah.length);
        for (int i = 0; i < wadah.length; i++) {
            System.out.println("Wadah[" + (i + 1) + "] dengan kapasitas = " + wadah[0][i]);
        }

        System.out.println("\nKapasitas air dalam wadah!");
        for (int i = 0; i < wadah.length; i++) {
            System.out.println("Wadah[" + (i + 1) + "] = " + wadah[1][i]);
        }

    }

}
