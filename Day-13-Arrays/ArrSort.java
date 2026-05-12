import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        char[] arr = new char[] { 'a', 'd', 'b', 't', 's', 'z', 'g', 'm', 't' };
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));

        String[] arr2 = new String[] {"ayz","axe","agj","akl"};
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}