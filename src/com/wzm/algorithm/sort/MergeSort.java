package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

import java.util.Arrays;

/**
 * 归并排序
 *
 * 将数组拆分为小数组排序，然后合并结果；
 * 采用递归的方式实现
 *
 * 最简单的情况：数组只有一个元素，无需排序，直接返回；
 * 合并两个已经排序的数组
 */
public class MergeSort extends AbstractBaseSort {
    @Override
    void sort(int[] source) {
        // 考虑一下，为什么下面的代码不会改变source的数据
        // source = innerSort(source);
        // 修改source的原始数据
        System.arraycopy(innerSort(source), 0, source, 0, source.length);
    }

    private int[] innerSort(int[] source) {
        if (source.length == 1) {
            return source;
        }
        // 拆分数组
        int[][] splitArray = ArrayUtils.splitArray(source);
        // 分别排序
        int[] array1 = innerSort(splitArray[0]);
        int[] array2 = innerSort(splitArray[1]);
        // 合并
        return ArrayUtils.mergeSortedArrays(array1, array2);
    }
}
