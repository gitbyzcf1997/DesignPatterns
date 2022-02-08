package com.zcf.dp.iterator.v1;



/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-0:51
 * @Description: com.zcf.dp.iterator.v1
 * @version: 1.0
 */

/**
 * 数组实现容器
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for(int i=0;i<15;i++){
            list.add(new String("s"+i));
        }
        System.out.println(list.size());
    }
}

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_{
    Object[] objects=new Object[10];
    private int index=0;
    public void add(Object o){
        if(index==objects.length){
            Object[] newObjects = new Object[this.objects.length * 2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects=newObjects;
        }
        objects[index]=o;
        index++;
    }
    public int size(){
        return index;
    }
}
