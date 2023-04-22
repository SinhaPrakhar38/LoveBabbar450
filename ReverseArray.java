import java.util.*;

public class ReverseArray{
    static void Reverse(int arr[], int start, int end){
        int temp;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void PrintArray(int arr[], int size){
        for (int i = 0; i<size; i++){
           System.out.print(arr[i]+" ");;
        }
    } 

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        PrintArray(arr, 6);
        Reverse(arr,0,5);
        System.out.println("\nAfter Reversing the array is");
        PrintArray(arr,6);
    }  
}
