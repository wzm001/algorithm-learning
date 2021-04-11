package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

import java.util.Arrays;

/**
 * 冒泡排序；
 *
 * 算法思想：遍历数组，每次将最大的一个数移动到最后；
 * 如何确定最大数：当前数如果大于下一个数，就交换；
 *
 * 时间复杂度：O(N*N)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateRandomNumArray(30, 100);
        System.out.println("before:\t" + Arrays.toString(array));
        sort(array);
        System.out.println("after:\t" + Arrays.toString(array));
    }

    private static void sort(int[] source) {
        int border = source.length - 1;
        boolean exchangeFlag;
        do {
            exchangeFlag = false;
            for (int i = 0; i < border; i++) {
                if (source[i] > source[i + 1]) {
                    int temp = source[i];
                    source[i] = source[i + 1];
                    source[i + 1] = temp;
                    exchangeFlag = true;
                }
            }
            border--;
        } while (exchangeFlag);
    }
}
