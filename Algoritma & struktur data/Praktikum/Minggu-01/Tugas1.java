import java.util.Scanner;

public class Tugas1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Deklarasi
    int sisi;

    // Input
    System.out.print("Masukkan panjang sisi kubus: ");
    sisi = scanner.nextInt();

    boolean lanjut = true;
    while (lanjut) {
      tampilkanMenu(sisi, scanner);
      System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
      String pilihanLanjut = scanner.next();
      if (!pilihanLanjut.equalsIgnoreCase("y")) {
        lanjut = false;
      }
    }
  }
  // Fungsi untuk menampilkan menu
  public static void tampilkanMenu(int sisi, Scanner scanner) {

    System.out.println("Pilih rumus yang akan dihitung:");
    System.out.println("1. Volume kubus");
    System.out.println("2. Luas permukaan kubus");
    System.out.println("3. Keliling kubus");
    System.out.print("Masukkan pilihan (1/2/3): ");
    int pilihan = scanner.nextInt();

    // Perhitungan dan Output berdasarkan pilihan
    switch (pilihan) {
      case 1 -> {
        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus: " + volume);
      }
      case 2 -> {
        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
      }
      case 3 -> {
        int keliling = hitungKeliling(sisi);
        System.out.println("Keliling kubus: " + keliling);
      }
      default -> System.out.println("Pilihan tidak valid.");
    }
  }

  public static int hitungVolume(int sisi) {
    return sisi * sisi * sisi;
  }

  public static int hitungLuasPermukaan(int sisi) {
    return 6 * (sisi * sisi);
  }

  public static int hitungKeliling(int sisi) {
    return 12 * sisi;
  }
}
