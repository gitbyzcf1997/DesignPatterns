package com.zcf.dp.iterator.v7;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-7:38
 * @Description: com.zcf.dp.iterator.v3
 * @version: 1.0
 */

import com.zcf.dp.iterator.v7.Collection_;
import com.zcf.dp.iterator.v7.Iterator_;
import com.zcf.dp.iterator.v7.LinkedList_;

/**
 * v1：构建一个容器可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器共同接口，实现容器的替换
 * V4:如何对容器遍历呢？
 */
public class Main {
    public static void main(String[] args) {
        Collection_<String> list=new LinkedList_<>();
        for(int i=0;i<15;i++){
            list.add(new String("s"+i));
        }
        System.out.println(list.size());
        Iterator_<String> it=list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
