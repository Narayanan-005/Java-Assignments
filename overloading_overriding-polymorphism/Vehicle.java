abstract class Vehicle{
    String name;
    int seatCapacity;
    String maxSpeed;
    public void details(){
        System.out.println("Name of Vehicle :"+name+"\nSeat Capacity :"+seatCapacity+"\nMax Speed :"+maxSpeed);
    }
    public void start(){
        System.out.println(name+" is started");
    }
    public void stop(){
        System.out.println(name+" is stopped");
    }
}

class Cycle extends Vehicle{
    Cycle(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
    public void start(){
        System.out.println(name+" is started");
    }
    public void stop(){
        System.out.println(name+" is stopped");
    }
}

class Car extends Vehicle{
    Car(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
    public void start(){
        System.out.println(name+" is started");
    }
    public void stop(){
        System.out.println(name+" is stopped");
    }
}

class Train extends Vehicle{
    Train(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
    public void start(){
        System.out.println(name+" is started");
    }
    public void stop(){
        System.out.println(name+" is stopped");
    }
}
