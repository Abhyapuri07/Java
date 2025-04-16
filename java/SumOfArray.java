import java.util.*;
public class SumOfArray{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int sum=0;
        System.out.print("Enter size of array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of array:");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum of array:");
        System.out.print(sum);
        }
    }
