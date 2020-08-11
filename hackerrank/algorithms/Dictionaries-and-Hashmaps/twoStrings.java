import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=dictionaries-hashmaps&isFullScreen=true
    /*
     * Problem: Determine if the two strings share the same substring. Substring can
     * be one letter to match Parameters are: s1, s2 which are the strings p is # of
     * test cases - # of pairs to check "hello" and "world" = YES they both share
     * "o" and "l"
     */

    /*
     * Psuedo: Use HashSet to store
     */

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        // Declare HashSets
        HashSet<Character> string1_chars = new HashSet<Character>();
        HashSet<Character> string2_chars = new HashSet<Character>();

        // Loop through the strings after spliting them
        for (int i = 0; i < s1.length(); i++) {
            string1_chars.add(s1.charAt(i)); // add the letters of s1 at charAt(i) index to string1
            // System.out.println(string1_chars);
        }

        for (int i = 0; i < s2.length(); i++) {
            string2_chars.add(s2.charAt(i)); // add the letters of s2 at charAt(i) index to string2
            // System.out.println(string2_chars);
        }

        string1_chars.retainAll(string2_chars); // delete anything in hashset that isn't in both of hashsets

        if (!string1_chars.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
