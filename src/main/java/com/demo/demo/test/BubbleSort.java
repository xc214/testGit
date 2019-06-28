package com.demo.demo.test;

public class BubbleSort {
  /**
   * 冒泡排序
   * @param arrys
   */
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

  public void resort(int[] arrys) {
    for (int i =1;i<arrys.length;i++){
      for (int k=0;k<arrys.length-1;k++){
        if(arrys[k]<arrys[k+1]){
          int temp = arrys[k];
          arrys[k] = arrys[k+1];
          arrys[k+1] = temp;
        }
      }
    }
    showData(arrys);
  }

  public void showData(int[] arrys){
    System.out.println("********冒泡排序后的数据为*********");
    for (int s:arrys){
      System.out.println(s);
    }
  }
}