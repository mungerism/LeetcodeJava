package com.utopia.leetcode.week;

public class N5546SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int length = releaseTimes.length;
        int maxTime = 0;
        char resChar = ' ';
        for (int i = 0; i < length; i++){
            if (i == 0){
                maxTime = releaseTimes[i];
                resChar = keysPressed.charAt(i);
            } else {
                int currTime = releaseTimes[i] - releaseTimes[i - 1];
                char currChar = keysPressed.charAt(i);
                if (currTime > maxTime || (currTime == maxTime && currChar > resChar)){
                    maxTime = currTime;
                    resChar = currChar;
                }
            }
        }

        return resChar;
    }
}
