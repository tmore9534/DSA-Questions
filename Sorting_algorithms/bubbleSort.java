//bubble sort algorithm with optimization
import java.util.*;
public class bubbleSort{
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};

        bubble(arr);

    }

    public static void bubble(int[] arr){

        boolean swapped=false;

        for(int i=0;i<arr.length;i++){

            swapped=false;

            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

            if(!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}