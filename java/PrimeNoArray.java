class PrimeNoArray{
    public static void main(String[] args){
        int[] arr={1,2,35,65,8,54,6,7,8};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
                System.out.println(" is prime");
            }
            else{
                System.out.print(arr[i]);
                System.out.println(" is not prime");
            }
        }
    }
}