package com.zcf.dp.bridge.v2;


/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-23:10
 * @Description: com.zcf.dp.bridge.v1
 * @version: 1.0
 */
public class GG {
    public void chase(MM mm){
        Gift g=new Book();
        give(mm,g);
    }

    private void give(MM mm, Gift g) {
        System.out.println("送给"+mm.name+"一个"+g);
    }
}
