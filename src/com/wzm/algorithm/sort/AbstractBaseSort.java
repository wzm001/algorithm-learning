package com.wzm.algorithm.sort;

import com.wzm.algorithm.utils.ArrayUtils;

import java.util.Arrays;

/**
 * 模版类
 */
abstract class AbstractBaseSort {

    abstract void sort(int[] source);

    void doSort() {
        int[] array = ArrayUtils.generateRandomNumArray(30, 100);
        System.out.println("before:\t" + Arrays.toString(array));
        sort(array);
        System.out.println("after:\t" + Arrays.toString(array));
    }

    public static void main(String[] args) {
//        AbstractBaseSort sorter = new BubbleSort();
//        AbstractBaseSort sorter = new SelectionSort();
//        AbstractBaseSort sorter = new InsertionSort();
        AbstractBaseSort sorter = new MergeSort();
        sorter.doSort();
    }
}
