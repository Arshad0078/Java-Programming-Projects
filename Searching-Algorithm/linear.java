public class linear{
    public static void main(String[] args){
        int arr[] = {10,20,30,50,70,90};
        int key = 50 ,n = arr.length,pos=0;
        boolean found = false;
        for (int i=0;i<n;i++){
            if (key==arr[i]){
                found = true;
                pos = i;
                break;
            }
        }
        if (found){
            System.out.println(key+" is found at position:"+pos);
        }
        else{
            System.out.println(key+ " is not found ");
        }
    }
}