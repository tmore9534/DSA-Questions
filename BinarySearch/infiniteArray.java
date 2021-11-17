
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class infiniteArray{
    public static void main(String[] args) {
        
        int arr[]={10,20,40,60,80,100,120};

        System.out.println(search(arr,80));
    }

    public static int search(int nums[],int target){
            int ans=-1;
            int start=0;
            int end=1;

            while(target>nums[end]){

                int newStart=end+1;
                end=end+((end-start+1)*2);

                start=newStart;
                


            }
           
            return binarySearch(nums,start,end,target);
    }

    public static int binarySearch(int nums[],int start,int end,int target){

        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    
}