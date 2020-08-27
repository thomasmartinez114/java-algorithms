import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    /*
     * Problem: Find where both kangaroos are at same location
     * Kangaroo 1 : (start) x1 = 2, (jump) v1 = 1
     * Kangaroo 2 : (start) x2 = 1, (jump) v2 = 2
     * Solution: print YES if on same location, print NO if not
     *
     * 0 3 4 2 = x1 v1 x2 v2
     * // int kang1 = (x1 + v1) * [i];
     * // int kang2 = (x2 + v2) * [i];
    */

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        String match = "NO";

        while (x2 > x1) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2) {
                match = "YES";
                break;
            } 
        }
            return match;
    }

        // // Loop through and multiple the addition of the kangaroo jumps
        // for (int jumps = 1; jumps <= 10000; jumps++) {
        //     if ( (x1 + v1) * jumps == (x2 + v2) * jumps) {
        //         System.out.println("YES");
        //     } else {
        //         System.out.println("NO");
        //     }
        // }
        // return match;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
