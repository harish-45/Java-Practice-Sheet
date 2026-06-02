
public class ElementFrequency {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 20, 40, 30, 40, 30, 40 };
        try {
            countFrequency(nums);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Given array is Empty...");
        }
    }

    public static void countFrequency(int[] arr) {
        ElementCount[] counts = new ElementCount[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            int j = 0;
            while (j <= i && counts[j] != null) {

                if (arr[i] == counts[j].value) {
                    isUnique = false;
                    counts[j].count++;
                    break;
                }
                j++;
            }

            if (isUnique)
                counts[j] = new ElementCount(arr[i], 1);
        }

        // print Element with it's count
        int i = 0;
        while (counts[i] != null) {
            System.out.printf("Element %d occurs %d times\n", counts[i].value, counts[i].count);
            i++;
        }
    }
}

// create class for keep data of value and its count
class ElementCount {
    public int value;
    public int count;

    public ElementCount(int value, int count) {
        this.value = value;
        this.count = count;
    }
}
