package document;

public class ImageDocument extends Document {
    public ImageDocument(String name, String createdDate, String size) {
        this.name = name;
        this.createdDate = createdDate;
        this.size = size;
    }

    @Override
    public void create() {
        System.out.println("Image Document is created");
    }

    @Override
    public void delete() {
        System.out.println("Image Document is deleted");
    }
}
