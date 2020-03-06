package com.java数据类型;

import java.util.Scanner;

/**
 * 编写程序,输出圆柱的面积和体积
 * 圆柱的面积是：底面积乘以二+矩形面积
 * 圆柱的体积是：底面积乘以高
 * 圆柱的面积是：π*r*r*2+2*r*h
 * 圆柱的体积是：π*r*r*h
 * 键盘输入
 */
public class DataType03 {
    public static void main(String[] args){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("请输入圆柱体的半径：");
        double r=scanner1.nextDouble();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("请输入圆柱体的高：");
        double h=scanner2.nextDouble();
        double area=Math.PI*r*r*2+2*r*h;
        double volume=Math.PI*r*r*h;
        System.out.println("圆柱体的面积为："+area);
        System.out.print("圆柱体的体积："+volume);



    }
}
