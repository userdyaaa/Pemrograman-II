package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> list = new ArrayList<>();
        int menu = -1;

        while (menu != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = input.nextLine();

                list.add(new Mahasiswa(nama, nim));
                System.out.println("Mahasiswa " + nama + " ditambahkan.\n");

            } else if (menu == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = input.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNim().equals(nimHapus)) {
                        list.remove(i);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.\n");
                        break;
                    }
                }

            } else if (menu == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nimCari = input.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNim().equals(nimCari)) {
                        System.out.println("NIM: " + list.get(i).getNim() + ", Nama: " + list.get(i).getNama());
                        break;
                    }
                }

            } else if (menu == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("NIM: " + list.get(i).getNim() + ", Nama: " + list.get(i).getNama());
                }
                System.out.println();

            } else if (menu == 0) {
                list.clear();
                System.out.println("Terima kasih!");
            }
        }

        input.close();
    }
}