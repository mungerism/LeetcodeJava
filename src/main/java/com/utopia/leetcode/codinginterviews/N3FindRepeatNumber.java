package com.utopia.leetcode.codinginterviews;

import java.util.HashSet;

public class N3FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : nums) {
            if (!set.add(value)) {
                return value;
            }
        }
        return 0;
    }
}
