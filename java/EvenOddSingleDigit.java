class EvenOddSingleDigit{
    public static void main(String[] args){
        int sum=123;
        for(int i=0; i<3; i++){
            if(sum%2==0)
               System.out.println("Even");
               else
                  System.out.println("Odd");

                  sum=sum/10;

        }
    }
}