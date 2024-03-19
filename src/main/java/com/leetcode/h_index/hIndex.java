package com.leetcode.h_index;

import java.util.Arrays;

public class hIndex {
    // my solution
    // O(nlogn)
    public int calculate_hIndex(int[] citations) {
        Arrays.sort(citations);
        int hValue = 0;

        for(int i = 0; i < citations.length; i++) {
            // max possible hValue at that index
            int potential = citations.length - i;

            // if the current hValue is higher than the potential, we have found the hValue
            if(potential < hValue) {
                return hValue;
            }

            if(citations[i] < potential) {
                if(citations[i] > hValue) {
                    hValue = citations[i];
                }
            } else if(hValue < potential){
                hValue = potential;
            }
        }

        return hValue;
    }

    // not my solution - https://leetcode.com/problems/h-index/solutions/4686131/h-index-java-solution-beats-100-full-explanation
    // O(n)
    // example - { 1, 15, 3, 4 }
    public int better_calculate_hIndex(int[] citations) {
        int n=citations.length;
        int []freq=new int[n+1];
        
        // create buckets for citation frequency
        for(int i: citations){ 
            // hvalue cannot be higher than the number of papers, so all papers with a number of citations larger than the number of papers goes into the last bucket
            // in the example, the buckets would be { 0, 1, 0, 1, 2 }
            // 15 would go in the last bucket with 4
            if(i>n){ 
                freq[n]++;
            }else{
                freq[i]++;
            }
        }
        int cnt=0;
        
        // in the example, the first check would increase count to 2.  Since 2 is less than the index of 4, we continue
        // in the next loop, the count is increased to 3.  This matches the index of 3, so we have found our hvalue
        // there are 3 papers with at least 3 citations
        for(int i=n;i>=0;i--){
            cnt+=freq[i];

            // if the count is greater than the index(number of papers with i number of citations), then we have foudn the hvalue
            if(cnt>=i){
                return i;
            }
        }
        return 0;
    }
}
