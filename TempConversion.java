import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner sc = new Scanner(System.in);
        
        // declare any other variables you may need
        double fahrenheit, kelvin;
        
        // collect the required inputs from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        
        // compute and store the required output values
        kelvin = FahrenheitToKelvin(fahrenheit);
        
        // display the required results
        System.out.printf("%.2f degrees Fahrenheit is %.2f Kelvin\n", fahrenheit, kelvin);
    }
    
    public static double FahrenheitToKelvin(double fahrenheit) {
        double kelvin = (5.0 / 9.0) * (fahrenheit - 32) + 273.15;
        return kelvin;
    }
}

