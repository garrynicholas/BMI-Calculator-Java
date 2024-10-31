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

/**
 *
 * @author USER
 */
public class BMIConstructor {
    // Atribut
    public double berat; 
    public double tinggi; 
    public double bmi;

    // Constructor
    public BMIConstructor(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi /100; // buat heig
        this.bmi = calculateBMI(); // Kalkulasi BMI ketika objek dibuat
    }

    // Method untuk menghitung BMI
    private double calculateBMI() {
        return berat / (tinggi * tinggi);
    }

    // Method untuk mendapatkan kategori BMI
    public String getBMICategory() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
