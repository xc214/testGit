package com.demo.demo.test;

public class SelectSort {

  public void sort(int[] arrys){
    int index;
    for (int i=1;i<arrys.length;i++){
      index = 0;
      for (int k=1;k<=arrys.length-i;k++){
        if(arrys[k]>arrys[index]){
          index = k;
        }
      }
      int temp = arrys[index];
      arrys[index] = arrys[arrys.length-i];
      arrys[arrys.length-i] = temp ;
    }
    showData(arrys);
  }

  public void showData(int[] arrys){
    System.out.println("********选择排序后的数据为*********");
    for (int s:arrys){
      System.out.println(s);
    }
  }

}
