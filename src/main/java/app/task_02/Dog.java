package app.task_02;

import java.util.Objects;

public class Dog {
    private String color;
    private int age;
    private double weight;

    public Dog(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Double.compare(weight, dog.weight) == 0 && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age, weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
