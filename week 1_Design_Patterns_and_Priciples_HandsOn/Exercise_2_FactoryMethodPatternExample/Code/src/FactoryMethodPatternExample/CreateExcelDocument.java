package FactoryMethodPatternExample;

public class CreateExcelDocument extends ExcelDocument {
    @Override
    public void open() {
        System.out.println("Excel");
    }
}