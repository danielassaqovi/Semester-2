import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=++++++++++++++++++++++++++++++++=");
    System.out.println(" Menghitung nilai akhir mahasiswa");
    System.out.println("=++++++++++++++++++++++++++++++++=\n");

    // Input jumlah mata kuliah
    System.out.print("Masukkan jumlah mata kuliah: ");
    int jumlahMataKuliah = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    // Deklarasi mata kuliah
    String[] mataKuliah = new String[jumlahMataKuliah];
    int[] nilaiMahasiswa = new int[jumlahMataKuliah];

    // Input nama mata kuliah dari pengguna
    for (int i = 0; i < jumlahMataKuliah; i++) {
      System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
      mataKuliah[i] = scanner.nextLine();
    }

    // Input nilai dari pengguna
    for (int i = 0; i < jumlahMataKuliah; i++) {
      System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
      nilaiMahasiswa[i] = scanner.nextInt();
    }

    // Menampilkan tabel hasil
    System.out.println("=++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
    System.out.printf("%-15s %-15s %-15s %-15s %-20s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "Kualifikasi");
    System.out.println("=------------------------------------------------------------------------------------------=");

    int totalNilai = 0;
    double totalNilaiSetara = 0.0;
    
    for (int i = 0; i < jumlahMataKuliah; i++) {
      int nilai = nilaiMahasiswa[i];
      String nilaiHuruf = "";
      double nilaiIp = 0.0;
      String kualifikasi = "";

      // Menentukan nilai huruf, nilai setara, dan kualifikasi sesuai tabel
      if (nilai > 80) {
        nilaiHuruf = "A";
        nilaiIp = 4.0;
        kualifikasi = "Sangat Baik";
      } else if (nilai > 73) {
        nilaiHuruf = "B+";
        nilaiIp = 3.5;
        kualifikasi = "Lebih dari Baik";
      } else if (nilai > 65) {
        nilaiHuruf = "B";
        nilaiIp = 3.0;
        kualifikasi = "Baik";
      } else if (nilai > 60) {
        nilaiHuruf = "C+";
        nilaiIp = 2.5;
        kualifikasi = "Lebih dari Cukup";
      } else if (nilai > 50) {
        nilaiHuruf = "C";
        nilaiIp = 2.0;
        kualifikasi = "Cukup";
      } else if (nilai > 39) {
        nilaiHuruf = "D";
        nilaiIp = 1.0;
        kualifikasi = "Kurang";
      } else {
        nilaiHuruf = "E";
        nilaiIp = 0.0;
        kualifikasi = "Gagal";
      }

      // Cetak hasil dalam bentuk tabel
      System.out.printf("%-15s %-15d %-15s %-15.1f %-20s%n", mataKuliah[i], nilai, nilaiHuruf, nilaiIp, kualifikasi);
      
      totalNilai += nilai;
      totalNilaiSetara += nilaiIp;
    }

    // Menghitung rata-rata nilai angka dan nilai setara
    double rataRataNilai = (double) totalNilai / jumlahMataKuliah;
    double rataRataSetara = totalNilaiSetara / jumlahMataKuliah;
    String hurufRataRata = "";

    if (rataRataNilai > 80) {
      hurufRataRata = "A";
    } else if (rataRataNilai > 73) {
      hurufRataRata = "B+";
    } else if (rataRataNilai > 65) {
      hurufRataRata = "B";
    } else if (rataRataNilai > 60) {
      hurufRataRata = "C+";
    } else if (rataRataNilai > 50) {
      hurufRataRata = "C";
    } else if (rataRataNilai > 39) {
      hurufRataRata = "D";
    } else {
      hurufRataRata = "E";
    }

    System.out.println("=++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=\n");
    System.out.printf("IP: %.2f%n", rataRataSetara);

    scanner.close();
  }
}
