import java.util.*; 

public class ContiguousSubArray {
 public static void main(String[] args) {
    int arr[] = {1,2,3,4,-5,-8,9,20};
    int min =0;
    int add=0;
    for (int i=0; i<arr.length; i++){
        if(arr[i]<0){
            min = arr[i];
        }
        else if(arr[i]>0){
            add+=arr[i];
        }
    }
    System.out.println(add);
    System.out.println(min);
 }   
}
