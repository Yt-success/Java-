package com.java数据类型;

/**
 * while与do-while的区别
 * while语句先循环后执行
 * do-while先执行后循环
 */
public class DataType06 {
    public static void main(String[] args){
        int i=-1;
        while(i<0){
            System.out.println(i);
            i++;
        }
        System.out.println("---------");
        do{
           System.out.println(i);
           i++;
        }while(i<0);
    }
}
