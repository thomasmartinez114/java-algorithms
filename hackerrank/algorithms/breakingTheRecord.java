//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=internal-search&isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        // inputs gamesPlayed
        // scores in array.

        // return int array of times she broke her highest score and lowest

        // System.out.println(scores);

        int[] records = new int[] {0, 0};
       
        int highestScore = scores[0];
        int lowestScore = scores[0]; 

        for (int gameScore = 1; gameScore < scores.length; gameScore++) {
            // System.out.println(scores[gameScore]);
            int highestCount = 0;
            int lowestCount = 0;

            if (scores[gameScore] > highestScore) {
                highestScore = scores[gameScore];
                //System.out.println("Highest score: " + highestScore);
                records[0]++;
            }

            if (scores[gameScore] < lowestScore) {
                lowestScore = scores[gameScore];
                //System.out.println("Lowest score: " + lowestScore);
                records[1]++;
            }
        }
         
        return records;

    }