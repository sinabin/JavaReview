package review.solid.InterfaceSegregationPrinciple;

public class AdvancedPrinter implements Printer, Fax, Scanner{
    @Override
    public void fax(Document document) {
        System.out.println(document.getDocument_id() + "문서를 팩스로 보내겠습니다.");
    }

    @Override
    public void print(Document document) {
        System.out.println(document.getDocument_id() +"를 프린트합니다.");
        System.out.println("--------------------------------문서내용은 아래와 같습니다.--------------------------------");
        System.out.println(document.getDocument_contents());
        System.out.println("----------------------------------------------------------------------------------------");
    }

    @Override
    public void scan(Document document) {
        System.out.println(document.getDocument_id() +"를 스캔하겠습니다.");
    }
}
