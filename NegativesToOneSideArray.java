import java.util.*;

public class NegativesToOneSideArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,-4,-5,6,-7,-8,9,10};
        int start = arr[0];
        int end = arr[arr.length-1];
        for (int i =0; i<arr.length; i++){
        if (start>0 && end<0){
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;
        }
        else if(start>0 && end>0){
            end--;
        }
        else if (start<0 && end <0){
            start++;
        }
        else if (start<0 && end>0){
            start++;
            end--;
        }
       }
       System.out.println(Arrays.toString(arr));

    }
}
