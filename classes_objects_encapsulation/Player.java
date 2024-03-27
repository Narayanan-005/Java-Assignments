class Player{
    public String name;
    public String position;
    public int jerseyNumber;
    public Team team;
    public Player(String name,String position,int jerseyNumber,Team team){
        this.name=name;
        this.position=position;
        this.jerseyNumber=jerseyNumber;
        this.team=team;
    }
    public void playGame(){
        System.out.println("Player plays Game");
    }
    public void train(){
        System.out.println("Player Trains");
    }
}
