package ArrayPrograms;

public class LargestElementInArray {
    public static void main(String[] args)
    {
        int[] arr={23,12,78,34,12,67,89,23};
        int small=arr[0],large=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
            if(large<arr[i])
            {
                large=arr[i];
            }
        }
          System.out.println("Small "+small);
        System.out.println("Large "+large);
    }
}
