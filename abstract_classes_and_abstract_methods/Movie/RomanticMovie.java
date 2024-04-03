package Movie;

public class RomanticMovie extends Movie{
    RomanticMovie(String name) {
        this.name = name;
    }

    public void genre() {
        System.out.println(name + " Romantic movie");
    }
}
