package BasicPrograms;

public class FibonacciSeries {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        System.out.println("series " + a);
        System.out.println("series " + b);
        for (int i = 0; i < 10; i++) {
            c = a + b;
            System.out.println("series " + c);
            a = b;
            b = c;
        }
    }
}
