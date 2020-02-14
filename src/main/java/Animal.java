import java.util.List;
import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private List<Food> food;
    private Types type;

    public Animal (String name, int age, Types type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(food, animal.food) &&
                type == animal.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, food, type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food=" + food +
                ", type=" + type +
                '}';
    }

    public List<Food> returnFood() {
        return food;
    }
    public int returnAge() {
        return age;
    }
    public String returnName() {
        return name;
    }


}