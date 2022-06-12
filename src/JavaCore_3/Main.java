package JavaCore3;

public class Main {
    public static void main(String[] args) {
        Box<Orange> bananaBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        bananaBox.add(new Orange());
        bananaBox.add(new Orange());
        bananaBox.add(new Orange());
        bananaBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        bananaBox.info();
        appleBox.info();

        System.out.println(appleBox.compare(bananaBox));

        Box<Orange> bananaBox1 = new Box<>();
        bananaBox1.moveFruitsFrom(bananaBox);
        bananaBox1.info();

        Box<Orange> bananaBox2 = new Box<>();
        bananaBox2.info();
    }
}
