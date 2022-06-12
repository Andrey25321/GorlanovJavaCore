package JavaCore3;

import java.util.ArrayList;
import java.util.List;

class Box<B extends Fruit> {

    private List<B> list = new ArrayList<>();

    public Box() {
    }

    public void add(B fruit) {
        list.add(fruit);
    }

    public void moveFruitsFrom(Box<B> anotherBox) {
        for (B fruit : anotherBox.list) {
            list.add(fruit);
        }
        anotherBox.list.clear();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    private double getWeight() {
        double sum = 0.0;
        for (B fruit : list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void info() {
        if (list.size() < 1) {
            System.out.println("Коробка пуста.");
            return;
        }

        String name = list.get(0).getName();
        double weight = list.get(0).getWeight();
        double totalWeight = weight * list.size();

        System.out.println("Фрукты: " + name + ", количество " + list.size() +
                "шт. Общий вес: " + totalWeight);
    }
}