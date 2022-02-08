package com.zcf.dp.bridge.v4;


/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-23:10
 * @Description: com.zcf.dp.bridge.v1
 * @version: 1.0
 */
public class GG {
    public void chase(MM mm){
        Gift g=new WarmGift(new Flower());
        give(mm,g);
    }

    private void give(MM mm, Gift g) {
        System.out.println("送给"+mm.name+"一个"+g);
    }

    public static void main(String[] args) {
        GG gg = new GG();
        MM mm = new MM();
        mm.name="小花";
        gg.chase(mm);
    }
}
