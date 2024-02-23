class SumEven {
    public static void main(String[] args) {
        int [] arr={2,3,4,2,8,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                continue;
            }
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
