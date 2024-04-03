package document;

public class TextDocument extends Document {
    public TextDocument(String name, String createdDate, String size) {
        this.name = name;
        this.createdDate = createdDate;
        this.size = size;
    }

    @Override
    public void create() {
        System.out.println("Text Document is created");
    }

    @Override
    public void delete() {
        System.out.println("Text Document is deleted");
    }
}
