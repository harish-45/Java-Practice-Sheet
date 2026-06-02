public class Main {
    public static void main(String[] args) {
        
        Shape shape = new Shape(){
            @Override
            public void drow(){
                System.out.println("Drawing a shape...");
            }
        };

        Shape circle = new Shape() {
            @Override
            public void drow() {
                System.out.println("Drawing a circle...");
            }
        };

        shape.drow();
        circle.drow();
    }
}
