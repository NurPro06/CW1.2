public class Dog extends Animal implements SoundProducable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public void callSound() {
        System.out.println(getName() + "говорит гав-гав");
    }
}
