package PRAK201_2510817120022_NadyaNadhirSoraya;

public class soal1Main {

    public static void main(String[] args) {

        buah apel = new buah();
        apel.namaBuah = "Apel";
        apel.beratDasar = 0.4;
        apel.hargaDasar = 7000.0;
        apel.totalBeratBeli = 40.0;
        apel.displayInfo();

        buah mangga = new buah();
        mangga.namaBuah = "mangga";
        mangga.beratDasar = 0.2;
        mangga.hargaDasar = 3500.0;
        mangga.totalBeratBeli = 15.0;
        mangga.displayInfo();

        buah alpukat = new buah();
        alpukat.namaBuah = "alpukat";
        alpukat.beratDasar = 0.25;
        alpukat.hargaDasar = 10000.0;
        alpukat.totalBeratBeli = 12.0;
        alpukat.displayInfo();

    }
}