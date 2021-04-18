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

    public static void exchange(int[] array, int fromIndex, int toIndex) {
        int temp = array[fromIndex];
        array[fromIndex] = array[toIndex];
        array[toIndex] = temp;
    }

    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 合并两个已经排序的数组
     * @param array1    数组1
     * @param array2    数组2
     * @return  合并后的数组
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        if (isEmpty(array1)) {
            return array2;
        }
        if (isEmpty(array2)) {
            return array1;
        }
        int[] result = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 == array1.length) {
                result[i] = array2[index2++];
                continue;
            }
            if (index2 == array2.length) {
                result[i] = array1[index1++];
                continue;
            }
            result[i] = array1[index1] >= array2[index2] ? array2[index2++] : array1[index1++];
        }
        return result;
    }

    public static int[][] splitArray(int[] array) {
        if (isEmpty(array) || array.length == 1) {
            throw new IllegalArgumentException("illegal array: " + Arrays.toString(array));
        }
        int middle = array.length / 2;
        int[] a = new int[middle];
        int[] b = new int[array.length - middle];
        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                a[i] = array[i];
            } else {
                b[i - middle] = array[i];
            }
        }
        return new int[][]{a, b};
    }
}
