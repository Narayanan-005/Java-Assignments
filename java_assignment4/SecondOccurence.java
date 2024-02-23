class SecondOccurence {
    public static void main(String[] args) {
        int arr []={2,3,4,2,8,7};
        int occur=2,count=0,index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==occur){
                count++;
            }
            if(count==2){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
