/**
SportsCar class
*/

public class SportsCar
{
    private CarType make; // The car's make
    private CarColor color; // car's color
    private double price; // car's price

    /**
    The constructor initializes the car's make,
    color & price
    @param aMake The car's make
    @param aColor The car's color
    @param aPrice The car's price
    */

    public SportsCar(CarType aMake, CarColor aColor, double aPrice)
    {
        make = aMake;
        color = aColor;
        price = aPrice;
    }

    /**
    getMake method
    @return Car's make
    */

    public CarType getMake()
    {
        return make;
    }

    /**
    getColor method
    @return Car's color
    */

    public CarColor getColor()
    {
        return color;
    }

    /**
    getPrice method
    @return Car's price
    */

    public double getPrice()
    {
        return price;
    }

    /**
    toString method
    @return A string indicating car's make,
    color & price.
    */

    public String toString()
    {
        // Create a string representing the object
        String str = String.format("Make: %s\nColor: %s\nPrice: $%,.2f",
        make, color, price);

        // Return the string.
        return str;
    }
}
