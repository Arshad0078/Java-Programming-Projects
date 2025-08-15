public class binary_search{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int low = 0,mid,high = arr.length,key = 1923,pos=-1;
        boolean found = false;
        while (low<high){
            mid = (low+high)/2;
            if (key==arr[mid]){
                found = true;
                pos = mid;
                break;
            }
            else if (key>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if (found){
            System.out.println(key +" is found at position:"+ pos);
        }
        else{
            System.out.println(key+" was not found");
        }
    }
}