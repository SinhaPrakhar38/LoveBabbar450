import java.util.*;

public class kthmaxandmin{
    public static void main(String[] args) {
        int a[] = {1,20,30,40,50,60,70,100,80};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i=0; i<a.length-1; i++){
            for (int j = 0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(a[k-1]);
    }
}
