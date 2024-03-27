class Movie{
    private String name;
    private String certificate;
    private String directorName;
    private static String language="Tamil";
    private String gernre;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getCertificate(){
        return certificate;
    }
    public void setCertificate(String certificate){
        this.name=certificate;
    }
    
    public String getDirectorName(){
        return directorName;
    }
    public void setDirectorName(String directorName){
        this.directorName=directorName;
    }
    
    public static String getLanguage(){
        return language;
    }
    public static void setLanguage(String language){
        Movie.language=language;
    }
    
    public String getGernre(){
        return gernre;
    }
    public void setGernre(String gernre){
        this.gernre=gernre;
    }
}
