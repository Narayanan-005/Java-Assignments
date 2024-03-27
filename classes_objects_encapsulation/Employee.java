class Employee{
    private int id;
    private String name;
    private String emailId;
    private static String companyName="ABC Company";
    private String phoneNumber;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    
    public static String getCompanyName(){
        return companyName;
    }
    public static void setCompanyName(String companyName){
        Employee.companyName=companyName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
}
