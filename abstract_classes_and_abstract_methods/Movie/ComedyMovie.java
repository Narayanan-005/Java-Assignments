package Movie;

public class ComedyMovie extends Movie {
    ComedyMovie(String name) {
        this.name = name;
    }

    public void genre() {
        System.out.println(name + " Comedy movie");
    }
}
