package FactoryMethodPatternExample;

public class CreatePdfDocument extends PdfDocument {
    @Override
    public void open() {
        System.out.println("PDF");
    }
}