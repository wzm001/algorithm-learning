package com.wzm.algorithm.utils;

import java.util.Arrays;

/**
 * 数组相关
 */
public class ArrayUtils {

    public static int[] generateRandomNumArray(int size, int max) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = RandomUtils.generateInteger(max);
        }
        return result;
    }
}
