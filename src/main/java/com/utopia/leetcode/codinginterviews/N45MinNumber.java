package com.utopia.leetcode.codinginterviews;

import java.util.Arrays;

public class N45MinNumber {

    public String minNumber(int[] nums) {

        String[] strings = new String[nums.length];

        for (int i = 0; i < nums.length; i++){
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        StringBuffer stringBuffer = new StringBuffer();
        for (String string : strings) {
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {30,3,34,5,9};

        N45MinNumber n45MinNumber = new N45MinNumber();
        System.out.println(n45MinNumber.minNumber(nums));
    }
}
