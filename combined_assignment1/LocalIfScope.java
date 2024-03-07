public class LocalIfScope {
    public static void main(String[] args) {
        int a=10;
        if(true){
            int b=20;
            System.out.println(b);//20
            System.out.println(a);//10
        }
        System.out.println(a);
        System.out.println(b);//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
                              //b cannot be resolved to a variableat LocalIfScope.main(LocalIfScope.java:10)
    }
}
