public class Main {
    public static void main(String[] args) {

        System.out.println("---- Person Details ----");

        // Person :  
        Person p1 = new Person();
        System.out.println("Name : " + p1.name + ", Age : " + p1.age);

        Person p2 = new Person("Harry",20);
        System.out.println("Name : " + p2.name + ", Age : " + p2.age);


        System.out.println("\n");

        // Animal : 

        Dog dog = new Dog("puppy", "dog", "german sheperd");
        System.out.println("---- Dog Details ----");
        System.out.println("name    : "+dog.name);
        System.out.println("Species : "+ dog.species);
        System.out.println("breed   : "+dog.breed);



    }
}
