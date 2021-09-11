package LiskovSubstitution;

public class NovelBook extends nonFictionalBook{
    void func1() {
        NovelBook n = new NovelBook();
        System.out.println(" The Notebook is a novel and belong to nonfictional book");
    }
}