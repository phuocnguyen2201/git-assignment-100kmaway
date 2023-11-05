import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        
        Car car1 = new Car("BMW", "X5", 10);

        car1.accelerate();
        car1.brake();
        car1.refuel(5);
    }
}

class Car{
    private String brand;
    private String model;
    private int amountOfFuel;

    public Car(){
        brand = "";
        model = "";
        amountOfFuel = 100;
        printData();
    }

    public Car(String brand, String model, int amountOfFuel){
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
        printData();
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getFuel(){
        return amountOfFuel;
    }

    public void setFuel(int amountOfFuel){
        this.amountOfFuel = amountOfFuel;
    }

    void brake(){
        System.out.println("Car is breaking");
    }

    void accelerate(){
        amountOfFuel = amountOfFuel-- > 0 ? amountOfFuel : 0;
        if(amountOfFuel > 0)
            System.out.println("Car is accelerating");
    }
    private void printData(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Fuel: "+amountOfFuel);
    }

    void refuel(int amountOfFuel){
        System.out.println("Fuel in the tank: "+this.amountOfFuel);
        System.out.println("Refuel: "+amountOfFuel);
        this.amountOfFuel += amountOfFuel;

        System.out.println("Fuel in the tank after the refuel: "+this.amountOfFuel);
    }
}