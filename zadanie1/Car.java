package zadanie1;

public class Car implements Comparable<Car> {
    private String model;
    private int rok;

    public Car(String model, int rok){
        this.model = model;
        this.rok = rok;
    }
    public int compareTo(Car otherCar){
        return Integer.compare(this.rok, otherCar.rok);
    }
    public String toString(){
        return model + ", " + rok;
    }

}
