import java.util.*;
public class MaxEleArray{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of array:");
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Maximum elemnt:" +max);
        }
    }