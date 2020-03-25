public class Test {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(6.5, "black");
            System.out.println("A circle has "+circle1.toString());

            Cylinder cylinder1 = new Cylinder(7, "blue", 9);
            System.out.println("A cylinder has "+cylinder1.toString());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
