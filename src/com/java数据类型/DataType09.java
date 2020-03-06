package com.java数据类型;

/**
 * 应用递归函数计算n！
 * 与此同时计算耗费时间System.currentTimeMillis
 * 递归的优点：简单
 * 缺点：递归会调用大量的堆栈，内存耗用多。
 */
public class DataType09 {
    public static void main(String[] args){
        long d1=System.currentTimeMillis();
        System.out.printf("%d的阶乘为%s%n",10,Factories(10));
        long d2=System.currentTimeMillis();
        System.out.printf("递归时间：%s%n",d2-d1);
    }
    static long Factories(int n){
        if(n==1){
            return n;
        }else {
            return Factories(n-1)*n;
        }
    }
}
