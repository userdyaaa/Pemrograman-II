import java.util.Scanner;

public class PRAK101_2510817120022_NadyaNadhirSoraya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);

        ValidasiTanggal validasi = new ValidasiTanggal();

        try {
            System.out.print("Masukkan Nama Lengkap: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Tempat Lahir: ");
            String tempat = input.nextLine();

            System.out.print("Masukkan Tanggal Lahir: ");
            int tanggal = input.nextInt();

            System.out.print("Masukkan Bulan Lahir: ");
            int bulan = input.nextInt();

            System.out.print("Masukkan Tahun Lahir: ");
            int tahun = input.nextInt();

            System.out.print("Masukkan Tinggi Badan: ");
            int tinggi = input.nextInt();

            System.out.print("Masukkan Berat Badan: ");
            double berat = input.nextDouble();

            if (validasi.cekValid(tanggal, bulan, tahun) == false) {
                System.out.println("Penginputan Tahun Salah, Tanggal tidak valid");
                System.exit(0);
            }

            String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                    "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

            System.out.println("\nOutput");
            System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
            System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");

        } catch (Exception e) {
            System.out.println("Tipe data input salah! Harap masukkan angka untuk bagian tanggal, bulan, tahun, tinggi, dan berat.");
            System.exit(0);
        } finally {
            input.close();
        }
    }
}

class ValidasiTanggal {

    boolean cekLeapYear(int tahun) {
        if (tahun % 400 == 0) return true;
        if (tahun % 100 == 0) return false;
        if (tahun % 4 == 0) return true;
        return false;
    }

    boolean cekValid(int hari, int bulan, int tahun) {
        if (bulan < 1 || bulan > 12 || hari < 1) return false;
        int batasHari = 31;

        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            batasHari = 30;
        }
        // khusus bulan februari
        else if (bulan == 2) {
            if (cekLeapYear(tahun)) {
                batasHari = 29;
            } else {
                batasHari = 28;
            }
        }

        if (hari > batasHari) return false;
        return true;
    }
}