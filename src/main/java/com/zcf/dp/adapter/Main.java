package com.zcf.dp.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-22:10
 * @Description: com.zcf.dp.adapter
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/test.text");
        //这就是Adapter  接口转接器
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line!=null&&!line.equals("")){
            System.out.println(line);
        }
        br.close();
    }
}
