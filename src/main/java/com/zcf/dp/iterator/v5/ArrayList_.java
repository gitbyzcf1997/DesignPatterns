package com.zcf.dp.iterator.v5;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-7:31
 * @Description: com.zcf.dp.iterator.v3
 * @version: 1.0
 */
public class ArrayList_ implements Collection_ {
    Object[] objects=new Object[10];
    private int index=0;
    public void add(Object o){
        if(index==objects.length){
            Object[] newObjects=new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects=newObjects;
        }
        objects[index]=o;
        index++;
    }
    public int size(){
        return index;
    }

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }
    private class ArrayListIterator implements Iterator_{
        private int currentIndex=0;
        @Override
        public boolean hasNext() {
            if(currentIndex>=index)return false;
            return true;
        }

        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
