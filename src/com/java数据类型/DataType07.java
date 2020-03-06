package com.java数据类型;

public class DataType07 {
    public static void main(String[] args){
        int x=10;
        int y=15;
        int sum=add(x,y);
        System.out.println("sum="+sum);

    }
    //方法的定义：[修饰符1，修饰符2，....]  整数类型  方法名（形式参数列表）
    public static int add(int n1,int n2){
        int sum=n1+n2;
        return  sum;
    }
}
