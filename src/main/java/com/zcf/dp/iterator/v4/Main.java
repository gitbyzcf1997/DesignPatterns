package com.zcf.dp.iterator.v4;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-7:38
 * @Description: com.zcf.dp.iterator.v3
 * @version: 1.0
 */

/**
 * v1：构建一个容器可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器共同接口，实现容器的替换
 * V4:如何对容器遍历呢？
 */
public class Main {
    public static void main(String[] args) {
        Collection_ arr=new LinkedList_();
        for(int i=0;i<15;i++){
            arr.add(new String("s"+i));
        }
        System.out.println(arr.size());
        ArrayList_ al=(ArrayList_) arr;
//        for(int i=0;i<al.size();i++){
//            //如果用这种方式遍历，就不能实现通用了
//        }
    }
}
