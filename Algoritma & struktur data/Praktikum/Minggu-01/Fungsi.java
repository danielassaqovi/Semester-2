import java.util.Scanner;

public class Fungsi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //header
    System.out.println(" ===================================");
    System.out.println("============ Royal Garden ===========");
    System.out.println(" ===================================");

    //deklarasi array 2 dimensi
    int stokBarang[][] = new int[4][4];
    String namaBarang[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    int hargaBarang[] = {75000, 50000, 60000, 10000};

    //fungsi input nama cabang toko
    String[] namaCabang = inputNamaCabang(scanner);

    // Input stok barang
    inputStokBarang(scanner, stokBarang, namaCabang, namaBarang);

    // Cetak tabel stok barang
    cetakTabelStokBarang(stokBarang, namaCabang, namaBarang);

    // Hitung total stok dan sesuaikan untuk bunga mati
    int[] totalStok = hitungTotalStok(stokBarang, namaBarang);
    sesuaikanStokUntukBungaMati(totalStok, namaBarang);

    // Cetak stok yang disesuaikan
    cetakStokDisesuaikan(totalStok, namaBarang);

    // Hitung dan cetak pendapatan setiap cabang
    hitungPendapatanCabang(stokBarang, hargaBarang, namaCabang);
  }
  //fungsi input nama cabang toko
  private static String[] inputNamaCabang(Scanner scanner) {
    String[] namaCabang = new String[4];
    for (int i = 0; i < 4; i++) {
      System.out.print("Masukkan nama cabang toko ke-" + (i + 1) + ": ");
      namaCabang[i] = scanner.nextLine();
    }
    return namaCabang;
  }
  // Input stok barang
  private static void inputStokBarang(Scanner scanner, int[][] stokBarang, String[] namaCabang, String[] namaBarang) {
    for (int i = 0; i < 4; i++) {
      System.out.println("Masukkan stok barang untuk cabang " + namaCabang[i] + ":");
      for (int j = 0; j < 4; j++) {
        System.out.print(namaBarang[j] + ": ");
        stokBarang[i][j] = scanner.nextInt();
      }
      scanner.nextLine();
    }
  }
  //fungsi cetak tabel stok barang
  private static void cetakTabelStokBarang(int[][] stokBarang, String[] namaCabang, String[] namaBarang) {
    System.out.println("\nTabel Stok Barang:");
    System.out.print("Cabang\t\t");
    for (String barang : namaBarang) {
      System.out.print(barang + "\t");
    }
    System.out.println();
    for (int i = 0; i < stokBarang.length; i++) {
      System.out.print(namaCabang[i] + "\t");
      for (int j = 0; j < stokBarang[i].length; j++) {
        System.out.print(stokBarang[i][j] + "\t\t");
      }
      System.out.println();
    }
  }
  //fungsi hitung total stok
  private static int[] hitungTotalStok(int[][] stokBarang, String[] namaBarang) {
    int[] totalStok = new int[namaBarang.length];
    for (int i = 0; i < stokBarang.length; i++) {
      for (int j = 0; j < stokBarang[i].length; j++) {
        totalStok[j] += stokBarang[i][j];
      }
    }
    return totalStok;
  }
  //fungsi sesuaikan stok untuk bunga mati
  private static void sesuaikanStokUntukBungaMati(int[] totalStok, String[] namaBarang) {
    int[] bungaMati = {-1, -2, 0, -5};
    for (int i = 0; i < totalStok.length; i++) {
      totalStok[i] += bungaMati[i];
    }
  }
  //fungsi cetak stok disesuaikan
  private static void cetakStokDisesuaikan(int[] totalStok, String[] namaBarang) {
    System.out.println("Stok bunga setelah penyesuaian:");
    for (int i = 0; i < namaBarang.length; i++) {
      System.out.println(namaBarang[i] + ": " + totalStok[i]);
    }
  }
  //fungsi hitung pendapatan cabang
  private static void hitungPendapatanCabang(int[][] stokBarang, int[] hargaBarang, String[] namaCabang) {
    System.out.println("\nPendapatan setiap cabang jika semua bunga habis terjual:");
    for (int i = 0; i < stokBarang.length; i++) {
      int pendapatan = 0;
      for (int j = 0; j < stokBarang[i].length; j++) {
        pendapatan += stokBarang[i][j] * hargaBarang[j];
      }
      System.out.println(namaCabang[i] + ": Rp " + pendapatan);
    }
  }
}