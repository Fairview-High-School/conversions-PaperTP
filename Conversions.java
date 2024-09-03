import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author PaperTP
 * @version 8/23/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Meters to Kilometers");
        System.out.println("8. Kilometers to Meters");
        System.out.println("9. Feet to Inches");
        System.out.println("10. Inches to Feet");
        System.out.println("11. Inches to Centimeters");
        System.out.println("12. Centimeters to Inches");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit-32) * (5.0/9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees fahrenheit");
        }
        if (selection == 3)
        {
            System.out.println("Enter feet ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet / 3.3;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * 3.3;
            System.out.println(meters + " meters is " + feet + " feet");  
        }
        if (selection == 5)
        {
            System.out.println("Enter ounces ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.574;
            System.out.println(ounces + " ounces is " + milliliters + " mililiters");  
        }        
        if (selection == 6)
        {
            System.out.println("Enter mililiters ");
            double mililiters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = mililiters / 29.574;
            System.out.println(mililiters + " mililiters is " + ounces + " ounces");  
        }
        if (selection == 7)
        {
            System.out.println("Enter meters:");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = meters / 1000;
            System.out.println(meters + " meters is " + kilometers +  "kilometers");
        }
        if (selection == 8)
        {
            System.out.println("Enter Kilometers ");
            double kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = kilometers * 1000;
            System.out.println(kilometers + " kilometers is " + meters + " meters");
        }
        
        if (selection == 9)
        {
            System.out.println("Enter feet ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = feet * 12;
            System.out.println(feet + " feet is " + inches + " inches");
        }
        if (selection == 10)
        {
            System.out.println("Enter inches ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double feet =  inches / 12;
            System.out.println(inches + " inches is " + feet + " feet");
        }
        if (selection == 11)
        {
            System.out.println("Enter inches ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = inches * 2.54;
            System.out.println(inches + " inches is " + centimeters + " centimeters");
        }
        if (selection == 12)
        {
            System.out.println("Enter centimeters ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = centimeters / 2.54;
            System.out.println(centimeters + " centimeters is " + inches + " inches");
        }
}}