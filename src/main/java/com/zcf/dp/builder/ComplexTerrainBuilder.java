package com.zcf.dp.builder;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-21:39
 * @Description: com.zcf.dp.builder
 * @version: 1.0
 */
public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain=new Terrain();
    @Override
    public TerrainBuilder builderWall() {
        terrain.w=new Wall(10,10,50,50);
        return this;
    }

    @Override
    public TerrainBuilder builderFort() {
        terrain.f=new Fort(10,10,50,50);
        return this;
    }

    @Override
    public TerrainBuilder builderMine() {
        terrain.m=new Mine(10,10,50,50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
