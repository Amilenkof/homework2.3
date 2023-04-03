public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);


        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);


        Bycycle bycycle = new Bycycle("bycycle1",2);
        Bycycle bycycle2 = new Bycycle("bycycle2",2);


        car.check();
    }
}