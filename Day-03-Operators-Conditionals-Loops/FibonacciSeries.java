public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1;

        System.out.println("the first 10 numbers in a 'Fibonacci sequence' are: ");
        while (n>0) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;

            n--;
        }
    }
}
