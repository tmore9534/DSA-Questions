import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        
        int arr[]={5,2,6,1,3};
        selection(arr);
    }

    public static void selection(int[] arr){


        for(int i=0;i<arr.length;i++){

            int last=arr.length-i-1;
            int max=getMaxIndex(arr, 0, last);

            swap(arr,max,last);


        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    
    }

    public static int getMaxIndex(int[] arr,int start,int end){

        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }
    
}
