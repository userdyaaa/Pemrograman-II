import java.util.Scanner;

public class PRAK102_2510817120022_NadyaNadhirSoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka = scanner.nextInt();
        int count = 0;

        while (count < 10) {
            int angkaTampil = angka;

            if (angka % 5 == 0) {
                angkaTampil = (angka / 5) - 1;
            }

            System.out.print(angkaTampil);

            if (count < 9) {
                System.out.print(", ");
            }
            angka++;
            count++;
        }

        scanner.close();
    }
}