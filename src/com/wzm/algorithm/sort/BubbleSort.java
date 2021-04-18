package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

import java.util.Arrays;

/**
 * 冒泡排序；
 *
 * 算法思想：遍历数组，每次将最大的一个数移动到最后；
 * 如何确定最大数：当前数如果大于下一个数，就交换；
 *
 * 最差时间复杂度：O(N^2)
 * 最好时间复杂度：O(N)
 */
public class BubbleSort extends AbstractBaseSort {

    @Override
    void sort(int[] source) {
        int border = source.length - 1;
        boolean exchangeFlag;
        do {
            exchangeFlag = false;
            for (int i = 0; i < border; i++) {
                if (source[i] > source[i + 1]) {
                    ArrayUtils.exchange(source, i, i + 1);
                    exchangeFlag = true;
                }
            }
            border--;
        } while (exchangeFlag);
    }
}
