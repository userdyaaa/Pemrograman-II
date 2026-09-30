import java.util.Scanner;

public class PRAK104_2510817120022_NadyaNadhirSoraya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = input.next();
        String abu2 = input.next();
        String abu3 = input.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = input.next();
        String bagas2 = input.next();
        String bagas3 = input.next();

        int poinAbu = 0;
        int poinBagas = 0;

        // ronde 1
        if (abu1.equals(bagas1)) {
        } else if (abu1.equals("B") && bagas1.equals("G")) {
            poinAbu++;
        } else if (abu1.equals("G") && bagas1.equals("K")) {
            poinAbu++;
        } else if (abu1.equals("K") && bagas1.equals("B")) {
            poinAbu++;
        } else {
            poinBagas++;
        }

        // ronde 2
        if (abu2.equals(bagas2)) {
        } else if (abu2.equals("B") && bagas2.equals("G")) {
            poinAbu++;
        } else if (abu2.equals("G") && bagas2.equals("K")) {
            poinAbu++;
        } else if (abu2.equals("K") && bagas2.equals("B")) {
            poinAbu++;
        } else {
            poinBagas++;
        }

        // --- CEK RONDE 3 ---
        if (abu3.equals(bagas3)) {
            // Seri, tidak ada yang dapat poin
        } else if (abu3.equals("B") && bagas3.equals("G")) {
            poinAbu++;
        } else if (abu3.equals("G") && bagas3.equals("K")) {
            poinAbu++;
        } else if (abu3.equals("K") && bagas3.equals("B")) {
            poinAbu++;
        } else {
            poinBagas++;
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}