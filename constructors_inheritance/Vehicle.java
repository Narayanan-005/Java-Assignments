class Vehicle{
    String name;
    int seatCapacity;
    String maxSpeed;
    public void details(){
        System.out.println("Name of Vehicle :"+name+"\nSeat Capacity :"+seatCapacity+"\nMax Speed :"+maxSpeed);
    }
}

class Cycle extends Vehicle{
    Cycle(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
}

class Car extends Vehicle{
    Car(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
}

class Train extends Vehicle{
    Train(String name,int seatCapacity,String maxSpeed){
        this.name=name;
        this.seatCapacity=seatCapacity;
        this.maxSpeed=maxSpeed;
    }
}
