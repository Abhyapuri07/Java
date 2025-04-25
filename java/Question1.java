//Create a method that finds & returns the smallest no. in an array.
class Question1{
    static void Smallest(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args){
        int arr[] = {2,1,4,5,6,7};
        Smallest(arr);
    }
}