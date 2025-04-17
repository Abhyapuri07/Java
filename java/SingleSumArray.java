class SingleSumArray{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int sum1=0;
        int sum2=0;
        int C=0;
        for(int i=0; i<arr1.length; i++){
            sum1=sum1+arr1[i];
    }
    System.out.print("Sum of array 1:");
    System.out.println(sum1);

    for(int j=0; j<arr2.length; j++){
            sum2=sum2+arr2[j];
    }
    System.out.print("Sum of array 2:");
    System.out.println(sum2);

    C=sum1+sum2;
    System.out.print("Total Sum:");
    System.out.println(C);

    }
}

