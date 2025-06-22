package FactoryMethodPatternExample;

public class CreateWordDocument extends WordDocument {
    @Override
    public void open() {
        System.out.println("Word");
    }
}