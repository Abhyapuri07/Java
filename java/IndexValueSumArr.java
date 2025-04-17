public class IndexValueSumArr{
    public static void main(String[] args){
      int[] arr1={1,2,3,4,5};
      int[] arr2={1,2,3,4,5};
      int[] arr= new int[arr1.length];
      for(int i=0; i<arr.length; i++){
           arr[i]=arr1[i]+arr2[i];
      }
      
      System.out.print("Sum of Array Index:");
      for( int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
      }

    }
}