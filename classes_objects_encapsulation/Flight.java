class Flight{
    private int flightNumber;
    private String flightType;
    private String departureAirport;
    private static String airline="Boeing";
    private String arrivalAirport;
    
    public int getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber){
        this.flightNumber=flightNumber;
    }
    
    public String getFlightType(){
        return flightType;
    }
    public void setFlightType(String flightType){
        this.flightType=flightType;
    }
    
    public String getDepartureAirport(){
        return departureAirport;
    }
    public void setDepartureAirport(String departureAirport){
        this.departureAirport=departureAirport;
    }
    
    public static String getAirline(){
        return airline;
    }
    public static void setAirline(String airline){
        Flight.airline=airline;
    }
    
    public String getArrivalAirport(){
        return arrivalAirport;
    }
    public void setArrivalAirport(String arrivalAirport){
        this.arrivalAirport=arrivalAirport;
    }
}
