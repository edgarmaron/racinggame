package org.fasttrackkit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        Engine truckEngine = new Engine();
        truckEngine.manufacturer = "Renault";
        AutoVehicle truck = new AutoVehicle(truckEngine);


        Engine testengine = new Engine();
        testengine.manufacturer = "BMW";

        Car testCar = new Car(testengine);
        System.out.println(testCar);

        Engine testengine2 = new Engine();
        testengine2.manufacturer = "Mazda"

        Car firstCar = new Car(testengine2);
        firstCar.name = "Golf";
        System.out.println(firstCar.name);

        Driver firstDriver = new Driver();
        firstDriver.name = "Tony";
        firstDriver.age = 39;
        firstCar.driver = firstDriver;


        Engine testengine3 = new Engine();
        testengine3.manufacturer = "Volvo"
        Car car = new Car(testengine3);
        car.name = "Dacia";
        car.doorCount = 2;
        System.out.println(car.name);

        double traveledDistance = car.accelerate(2313.321, 321312);

        System.out.println("Traveled distance: " + traveledDistance);



}
