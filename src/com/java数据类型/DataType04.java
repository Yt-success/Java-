package com.java数据类型;

import java.util.Scanner;

/**
 * 求一个整数各个位上的和
 * 这个整数范围为0~1000例如987=9+8+7=22
 *思路：提取每个整数的个位数，十位数和百位数
 *
 */
public class DataType04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个整数：");
        int r=scanner.nextInt();
        int x=r%10;
        r=r/10;
        int y=r%10;
        r=r/10;
        int z=r%10;
        int sum=x+y+z;
        System.out.println("sum:"+sum);


    }
}
