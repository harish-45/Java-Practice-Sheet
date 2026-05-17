 /*
         * B. Write a Java program that demonstrates the use of throw and throws.
         * ● Create a method validateAge(int age) that checks if the age is less than 18
         * If so, throw an IllegalArgumentException.
         * ● In the main() method, call validateAge() with different age values.
         * ● Use a try-catch block to handle the exception and display an appropriate error message.
         */
public class Test {
    public static void main(String[] args)  {

        try{
            validateAge(25);
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    
    public static void validateAge(int age) throws IllegalArgumentException{
        if (age < 18)
            throw new IllegalArgumentException("Age is not valid!");
        else
            System.out.println("Age validation complete!");
    }


}
