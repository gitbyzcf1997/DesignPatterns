package com.zcf.dp.builder;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-21:34
 * @Description: com.zcf.dp.builder
 * @version: 1.0
 */
public class Terrain {
    Wall w;
    Fort f;
    Mine m;
}
class Wall{
    int x,y,w,h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
class Fort{
    int x,y,w,h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
class Mine{
    int x,y,w,h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

