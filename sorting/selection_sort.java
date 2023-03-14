package sorting;

public class selection_sort {
    public static void main(String[] args) {
        int arr[]={1,7,5,3,9,4};
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print(" sorted array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
