package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();

        // HashMap untuk nama-nama bulan
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = scanner.nextInt();
                int bulan = scanner.nextInt();
                int tahun = scanner.nextInt();
                scanner.nextLine();

                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        for (int i = 0; i < daftarNegara.size(); i++) {
            Negara negara = daftarNegara.get(i);

            if (negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.println("Negara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin() + "\n");
            } else {
                System.out.println("Negara " + negara.getNama() + " mempunyai " + negara.getJenisKepemimpinan() + " bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + namaBulan.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan() + "\n");
            }
        }

        scanner.close();
    }
}