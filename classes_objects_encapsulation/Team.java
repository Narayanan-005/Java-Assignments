import java.util.*;
class Team{
    public String name;
    public String city;
    public String division;
    public List<Player> players;
    public Team(String name,String city,String division,List<Player> players){
        this.name=name;
        this.city=city;
        this.division=division;
        this.players=players;
    }
    public void playGame(){
        System.out.println("Team plays Game");
    }
    public void hireCoach(){
        System.out.println("Team Hire Coach");
    }
}
