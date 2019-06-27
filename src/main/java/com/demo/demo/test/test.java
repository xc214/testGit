package com.demo.demo.test;



public class test {
  public static void main(String[] args){
    String  str = "HEllo World";
    String s = str.toLowerCase();
    String[] strs = new String[5];
    for (int i=0;i<strs.length;i++){
      strs[i]="第"+i+"个数是："+i*i;
    }
    for (String string:strs){
      System.out.println(string);
    }

  }

}
