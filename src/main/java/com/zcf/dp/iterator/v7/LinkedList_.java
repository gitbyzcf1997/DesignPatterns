package com.zcf.dp.iterator.v7;

import com.zcf.dp.iterator.v7.Iterator_;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-16:11
 * @Description: com.zcf.dp.iterator.v7
 * @version: 1.0
 */
public class LinkedList_<E> implements Collection_<E> {
    Node head=null;
    Node tail=null;
    private int index=0;
    @Override
    public void add(E o) {
        Node n=new Node(o);
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        tail=n;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new LinkedListIterator();
    }
    public class Node{
        E object;
        Node next;

        public Node(E object) {
            this.object = object;
        }
    }

    private class LinkedListIterator implements Iterator_<E> {
        Node h = null;
        private int currentIndex=1;
        @Override
        public boolean hasNext() {
            if(currentIndex>=index)return false;
            return true;
        }

        @Override
        public E next() {
            if(h==null){
                h=head;
            }
            Node next = h.next;
            E o = next.object;
            h=next;
            currentIndex++;
            return o;
        }
    }
}
