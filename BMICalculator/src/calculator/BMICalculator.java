/*
 * By Gunawan Widya Nugraha
 * 1A Class
 * Faculty of Information Technology
 * Universitas Merdeka Malang
 */

/*
> License
    - This project is FREE, means you can used it without any credits
 */

/*
 * Update: 1.1.0
    - Include Category: Underweight, Normal, Overweight, Obesitas
 */

package calculator;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("         BMI Calculator");
        System.out.println("==================================");

        // Input berat dan tinggi
        System.out.print("Masukkan berat Anda (Kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan tinggi Anda (CM): ");
        double tinggi = scanner.nextDouble();

        // Create an object of BMICalculator
        BMIConstructor bmiCalculator = new BMIConstructor(berat, tinggi);

        // Output the results
        System.out.printf("BMI Anda adalah: %.2f%n", bmiCalculator.bmi);
        System.out.println("Kategori: " + bmiCalculator.getBMICategory());

        System.out.println("==================================");
        // Tutup scanner
        scanner.close();
    }
}
