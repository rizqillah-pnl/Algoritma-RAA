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
public class SequensialNama {

    public static void main(String[] args) {
        String nama[] = {"Abdurrazaq", "Annisa", "Isnani", "Mesti",
            "Salma", "Hafidl", "Sharhan", "Rizqillah", "Alfath"};
        Scanner in = new Scanner(System.in);

        System.out.println("Daftar Nama");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("[" + (i + 1) + "] " + nama[i]);
        }

        System.out.print("Input Nama Yang Dicari : ");
        String name = in.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if (name.equalsIgnoreCase(nama[i])) {
                System.out.println("Nama ditemukan di Elemen : " + (i + 1));
            }
        }

    }
}
