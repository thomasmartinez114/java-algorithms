import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=dictionaries-hashmaps&isFullScreen=true

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        // Create empty hashmap by String(word), Integer(# times it appears)
        HashMap<String, Integer> magMap = new HashMap<String, Integer>();

        boolean missingWord = false;

        // For-each for magazine words
        for (String magWord : magazine) { // for-each magWord within magazine[]
            if (!magMap.containsKey(magWord)) {
                magMap.put(magWord, 1); // putting the word at value 1
            } else {
                magMap.put(magWord, magMap.get(magWord) + 1);
            }
        }

        // For-each for note words
        for (String noteWord : note) { // for-each noteWord within note[]
            if (magMap.containsKey(noteWord)) {
                magMap.put(noteWord, magMap.get(noteWord) - 1); // decrementing value by 1
                if (magMap.get(noteWord) == 0) { // if value equals 0
                    magMap.remove(noteWord); // remove the word from hashmap if it's value is 0
                }
            } else {
                missingWord = true;
                break;
            }
        }
        // Teneray value
        String answer = missingWord ? "No" : "Yes";
        System.out.println(answer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

// Time: 01:06