import java.util.*;

public class UnionAndIntersectionSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6,8,9,10,11};
        int arr2[] = {3,8,5,10,-11};
        int count=0;
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        System.out.println(arr1.length+arr2.length-count);
        System.out.println(count);
    }    
}
