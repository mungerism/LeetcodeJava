package com.utopia.leetcode.codinginterviews;

public class N5ReplaceSpace {

    public String replaceSpace01(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                result.append("%20");
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
