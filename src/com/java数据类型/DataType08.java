package com.java数据类型;

/**
 * 参数重载
 * 只有参数名称发生改变，不构成重载
 * 只有返回值不同，不构成重载
 *
 */
public class DataType08 {
    public static void main(String[] args){
        int sum=add(1,2,3);
        System.out.println(sum);

    }
    private  static int add(int n1, int n2){
        int sum=n1+n2;
        return sum;
    }
    private  static int add(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        return sum;
    }
}
