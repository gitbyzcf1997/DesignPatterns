package com.zcf.dp.composite;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-13:34
 * @Description: com.zcf.dp.composite
 * @version: 1.0
 */

/**
 * 组合模式(Composite) 树状结构专用
 */
abstract class Node{
    abstract public void p();
}
class LeafNode extends  Node{
    String context;

    public LeafNode(String context) {
        this.context = context;
    }

    @Override
    public void p() {
        System.out.println(context);
    }
}
class BranchNode extends Node{
    List<Node> nodes=new ArrayList<>();
    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }
    public void  add(Node n){
        nodes.add(n);
    }
}
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c211");
        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);
        tree(root,0);
    }

    private static void tree(Node b,int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("--");
        }
        b.p();
        if(b instanceof BranchNode){
            for(Node n: ((BranchNode) b).nodes){
                tree(n,depth+1);
            }
        }
    }
}
