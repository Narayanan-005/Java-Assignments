package Movie;

public class ActionMovie extends Movie {
    ActionMovie(String name) {
        this.name = name;
    }

    public void genre() {
        System.out.println(name + " Action movie");
    }
}
