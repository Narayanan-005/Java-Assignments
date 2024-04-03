package document;

public class DocumentMain {
    public static void main(String[] args) {
        Document pdf=new PDFDocument("First","20/5/24","20kb");
        pdf.create();
        pdf.getDescription();
        System.out.println();
        Document text=new TextDocument("Second","21/5/24","25kb");
        text.create();
        text.getDescription();
        System.out.println();
        Document image=new ImageDocument("Third","22/5/24","40kb");
        image.create();
        image.getDescription();
    }
}
