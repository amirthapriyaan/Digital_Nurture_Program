package FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public WordDocument createDocument() {
        return new CreateWordDocument();
    }
}
