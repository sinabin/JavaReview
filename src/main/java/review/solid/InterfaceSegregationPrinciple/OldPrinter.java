package review.solid.InterfaceSegregationPrinciple;

/**
 * @Explain : 해당 인터페이스는 print 메소드를 제외하고도 fax, scan 메소드를 구현해야만한다
 */
public interface OldPrinter {
    void print(Document document);
    void fax(Document document);
    void scan(Document document);

}
