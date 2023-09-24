import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("\nTemperature Converter\n");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Convert from: ");
        int opt = myObj.nextInt();
        System.out.println("\n1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Convert to: ");
        int opt2 = myObj.nextInt(); //read option 2

        System.out.print("Enter the temperature: ");
        double temp = myObj.nextDouble(); //read celsius

        Calculation calculation = new Calculation(temp);

        //switch method
        switch (opt){
            case 1:
                if (opt2 == 2){ //Celsius to Fahrenheit
                    double celsius = (double) calculation.getCelsius();
                    System.out.println("\nFormula: F = C * (9/5) + 32");
                    System.out.print(celsius + "° Degree Celsius is ");
                    calculation.findCtoF();
                }
                else if (opt2 == 3){ //Celsius to Kelvin
                    double celsius = (double) calculation.getCelsius();
                    System.out.println("\nFormula: K = C + 273.15");
                    System.out.print(celsius + "° Degree Celsius is ");
                    calculation.findCtoK();
                }
                break;
            case 2:
                if (opt2 == 1){ //Fahrenheit to Celsius
                    double fahrenheit = (double) calculation.getFahrenheit();
                    System.out.println("\nFormula: C = (F - 32) * (5/9)");
                    System.out.print(fahrenheit + "° Fahrenheit is ");
                    calculation.findFtoC();
                }
                else if (opt2 == 3){ //Fahrenheit to Kelvin
                    double fahrenheit = (double) calculation.getFahrenheit();
                    System.out.println("\nFormula: C = (F - 32) * (5/9) + 273.15");
                    System.out.print(fahrenheit + "° Fahrenheit is ");
                    calculation.findFtoK();
                }
                else{
                    System.out.println("Cannot be converted.");
                }
                break;
            case 3:
                if (opt2 == 1){ //Kelvin to Celsius
                    double kelvin = (double) calculation.getKelvin();
                    System.out.println("\nFormula: C = K - 273.15");
                    System.out.print(kelvin + "° Kelvin is ");
                    calculation.findKtoC();
                }
                else if (opt2 == 2){ //Kelvin to Fahrenheit
                    double kelvin = (double) calculation.getKelvin();
                    System.out.println("\nFormula: F = (K - 273.15) * (9/5) +32");
                    System.out.print(kelvin + "° Kelvin is ");
                    calculation.findKtoF();
                }
                else{
                    System.out.println("Cannot be converted.");
                }
                break;
            default:
                System.out.println("Cannot be converted.");
        }

    }
}

