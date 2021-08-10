/**
This class stores data about an instructor
*/

public class Instructor
{
    private String lastName; // Last name
    private String preferredName; // Preferred name
    private String officeNumber; // Office number

    /**
    This constructor initializes the last name,
    preferred name & office number
    @param lname The instructor's last name
    @param pname The instructor's preferred name
    @param office The office number
    */

    public Instructor(String lname, String pname, String office)
    {
        lastName = lname;
        preferredName = pname;
        officeNumber = office;
    }

    /**
    The copy constructor initalizes the object
    as a copy of another Instructor object
    @param object2 The object to copy
    */

    public Instructor(Instructor object2)
    {
        lastName = object2.lastName;
        preferredName = object2.preferredName;
        officeNumber = object2.officeNumber;
    }

    /**
    The set method sets a value for each field
    @param lname The instructor's last name
    @param pname The instructor's preferred name
    @param office The office number
    */

    public void set(String lname, String pname, String office)
    {
        lastName = lname;
        preferredName = pname;
        officeNumber = office;
    }

    /**
    toString method
    @return A string containing the instructor info
    */

    public String toString()
    {
        // Create a string representing the object
        String str = "Last Name: " + lastName +
                     "\nPreferred Name: " + preferredName +
                     "\nOffice Number: " + officeNumber;

        // Return the string
        return str;
    }
}
