public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {28,24,22,26,23,21,27};
        int n=arr.length,i,j;
        System.out.println("Array before sorted:");
        for (i = 0;i<n;i++){
            System.out.printf("element at [%d]:[%d]\n",i+1,arr[i]);
        }
        for (i=0;i<n-1;i++){
            for (j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array After sorted:");
        for (i = 0;i<n;i++){
            System.out.printf("element at [%d]:[%d]\n",i+1,arr[i]);
        }
    }    
}
