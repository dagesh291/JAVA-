package sorting;

public class bubble {
    public static void main(String[] args) {
        int arr[]={2,4,7,8,6,5,4,2};
        for(int i=0 ;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp =0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print(" sorted array is : ");
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]+" ");
        }
    }
}
