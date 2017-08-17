package calcimc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcIMC {

    private static final Scanner scanner = new Scanner(System.in);
    private static double weight;
    private static double height;
    
    private static double calculateImc(double weight, double height) {
        return (weight / (height * height));
    }
    
    public static void main(String[] args) throws InputMismatchException {
        System.out.println(".::Welcome to IMC Calculator!::.");
        
        try {
            System.out.print("What\'s your weight? ");
            weight = scanner.nextDouble();
            
            System.out.print("And your height? ");
            height = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number");
        }
        
        /*
         * Calls method to verify if imc is normal or overweighted,
         * passing imc count result as parameter
         */
        checkIMC(calculateImc(weight, height));
    }
    
    private static void checkIMC(double imc) { 
        if (imc <= 20.6) {
            System.out.format("Your IMC is %.2f, is  below normal!", imc);
        } else if (imc > 20.7 && imc <= 26.3) {
            System.out.format("Your IMC is %.2f, is ideal!", imc);
        } else if (imc > 26.3 && imc <= 27.8) {
            System.out.format("Your IMC is %.2f, is above normal!", imc);
        } else {
            System.out.format("Your IMC is %.2f, obesity!", imc);
        }
    }
}
