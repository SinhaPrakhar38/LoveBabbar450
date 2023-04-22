import java.util.*;

public class ZeroOnesTwosArray{
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,0,1,2};
        int Zeros =0;
        int Ones = 0;
        int Twos =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                Zeros++;
            }
            else if(arr[i]==1){
                Ones++;
            }
            else if(arr[i]==2){
                Twos++;
            }
        }

        for (int i=0; i<Zeros; i++){
            arr[i] = 0;
        }
        for (int i=Zeros; i<Zeros+Ones;i++){
            arr[i] = 1;
        }
        for (int i=Zeros+Ones; i<Zeros+Ones+Twos;i++){
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}