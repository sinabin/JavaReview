package review.solid.InterfaceSegregationPrinciple;

public class Document {

    private String document_id;
    private String document_title;
    private String document_contents;

    public Document(){

    }
    public Document(String document_id, String document_title, String document_contents){
        this.document_id = document_id;
        this.document_title=document_contents;
        this.document_contents=document_contents;
    }


    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public String getDocument_title() {
        return document_title;
    }

    public void setDocument_title(String document_title) {
        this.document_title = document_title;
    }

    public String getDocument_contents() {
        return document_contents;
    }

    public void setDocument_contents(String document_contents) {
        this.document_contents = document_contents;
    }
}
