package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car swift  = new Car();
        swift.make = 2014;
        swift.color = "Black";
        swift.transmission = "Manual";

        //Using Car class method
        swift.displayCharacterstics();
        swift.accelerate();
        swift.brake();
    }
}
