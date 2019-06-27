package com.demo.demo.test;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arry = {66, 43, 1, 78, 5, 39, 14, 2, 51};
    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.sort(arry);
  }

  public void sort(int[] arrys) {
    for (int i =1;i<arrys.length;i++){
      for (int k=0;k<arrys.length-1;k++){
        if(arrys[k]>arrys[k+1]){
          int temp = arrys[k];
          arrys[k] = arrys[k+1];
          arrys[k+1] = temp;
        }
      }
    }
    showData(arrys);

  }

  public void showData(int[] arrys){
    System.out.println("********排序后的数据为*********");
    for (int s:arrys){
      System.out.println(s);
    }
  }
}