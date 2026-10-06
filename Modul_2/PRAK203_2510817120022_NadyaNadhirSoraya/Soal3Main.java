package PRAK203_2510817120022_NadyaNadhirSoraya;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) yang merupakan syarat wajib untuk mengakhiri sebuah pernyataan (statement) di Java.
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Atribut umur belum diisi sebelumnya, sehingga jika langsung dicetak akan menghasilkan nilai default 0. Maka kita perlu menginisialisasi nilainya di sini agar sesuai dengan output.
        p1.umur = 17;

        // Pada baris ini terjadi error ketidaksesuaian output. Teks cetakan tertulis "Nama Pegawai: ", padahal output yang diminta oleh soal hanyalah "Nama: ".
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini terjadi error ketidaksesuaian output. Pada kode asli, kata " tahun" tidak ditambahkan di akhir pencetakan umur.
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}