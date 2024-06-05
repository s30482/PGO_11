package zadanie1;

import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Car c1 = new Car("BMW", 2020);
    Car c2 = new Car("BMW", 2019);
    Car c3 = new Car("Skoda", 2000);
    Car c4 = new Car("Tesla", 2008);
    Car c5 = new Car("Mercedes", 2024);
    Car c6 = new Car("Opel", 1997);
    Car c7 = new Car("Reno", 2005);
    Car c8 = new Car("Volvo", 2001);
    Car c9 = new Car("Audi", 1999);
    Car c10 = new Car("Lexus", 2003);

    ArrayList<Car> cars = new ArrayList<>();
    cars.add(c1);
    cars.add(c2);
    cars.add(c3);
    cars.add(c4);
    cars.add(c5);
    cars.add(c6);
    cars.add(c7);
    cars.add(c8);
    cars.add(c9);
    cars.add(c10);

    Collections.sort(cars);
    for(Car car : cars){
        System.out.println(car.toString());
    }
    }
}