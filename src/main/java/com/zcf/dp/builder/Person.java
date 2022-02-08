package com.zcf.dp.builder;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-21:48
 * @Description: com.zcf.dp.builder
 * @version: 1.0
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;
    private Person(){}
    public static class PersonBuilder{
        Person p=new Person();
        public PersonBuilder basicInfo(int id,String name,int age){
            p.id=id;
            p.name=name;
            p.age=age;
            return this;
        }
        public PersonBuilder weight(double weight){
            p.weight=weight;
            return this;
        }
        public PersonBuilder score(int score){
            p.score=score;
            return this;
        }
        public PersonBuilder loc(String street,String rootmNo){
            p.loc=new Location(street,rootmNo);
            return this;
        }
        public Person build(){return p;}
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", loc=" + loc +
                '}';
    }
}
class Location{
    String  street;
    String rootmNo;
    public Location(String street, String rootmNo) {
        this.rootmNo=rootmNo;
        this.street=street;
    }
}
