public class MutableVsImmutable {
    public static void main(String[] args) {
        // Immutable String 
        String str = "Hello world!";
        str.concat(" Good Morning"); // it create a new object 
        System.out.println(str);


        // Mutable String
        StringBuilder sbd = new StringBuilder("Hello world! ");
        sbd.append(" Good Morning "); // it Modifies orignal one 
        System.out.println(sbd.capacity());

        StringBuffer sbf = new StringBuffer("Hello ");
        sbf.append("Good Evening");
        System.out.println(sbf.capacity());


    }
}
