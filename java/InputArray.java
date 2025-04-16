import java.util.*;
public class InputArray{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of array:");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Array is:");
        
        for(int k=0; k<arr.length;k++){
            //System.out.println("Array is:");
            System.out.println(arr[k]);
        }
    }
}