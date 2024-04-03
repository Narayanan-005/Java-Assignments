package Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1=new RomanticMovie("Minnale");
        m1.genre();
        System.out.println();
        Movie m2=new ComedyMovie("ThilluMullu");
        m2.genre();
        System.out.println();
        Movie m3=new ActionMovie("Ramana");
        m3.genre();
        System.out.println();
        Movie m4=new AnimatedMovie("Bleach");
        m4.genre();
    }
}
