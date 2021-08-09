import javax.swing.JOptionPane;

/**
    This program demonstrates the Metric class.
*/

public class MetricDemo
{
    public static void main(String[] args)
    {
        String input; // To hold input
        double miles; // A distance in miles
        double kilometers; // A distance in kilometers

        // Get a distance in miles
        input = JOptionPane.showInputDialog("Enter " +
        "a distance in miles.");
        miles = Double.parseDouble(input);

        // Convert the distance to kilometers
        kilometers = Metric.milesToKilometers(miles);
        JOptionPane.showMessageDialog(null,
        String.format("%,.2f miles equals %,.2f kilometers.", 
        miles, kilometers));

        // Get a distance in kilometers
        input = JOptionPane.showInputDialog("Enter " +
        "a distance in kilometers: ");
        kilometers = Double.parseDouble(input);

        // Convert the distance to kilometers
        miles = Metric.kilometersToMiles(kilometers);
        JOptionPane.showMessageDialog(null,
        String.format("%,.2f kilometers equals %,.2f miles.",
        kilometers, miles));

        System.exit(0);
    }
}
