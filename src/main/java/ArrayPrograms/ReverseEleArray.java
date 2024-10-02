package ArrayPrograms;

public class ReverseEleArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3, 6};

        for (int i = arr.length-1; i >= 0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
