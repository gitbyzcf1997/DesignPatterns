package com.zcf.dp.iterator.v3;

import java.util.Collection;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-7:35
 * @Description: com.zcf.dp.iterator.v3
 * @version: 1.0
 */
public class LinkedList_ implements Collection_ {
    Node head=null;
    Node tail=null;
    private int size=0;
    @Override
    public void add(Object o) {
        Node n = new Node(o);
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        tail=n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }
    public class Node{
        Object object;
        Node next;
        public Node(Object object) {
            this.object = object;
        }
    }
}
