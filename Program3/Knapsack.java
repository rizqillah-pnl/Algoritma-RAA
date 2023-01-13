/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program3;

/**
 *
 * @author Mayor Kucing
 */
public class Knapsack {

    public static void main(String args[]) {
        //weights
        int weight[] = {0, 1, 2, 1, 3};
        //values
        int value[] = {0, 10, 7, 11, 15};

        //Taking Knapsack weight as 5
        KnapsackDP kdp = new KnapsackDP(5, 4, weight, value);
        System.out.println("Total Benefit: " + kdp.solve());

        //To print which items are selected
        kdp.selected_items();

        kdp.Bobot();
    }
}

class KnapsackDP {

    int knapsack_weight;
    int n;
    int weight[];
    int value[];
    int memoTable[][];

    public KnapsackDP(int W, int N, int weight[], int value[]) {
        this.knapsack_weight = W;
        this.n = N;
        this.weight = weight;
        this.value = value;
        this.memoTable = new int[N + 1][W + 1];
    }

    public int solve() {
        //compute and fill the table
        for (int i = 1; i < (n + 1); i++) {
            for (int j = 1; j < (knapsack_weight + 1); j++) {
                //when not including the item
                int not_taking_item = memoTable[i - 1][j];
                //when including the item
                int taking_item = 0;
                if (weight[i] <= knapsack_weight) {
                    if (j - weight[i] < 0) {
                        taking_item = memoTable[i - 1][j];
                    } else {
                        taking_item = value[i] + memoTable[i - 1][j - weight[i]];
                    }
                }

                //store the larger value in the memo table
                memoTable[i][j] = Math.max(not_taking_item, taking_item);
            }
        }
        //return the max value for the given knapsack weight
        return memoTable[n][knapsack_weight];
    }

    //Function to output included items
    public void selected_items() {
        System.out.print("{");
        for (int i = n, j = knapsack_weight; i > 0; i--) {
            if (memoTable[i][j] != memoTable[i - 1][j]) {
                System.out.print(i + ",");
                j = j - weight[i];
            }
        }
        System.out.println("}");
    }

    public void Bobot() {
        int jum = 0;
        for (int i = n, j = knapsack_weight; i > 0; i--) {
            if (memoTable[i][j] != memoTable[i - 1][j]) {
                jum += weight[i - 1];
                j = j - weight[i];
            }
        }
        System.out.println("Bobot : " + jum);
    }
}
