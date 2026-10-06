package PRAK203_2510817120022_NadyaNadhirSoraya;

// Pada baris ini terjadi error karena nama class (Employee) tidak sama dengan nama file programnya (Pegawai.java). Dalam Java, nama public class harus sama persis dengan nama filenya.
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data char hanya bisa menampung 1 karakter tunggal. Sedangkan data asal yang diinputkan adalah kalimat ("Kingdom of Orvel"), sehingga seharusnya menggunakan String.
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method setJabatan() tidak memiliki parameter untuk menerima data, padahal di Soal3Main method ini dipanggil dengan argumen berupa String. Selain itu, variabel 'j' juga belum dideklarasikan sebelumnya.
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}