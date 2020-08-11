public class sockMerchant {
    
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D%5B%5D=warmup

    // https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

    // Complete the sockMerchant function below.

    /*
     * The Problem the sockMerchant method accepts 2 arguments; one argument is the
     * length of second argument which is an array of integers and the second
     * argument is an array of integers that represent colors of socks. Count the
     * pairs of socks Return an integer that represents the number of pairs found in
     * the array
     */

    /*
     * Psuedo Code Create a counter which is an integer to represent pairs of socks
     * Create a hashmap to create key value pairs which will contain the color as
     * the key and the amount as the number of socks Do not count odd number of
     * pairs, only evenly matched pairs. Return number of pairs
     */

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;

        // declared empty hashmap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Add ar indexes to the map
        for (int i = 0; i < ar.length; i++) {
            if (!map.containsKey(ar[i])) {
                map.put(ar[i], 1);
            } else {
                map.put(ar[i], map.get(ar[i]) + 1);
            }
        }

        // System.out.println(map);

        // Loop through the hashmap
        for (Map.Entry socks : map.entrySet()) {
            System.out.println(pairs += (int) socks.getValue() / 2);
        }
        return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

// Time: 01:00:00
