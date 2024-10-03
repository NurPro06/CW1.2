public class Main {



    public static void main(String[] args) {

        Circle circle = new Circle("Круг", 24);
        Triangle triangle = new Triangle("Треугольник",
                34, 4, 6);
        Square square = new Square("Квадрат", 23);
        Rectangle rectangle = new Rectangle("Прямоугольник",
                34, 5);

        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Гарфилд");


        //полиморфизм
        Drawable[] drawables = {circle, triangle, square, rectangle,
                dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(
                        ((Figure) drawables[i]).getName() +
                                " Периметр -> " +
                                ((Figure) drawables[i])
                                        .calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }

            drawables[i].draw();
        }
        dog.callSound();
    }
}