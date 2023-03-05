package review.solid.InterfaceSegregationPrinciple;

public class OldAdvancedPrinter implements OldPrinter{
    @Override
    public void print(Document document) {
        System.out.println(document.getDocument_id() +"문서를 프린트합니다.");
        System.out.println("문서내용 : " +document.getDocument_contents());
    }

    @Override
    public void fax(Document document) {
        System.out.println(document.getDocument_id() +"문서를 Fax로 보냅니다.");
    }

    @Override
    public void scan(Document document) {
        System.out.println(document.getDocument_id() +"문서를 스캔합니다.");
    }
}
