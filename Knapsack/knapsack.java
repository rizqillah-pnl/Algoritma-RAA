package Knapsack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Zack
 */
public class knapsack {

    Vector<Integer> objects = new Vector<>();
    Vector<Float> profits;
    Vector<Float> weights;
    Vector<String> advertise;
    float maxWeights;
    int nbr_objects;
    int[] result; // to convert from decimal into binary
    String sumProfits_sumWeights = "";

    public knapsack(int nbr_objects, Vector<String> adv, Vector<Float> weights, Vector<Float> profits, float maxWeights) {
        this.profits = profits;
        this.weights = weights;
        this.nbr_objects = nbr_objects;
        this.advertise = adv;
        this.maxWeights = maxWeights;
        for (int i = 0; i < nbr_objects; i++) {
            objects.add(i);
        }
        result = new int[nbr_objects];

    }

    int[] ToBinary(int number) {
        int i = nbr_objects - 1;
        while (0 <= i) {
            int k = number % 2;
            number = number / 2;
            result[i] = k;
            i--;
        }
        return result;
    }

    void solve() {
        int number = 1;
        int max_profits = 0, max_weights = 0;
        int[] array_result = null;
        String s = "";
        while (number <= Math.pow(2, nbr_objects) - 1) {
            int sum_wheights = 0, sum_profits = 0;
            array_result = ToBinary(number);
            for (int i = 0; i < array_result.length; i++) {
                sum_wheights += array_result[i] * weights.elementAt(i);
                sum_profits += array_result[i] * profits.elementAt(i);
            }
            if (sum_wheights <= maxWeights) {
                sumProfits_sumWeights += showVector(array_result)
                        + " time : " + sum_wheights + " price : " + sum_profits + "\n";
                if (max_profits < sum_profits) {
                    max_profits = sum_profits;
                    max_weights = sum_wheights;
                    s = showVector(array_result);
                }
            }
            number++;
        }
        sumProfits_sumWeights += "MAXIMUM PRICE : " + max_profits + " ITS TIME " + max_weights + " THE ADVERTISES ARE : "
                + showObjects(s);
    }

    String showVector(int[] result) {
        String s = "";
        for (int i = 0; i < result.length; i++) {
            s = s + result[i] + "";
        }
        return s;
    }

    private String showObjects(String s) {
        String obj = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                obj += " " + advertise.get(i);
            }
        }
        return obj;
    }
}
