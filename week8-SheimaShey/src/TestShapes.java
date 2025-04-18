public class TestShapes {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.describe();

        Rectangle r1 = new Rectangle("White", 4);

        Rectangle r2 = new Rectangle("blue", 4);

        System.out.println(r1.equal((r2)));
    }
}
