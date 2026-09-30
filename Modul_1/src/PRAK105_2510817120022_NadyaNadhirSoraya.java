import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817120022_NadyaNadhirSoraya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double volume = PHI * jari * jari * tinggi;
        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jari, tinggi, volume);

        input.close();
    }
}