// https://www.hackerrank.com/challenges/gem-stones/problem?h_r=internal-search&isFullScreen=false

// Solve in pseudo code first
// Look up how to use HashSet
// Then have Jethro or Milo interview me

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        int gemstones = 0;

        for (int rock = 0; rock < arr.length; rock++) {
            // System.out.println(arr[i]);
            for (char mineral = 0; mineral < arr[rock].length(); mineral++){
                // if (arr[rock][mineral])
                // System.out.println("Minerals in rock " + arr[rock].charAt(mineral));
                if (arr[rock].charAt(mineral) == arr[1].charAt(mineral))
                    gemstones++;
            }
            // System.out.println(arr[rock]);
        }
        return 5;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
