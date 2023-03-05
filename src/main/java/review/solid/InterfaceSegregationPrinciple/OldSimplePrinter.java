package review.solid.InterfaceSegregationPrinciple;

public class OldSimplePrinter implements OldPrinter {
    @Override
    public void print(Document document) {
        System.out.println(document.getDocument_contents());
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException();
    }
}
