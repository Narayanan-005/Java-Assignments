class PrimeNumber {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
