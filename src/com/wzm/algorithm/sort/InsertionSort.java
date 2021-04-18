package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

/**
 * 插入排序；
 *
 * 遍历数组，将小的元素插入到以排序的部分；
 *
 * 最好时间复杂度：O(n)
 * 最坏时间复杂度：O(n^2)
 */
public class InsertionSort extends AbstractBaseSort {
    @Override
    void sort(int[] source) {
        for (int i = 1; i < source.length; i++) {
            int insertIndex = i;
            while (insertIndex > 0) {
                // 和前一个相比
                if (source[insertIndex] < source[insertIndex - 1]) {
                    ArrayUtils.exchange(source, insertIndex, --insertIndex);
                } else {
                    break;
                }
            }
        }
    }
}
