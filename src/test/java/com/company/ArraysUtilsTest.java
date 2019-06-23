package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraysUtilsTest {

    private ArraysUtils arraysUtils;

    @Before
    public void setUp(){
        arraysUtils=new ArraysUtils();
    }

    @Test
    public void binarySearchTest(){
        int[] array={1,3,5,7,9,10};
        int n=7;
        int result=arraysUtils.binarySearch(array,n);
        Assert.assertEquals(3, result);
    }

    @Test
    public void binarySearchTest2(){
        int[] array={1,3,5,7,9,10};
        int n=4;
        int result=arraysUtils.binarySearch(array,n);
        Assert.assertEquals(-3,result);
    }

    @Test
    public void bubbleSortTest(){
        int[] arr={4,5,2,6,1,3};
        arraysUtils.bubbleSort(arr);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6},arr);
    }





}
