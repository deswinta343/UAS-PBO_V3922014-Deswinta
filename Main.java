package uas.pbo;

// Contoh pembuatan kelas Mahasiswa
class Mahasiswa {
    // Atribut
    private String nama;  // Atribut untuk menyimpan nama mahasiswa
    private String nim;   // Atribut untuk menyimpan NIM mahasiswa
    private int usia;     // Atribut untuk menyimpan usia mahasiswa

    // Konstruktor
    public Mahasiswa(String nama, String nim, int usia) {
        this.nama = nama; // Menginisialisasi atribut nama dengan nilai dari parameter nama
        this.nim = nim;   // Menginisialisasi atribut nim dengan nilai dari parameter nim
        this.usia = usia; // Menginisialisasi atribut usia dengan nilai dari parameter usia
    }
    // Metode
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);              // Menampilkan nilai atribut nama
        System.out.println("NIM: " + nim);                // Menampilkan nilai atribut nim
        System.out.println("Usia: " + usia + " tahun");   // Menampilkan nilai atribut usia
    }
}
// Contoh penggunaan kelas Mahasiswa
public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa1
        Mahasiswa mahasiswa1 = new Mahasiswa("John Doe", "123456789", 20);
        // Memanggil metode tampilkanInfo() pada objek mahasiswa1
        mahasiswa1.tampilkanInfo();

        // Membuat objek mahasiswa2
        Mahasiswa mahasiswa2 = new Mahasiswa("Jane Smith", "987654321", 22);
        // Memanggil metode tampilkanInfo() pada objek mahasiswa2
        mahasiswa2.tampilkanInfo();
    }
}
