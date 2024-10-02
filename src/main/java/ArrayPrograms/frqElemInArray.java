package ArrayPrograms;

public class frqElemInArray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,2,5,6,3,5,6,7,2,4,5,6};
        int[] frq=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            frq[i]=1;
            for(int j=i+1;j< arr1.length;j++)
            {
                if(arr1[i]==arr1[j] && arr1[i]!=-1)
                {
                    frq[i]++;
                    arr1[j]=-1;

                }
            }

        }
        for(int k=0;k<arr1.length;k++)
        { if(arr1[k]!=-1)
            System.out.println("Element "+arr1[k] +frq[k]);
        }
        //Duplicate element of aaray
        for(int k=0;k<arr1.length;k++)
        { if(frq[k]>1)
            System.out.println("Duplicate Element "+arr1[k]);
        }

                    }
}
