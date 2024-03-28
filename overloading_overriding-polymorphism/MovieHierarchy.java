abstract class Movie{
    String name;
    abstract public void genre();
}
class RomanticMovie extends Movie{
    RomanticMovie(String name){
        this.name=name;
    }
    public void genre(){
        System.out.println(name+" Romantic movie");
    }
}
class ComedyMovie extends Movie{
    ComedyMovie(String name){
        this.name=name;
    }
    public void genre(){
        System.out.println(name+" Comedy movie");
    }
}
class ActionMovie extends Movie{
    ActionMovie(String name){
        this.name=name;
    }
    public void genre(){
        System.out.println(name+" Action movie");
    }
}
class AnimatedMovie extends Movie{
    AnimatedMovie(String name){
        this.name=name;
    }
    public void genre(){
        System.out.println(name+" Animated movie");
    }
}
