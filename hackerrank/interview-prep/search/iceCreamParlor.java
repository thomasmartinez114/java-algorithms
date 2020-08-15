import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
     * Problem: Use all the money that the two friends have to buy ice cream
     *
     * Note: n = 5 flavors Cost for flavors: [2, 1, 3, 5, 6] Money = 5 --- so they
     * would buy the flavors in index 1 & 3 == 5
     *
     * Parameters: cost: array of ints ::: money: int of the money available
     *
     * Input: first line contains t: # of trips to ice cream parlor each of the t
     * sets of 3 lines is: 1st line = money 2nd line = n = size of the arr cost 3rd
     * line = n = array of the cost
     *
     * Output: print two spaced seperated ints of the two flavors they can buy with
     * the money display in ascending order (small to large)
     */

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        // Array to print while testing
        int[] purchase = new int[] {0, 1};

        // Delcare empty hashmap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Add the indices to the map
        for (int i = 0; i < cost.length; i++) {
            if (!map.containsKey(cost[i])) { // if map doesnt have a key then add to spot 1
                map.put(cost[i], 1);
            } else {
                map.put(cost[i], map.get(cost[i]) + 1); // add to map + 1 for value
            }
            System.out.println(map);
        }
        System.out.println(purchase);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
