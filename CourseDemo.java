/**
This program demonstrates the Course class
*/

public class CourseDemo
{
    public static void main(String[] args)
    {
        // Create an Instructor object
        Instructor myInstructor =
            new Instructor("Kinder", "Kitty", "RH2010");

        // Create a TextBook object
        TextBook myTextBook = 
            new TextBook("Starting Out with Java",
            "Gaddis", "Pearson");
        
        // Create a Course object
        Course myCourse = 
            new Course("Intro to Java", myInstructor,
            myTextBook);

        // Display the course info
        System.out.println(myCourse);
    }
}
