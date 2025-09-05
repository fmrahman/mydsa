package com.mfr.dsa.twopointers;

import java.util.*;

public class SortColors {
    public static int[] sortColors(int[] colors) {

        int white = 0, red = 0;
        int blue = colors.length - 1;

        while (white <= blue) {

            if (colors[white] == 0) {
                swap(colors, white, red);
                ++white;
                ++red;
            } else if (colors[white] == 1) {
                ++white;
            } else {
                swap(colors, white, blue);
                --blue;
            }

        }

        return colors;
    }

    public static void swap (int [] colors, int from, int to) {
        int temp;
        temp = colors[from];
        colors[from] = colors[to];
        colors[to] = temp;
    }
}