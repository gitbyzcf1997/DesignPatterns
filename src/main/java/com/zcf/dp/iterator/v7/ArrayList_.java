package com.zcf.dp.iterator.v7;


import com.zcf.dp.iterator.v7.Iterator_;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-16:03
 * @Description: com.zcf.dp.iterator.v7
 * @version: 1.0
 */
public class ArrayList_<E> implements Collection_<E> {
    E[] objects=(E[])new Object[10];
    private int index=0;
    @Override
    public void add(E o) {
        if(index==objects.length){
            E[] newObjects=(E[])new Object[objects.length*2];
             System.arraycopy(objects,0,newObjects,0,objects.length);
             objects=newObjects;
        }
        objects[index]=o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrListIterator();
    }

    private class ArrListIterator implements Iterator_ {
        private int currentIndex=0;
        @Override
        public boolean hasNext() {
            if(currentIndex>=index)return false;
            return true;
        }

        @Override
        public E next() {
            E o=objects[index];
            currentIndex++;
            return o;
        }
    }
}
