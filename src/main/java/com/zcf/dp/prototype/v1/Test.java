package com.zcf.dp.prototype.v1;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-1:37
 * @Description: com.zcf.dp.prototype.v1
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age+" "+p2.score);
        System.out.println(p2.loc);
        System.out.println(p1.loc==p2.loc);
        p1.loc.street="sh";
        System.out.println(p2.loc);
    }
}
class Person implements Cloneable{
    int age=8;
    int score=100;
    Location loc=new Location("bj",22);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Location {
    String street;
    int rootmNO;
    public Location(String street, int rootmNO) {
        this.street=street;
        this.rootmNO=rootmNO;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", rootmNO=" + rootmNO +
                '}';
    }
}
