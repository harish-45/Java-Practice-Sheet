public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

     int subtract(int a, int b) {
        return a - b;
    }

     int multiply(int a, int b) {
        return a * b;
    }

     double divide(int a, int b) {
        // if (b == 0) {
        //     System.out.println("cannot devide by zero");
        //     return 0;
        // }
        return (double) a / b;
    }

}
