package review.solid.InterfaceSegregationPrinciple;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document document) {
        System.out.println(document.getDocument_id() +"를 프린트합니다.");
        System.out.println("--------------------------------문서내용은 아래와 같습니다.--------------------------------");
        System.out.println(document.getDocument_contents());
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
