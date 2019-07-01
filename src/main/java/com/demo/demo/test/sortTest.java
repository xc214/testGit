package com.demo.demo.test;

import java.util.Random;

public class sortTest {
  public static void main(String[] args){
    int[] arrys = {12,55,43,21,1,67,33,75,2,6,28};
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(arrys);
    int[] arrysTest = new int[10];
    for(int i =0;i<arrysTest.length;i++){
      int temp = (int) (Math.random()*100);
      arrysTest[i]=temp;
    }
    SelectSort selectSort = new SelectSort();
    selectSort.sort(arrysTest);


  }

}
