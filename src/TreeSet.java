import java.util.HashSet;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Car> carSet = new java.util.TreeSet<>(new ComparableCars());
        carSet.add(new Car("BMW", "23"));
        carSet.add(new Car("Mercedes", "93"));

        for(Car car:carSet) {
            System.out.println(car);
        }

    }
}
