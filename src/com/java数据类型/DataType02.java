package com.java数据类型;

import java.util.Scanner;

/**
 * 2.将摄氏温度转换成华氏温度
 * 摄氏温度与华氏温度的转化：华氏温度（F=9/5*C+32）
 */
public class DataType02 {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a degree of calsius:");
        double calsius=scanner.nextDouble();
        double Fahrenheit=(9.0/5)*calsius+32;
        System.out.println(calsius+"摄氏温度转化为华氏温度为"+Fahrenheit);
    }
}
