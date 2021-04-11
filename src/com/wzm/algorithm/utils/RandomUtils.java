package com.wzm.algorithm.utils;

import java.util.Random;

/**
 * 随机相关
 */
public class RandomUtils {

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    public static int generateInteger(int max) {
        return RANDOM.nextInt(max);
    }

    public static int generateInteger() {
        return generateInteger(Integer.MAX_VALUE);
    }
}
