package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

/**
 * 选择排序
 *
 * 算法思想：每次选取一个最小值，放在数组最前面
 *
 * 最好时间复杂度：O(n^2)
 * 最差时间复杂度：O(n^2)
 */
public class SelectionSort extends AbstractBaseSort {

    @Override
    void sort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < source.length; j++) {
                // 找到当前范围[j, length) 内的最小值索引
                if (source[minIndex] > source[j]) {
                    minIndex = j;
                }
            }
            // 交换
            ArrayUtils.exchange(source, minIndex, i);
        }
    }
}
