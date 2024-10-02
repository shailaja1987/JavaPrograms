package ArrayPrograms;
//Program to copy all elements of one array into another array
public class copyEleOneArraytoAnotherAaaray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        for(int j=0;j<arr1.length;j++)
        {
            System.out.println(arr2[j]);
        }
    }
}
