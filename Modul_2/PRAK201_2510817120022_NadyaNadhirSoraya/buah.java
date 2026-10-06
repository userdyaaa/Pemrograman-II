package PRAK201_2510817120022_NadyaNadhirSoraya;

public class buah {
    String namaBuah;
    double beratDasar;
    double hargaDasar;
    double totalBeratBeli;

    public double hitungHargaSebelumDiskon() {
        return (totalBeratBeli / beratDasar) * hargaDasar;
    }

    public double hitungTotalDiskon() {
        int jumlahKaliDiskon = (int) (totalBeratBeli / 4);
        double hargaUntuk4Kg = (4.0 / beratDasar) * hargaDasar;
        return jumlahKaliDiskon * (hargaUntuk4Kg * 0.02);
    }
    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void displayInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratDasar);
        System.out.println("Harga: " + hargaDasar);
        System.out.println("Jumlah Beli: " + totalBeratBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", hitungTotalDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hitungHargaSetelahDiskon());
    }
}