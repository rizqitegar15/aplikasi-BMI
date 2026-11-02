package model;

public class Model {

    public double hitungBMI(double beratKg, double tinggiCm) {
        if (tinggiCm <= 0) return 0;
        double tinggiMeter = tinggiCm / 100.0;
        return beratKg / (tinggiMeter * tinggiMeter);
    }

    public String getKategori(double bmi) {
        if (bmi <= 0) {
            return "-";
        } else if (bmi < 18.5) {
            return "Kekurangan Berat Badan (Underweight)";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal (Ideal)";
        } else if (bmi >= 25.0 && bmi < 29.9) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}