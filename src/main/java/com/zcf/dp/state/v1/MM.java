package com.zcf.dp.state.v1;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-18:40
 * @Description: com.zcf.dp.state.v1
 * @version: 1.0
 */
public class MM {
    String name;
    MMState state;
    private enum  MMState{HAPPY,SAD}
    public void smile(){
        switch (state){
            case HAPPY: System.out.println("灿烂的笑容");break;
            case SAD:System.out.println("苦笑");break;
        }
    }
    public void cry(){
        switch (state){
            case HAPPY: System.out.println("高兴哭了");break;
            case SAD:System.out.println("哇~~~~");break;
        }
    }
    public void say(){
        switch (state){
            case HAPPY: System.out.println("拜拜了您嘞");break;
            case SAD:System.out.println("真倒霉");break;
        }
    }

    public static void main(String[] args) {
        MM mm = new MM();

    }
}
