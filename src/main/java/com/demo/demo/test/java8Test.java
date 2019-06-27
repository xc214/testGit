package com.demo.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8Test {
  public static void main(String[] args){
    Thread td = new Thread(new Runnable() {
      @Override
      public void run() {
        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","LaMBDA"});
        List<String> lowerNames = proNames.stream().map(name -> name.toLowerCase()).collect(
            Collectors.toList());
        for (String str : lowerNames){
          System.out.println(str);
        }
        lowerNames.forEach(System.out::println);
      }
    });
    td.start();

    Thread td1 = new Thread(()-> System.out.println("hello,lambda"));
    td1.start();
  }
}
