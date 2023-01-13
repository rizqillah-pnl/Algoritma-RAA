/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

/**
 *
 * @author Mayor Kucing
 */
public class BruteForce {

    public static void main(String[] args) {
        int data[] = {4, 2, 6, 3, 1, 7, 9, 8};
        int maks = data[0];
        int index = 0;

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data[" + (i + 1) + "] : " + data[i]);
        }

        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
                index = i + 1;
            }
        }
        System.out.println("Nilai Maksimum adalah : " + maks + " Berada di Data[" + index + "]");
    }

}
