package com.leetcode.recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(new ArraySum().arraySum(arr));
        System.out.println(new ArrayMax().arrayMax(arr));
        System.out.println(new BinarySearch().binarySearch(arr, 4));

        int[] arrMax = new int[] { 4, 6, 8, 2, 3, 1 };
        System.out.println(new ArrayMax().arrayMax(arrMax));

        int[] arrSearch = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(new BinarySearch().binarySearch(arrSearch, 5));

        int[] notFound = new int[] { 1, 2, 3, 5, 6 };
        System.out.println(new BinarySearch().binarySearch(notFound, 4));
    }
}
