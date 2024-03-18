package com.leetcode.remove_duplicates_between_arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesBetweenArrays {
    public static void main(String[] args) {
        RemoveDuplicatesBetweenArrays app = new RemoveDuplicatesBetweenArrays();
        int[] a = new int[] {1, 2, 2};
        int[] b = new int[] {2};

        int[] c = app.arrayDiff(a, b);

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public int[] arrayDiff(int[] a, int[] b) {
        if(a.length == 0 || b.length == 0) {
            return a;
        }

        Map<Integer, Integer> nums = new HashMap<>();

        for(int i = 0; i < a.length; i++) {
            int value = nums.getOrDefault(a[i], -1);

            if(value == -1) {
                nums.putIfAbsent(a[i], 1);
            } else {
                nums.replace(a[i], ++value);
            }
        }

        int count = a.length;

        for(int i = 0; i < b.length; i++) {
            int value = nums.getOrDefault(b[i], -1);

            if(value != -1) {
                count -= value;
                nums.remove(b[i]);
            }
        }

        int[] c = new int[count];
        int index = 0;
        for(int i = 0; i < a.length; i++) {
            int value = nums.getOrDefault(a[i], -1);

            if(value != -1) {
                c[index] = a[i];
                index++;
            }
        }

        return c;
    }
}
