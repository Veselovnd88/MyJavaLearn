package ru.codewars.fundamentals;

public class PosnNegs {
public static int[] posnnegs(int[] input) {

    if(input==null|| input.length==0){
      return new int[] {};
    }
    int[] result = new int[2];
    int c_pos = 0;
    int c_neg = 0;
    for (int i:input){
      if(i>0){
        c_pos+=1;
      }
      if(i<0){
        c_neg+=i;
      }
      result[0]=c_pos;
      result[1]=c_neg;
    }
      return result;
}
}
