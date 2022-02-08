package com.zcf.dp.iterator.v7;

import com.zcf.dp.iterator.v7.Iterator_;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-7:31
 * @Description: com.zcf.dp.iterator.v3
 * @version: 1.0
 */
public interface Collection_<E>{
    void add(E o);
    int size();
    Iterator_<E> iterator();
}
