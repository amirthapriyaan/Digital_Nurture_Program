package FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public PdfDocument createDocument() {
        return new CreatePdfDocument();
    }
}
