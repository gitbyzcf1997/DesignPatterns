package com.zcf.dp.builder;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-21:37
 * @Description: com.zcf.dp.builder
 * @version: 1.0
 */
public interface TerrainBuilder {
    TerrainBuilder builderWall();
    TerrainBuilder builderFort();
    TerrainBuilder builderMine();
    Terrain build();
}
