public class Rectangle extends Figure{

    private int a, b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void draw() {
        System.out.println("▆");
    }
}
