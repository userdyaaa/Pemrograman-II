package Soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<dadu> daftarDadu = new LinkedList<>();

        int jumlahDadu = scanner.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            daftarDadu.add(new dadu());
        }

        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilaiDadu = daftarDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
            totalNilai += nilaiDadu;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        scanner.close();
    }
}