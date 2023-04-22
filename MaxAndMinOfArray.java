import java.util.*;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int arr[] = {1,23,50,69,420,69,1};
        int i;
        int min = arr[0];
        int max = arr[arr.length-1];

        for (i=1; i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
