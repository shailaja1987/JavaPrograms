package ArrayPrograms;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args)
    {
        int[] arr={34,12,78,45,98,23,45};
        int temp;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {  //Java Program to sort the elements of an array in ascending order
//                //if(arr[i]>arr[j])
//                    //Java Program to sort the elements of an array in descending order
//                    if(arr[i]<arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
        //using function
       Arrays.sort(arr);
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
