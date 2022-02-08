package com.zcf.dp.builder;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-21:39
 * @Description: com.zcf.dp.builder
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args){
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.builderFort().builderMine().builderWall().build();

        Person p=new Person.PersonBuilder()
                .basicInfo(1,"zcf",25)
                .weight(55).score(100)
                .loc("bj","53")
                .build();
        System.out.println(p);
    }
}
