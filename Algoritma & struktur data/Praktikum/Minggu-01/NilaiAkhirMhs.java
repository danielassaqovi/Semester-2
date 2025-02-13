import java.util.Scanner;

public class NilaiAkhirMhs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("program menghitung nilai akhir");
    System.out.println("=----------------------------------=");
    // Input nilai dari pengguna
    System.out.print("Masukkan nilai tugas: ");
    double nilaiTugas = scanner.nextDouble();
    System.out.print("Masukkan nilai kuis: ");
    double nilaiKuis = scanner.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    double nilaiUTS = scanner.nextDouble();
    System.out.print("Masukkan nilai UAS: ");
    double nilaiUAS = scanner.nextDouble();

    double nilaiAkhir = 0; // Deklarasi variabel nilaiAkhir di luar blok if-else

    if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0) {
      System.out.println("Nilai tidak valid");
    } else {
      nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
      System.out.println("=----------------------------------=");
      System.out.println("=----------------------------------=");
      System.out.println("Nilai akhir mahasiswa adalah: " + nilaiAkhir);
    }
   
    // Konversi nilai dengan huruf
    String nilaiHuruf;
    if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
      nilaiHuruf = "A";
    } else if (nilaiAkhir > 73) {
      nilaiHuruf = "B+";
    } else if (nilaiAkhir > 65) {
      nilaiHuruf = "B";
    } else if (nilaiAkhir > 60) {
      nilaiHuruf = "C+";
    } else if (nilaiAkhir > 50) {
      nilaiHuruf = "C";
    } else if (nilaiAkhir > 39) {
      nilaiHuruf = "D";
    } else {
      nilaiHuruf = "E";
    }
    
    System.out.println("Nilai huruf: " + nilaiHuruf);

    //output 
    if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
      System.out.println("=----------------------------------=");
      System.out.println("=----------------------------------=");
      System.out.println("SELAMAT ANDA LULUS");
    } else {
      System.out.println("TIDAK LULUS");
    }
  }
}
