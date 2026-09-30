import java.util.Scanner;

public class PRAK103_2510817120022_NadyaNadhirSoraya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int bilangan = input.nextInt();

        int jumlahCetak = 0;

        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                jumlahCetak++;

                if (jumlahCetak < n) {
                    System.out.print(", ");
                }
            }
            bilangan++;
        } while (jumlahCetak < n);

        input.close();
    }
}