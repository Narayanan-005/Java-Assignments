package document;

public class PDFDocument extends Document {
    public PDFDocument(String name, String createdDate, String size) {
        this.name = name;
        this.createdDate = createdDate;
        this.size = size;
    }

    @Override
    public void create() {
        System.out.println("PDF Document is created");
    }

    @Override
    public void delete() {
        System.out.println("PDF Document is deleted");
    }
}
