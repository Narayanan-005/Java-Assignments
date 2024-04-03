package Movie;

public class AnimatedMovie extends Movie {
    AnimatedMovie(String name) {
        this.name = name;
    }

    public void genre() {
        System.out.println(name + " Animated movie");
    }
}
