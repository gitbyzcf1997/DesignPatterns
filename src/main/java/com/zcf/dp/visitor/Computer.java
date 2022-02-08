package com.zcf.dp.visitor;


/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-17:02
 * @Description: com.zcf.dp.visitor
 * @version: 1.0
 */
public class Computer {
    public ComputerPart cpu = new CPU();
    ComputerPart meoory = new Memory();
    ComputerPart board = new Board();
    public void acccept(Visitor v){
        this.cpu.accept(v);
        this.meoory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersoneVisitor persone = new PersoneVisitor();
        new Computer().acccept(persone);
        double totalPrice = persone.totalPrice;
        System.out.println(totalPrice);
    }
}
abstract class ComputerPart{
    abstract void accept(Visitor v);
    abstract double getPrive();
}
interface Visitor{

    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);
}
class CPU extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrive() {
        return 500;
    }
}
class Memory extends ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    double getPrive() {
        return 300;
    }
}
class Board extends  ComputerPart{

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrive() {
        return 200;
    }
}
class PersoneVisitor implements Visitor{
    double totalPrice=0.0;
    @Override
    public void visitCpu(CPU cpu) {
        totalPrice+=cpu.getPrive()*0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice+=memory.getPrive()*0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice+=board.getPrive()*0.95;
    }
}
class  CorpVisitor implements Visitor{
    double totalPrice=0.0;
    @Override
    public void visitCpu(CPU cpu) {
        totalPrice+=cpu.getPrive()*0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice+=memory.getPrive()*0.75;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice+=board.getPrive()*0.75;
    }
}