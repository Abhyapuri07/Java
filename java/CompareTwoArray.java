import java.util.*;
public class CompareTwoArray{
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter size of first array:");
        int n=in.nextInt();
        int[] array1=new int[n];
        System.out.println("Enter values for first array:");
        for(int i=0; i<n; i++){
            array1[i]=in.nextInt();
        }  
        System.out.print("Enter size of second array:");
        int m=in.nextInt();
        int[] array2=new int[m];
        System.out.println("Enter values for second array:");
        for(int i=0; i<m; i++){
            array2[i]=in.nextInt();
        } 
        boolean status=true;
        if (array1.length != array2.length){
            status=false;
            System.out.println("Arrays are not equal");}
        

        else{
           // if(array1.length == array2.length){
              /*  for(int i=0; i<array1.length; i++){
                    if(array1[i]==array2[i])
                    {
                        //System.out.println("Arrays are equal");
                    
                    
                    System.out.println("Arrays are equal");}
                    else{
                        System.out.println("Arrays are unequal");
                    }
                    
                
                }*/
               status=false;
        }
        if(status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
        System.out.println("Arrays are unequal");
    }
}