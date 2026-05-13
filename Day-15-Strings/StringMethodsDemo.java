import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {

        //  ●	Take a string and find the first occurrence of a given character using indexOf()
        String str = "rondom string method";
        char c = 'p';

        System.out.printf("the occurrences of char '%s' at Index: %d \n", c, str.indexOf(c));
        

        //  ●	Extract a substring from the string using substring()
        System.out.println(str.substring(7, 13));
        

        //  ●	Replace all occurrences of a specific character using replace()
        String chatur = "principle mahodya! dan hota sabke paas hai ";
        String rancho = chatur.replace("dan", "stan");

        System.out.println(rancho);


        //  ●  	Split the string into an array of words using split() and print each word
        String random = "Hey! my name is suman Gouswami and whats your name ??";
        String[] arr = random.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
