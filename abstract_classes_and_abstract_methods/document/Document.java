package document;

public abstract class Document {
    String name;
    String createdDate;
    String size;

    public void getDescription() {
        System.out.println("Name " + name);
        System.out.println("Created date " + createdDate);
        System.out.println("Size " + size);
    }
    public abstract void create();
    public abstract void delete();
}

