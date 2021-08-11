/**
This program demonstrates the SportsCar class
*/

public class SportsCarDemo
{
    public static void main(String[] args)
    {
        // Create a SportsCar object
        SportsCar yourNewCar = new SportsCar(CarType.MERCEDES,
        CarColor.PURPLE, 50000);

        // Display the object's values
        System.out.println(yourNewCar);
    }
}
