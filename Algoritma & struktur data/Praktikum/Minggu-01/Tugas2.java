import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //input jumlah mata kuliah
    System.out.print("Masukkan jumlah mata kuliah: ");
    int jumlahMataKuliah = sc.nextInt();
    sc.nextLine(); 
    //deklarasi array
    String[] namaMataKuliah = new String[jumlahMataKuliah];
    int[] sks = new int[jumlahMataKuliah];
    int[] semester = new int[jumlahMataKuliah];
    String[] hariKuliah = new String[jumlahMataKuliah];
    //input data mata kuliah
    for (int i = 0; i < jumlahMataKuliah; i++) {
      System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
      System.out.print("Nama mata kuliah: ");
      namaMataKuliah[i] = sc.nextLine();
      System.out.print("SKS: ");
      sks[i] = sc.nextInt();
      System.out.print("Semester: ");
      semester[i] = sc.nextInt();
      sc.nextLine(); 
      System.out.print("Hari kuliah: ");
      hariKuliah[i] = sc.nextLine();
    }
    //menu
    int pilihan;
    do {
      System.out.println("\nPilih opsi untuk menampilkan jadwal kuliah:");
      System.out.println("1. Menampilkan seluruh jadwal kuliah");
      System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
      System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
      System.out.println("4. Mencari mata kuliah berdasarkan nama");
      System.out.println("5. Keluar");
      System.out.print("Pilihan: ");
      pilihan = sc.nextInt();
      sc.nextLine(); 

      switch (pilihan) {
      case 1:
        tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
        break;
      case 2:
        System.out.print("Masukkan hari: ");
        String hari = sc.nextLine();
        tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
        break;
      case 3:
        System.out.print("Masukkan semester: ");
        int sem = sc.nextInt();
        sc.nextLine(); 
        tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
        break;
      case 4:
        System.out.print("Masukkan nama mata kuliah: ");
        String nama = sc.nextLine();
        cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
        break;
      case 5:
        System.out.println("Keluar dari program.");
        break;
      default:
        System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 5);

    sc.close();
  }

  //fungsi menampilkan seluruh jadwal
  public static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
    System.out.println("\nSeluruh jadwal kuliah:");
    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat",};
    for (String h : hari) {
      System.out.println("\nHari: " + h);
      System.out.println("-------------------------------------------------");
      System.out.printf("%-20s %-5s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester");
      System.out.println("-------------------------------------------------");
      for (int i = 0; i < namaMataKuliah.length; i++) {
        if (hariKuliah[i].equalsIgnoreCase(h)) {
          System.out.printf("%-20s %-5d %-10d\n", namaMataKuliah[i], sks[i], semester[i]);
        }
      }
    }
  }

  //fungsi menampilkan jadwal berdasarkan hari
  public static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
    System.out.println("\nJadwal kuliah pada hari " + hari + ":");
    System.out.println("-------------------------------------------------");
    System.out.printf("%-20s %-5s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < namaMataKuliah.length; i++) {
      if (hariKuliah[i].equalsIgnoreCase(hari)) {
        System.out.printf("%-20s %-5d %-10d\n", namaMataKuliah[i], sks[i], semester[i]);
      }
    }
  }

  //fungsi menampilkan jadwal berdasarkan semester
  public static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, int sem) {
    System.out.println("\nJadwal kuliah pada semester " + sem + ":");
    System.out.println("-------------------------------------------------");
    System.out.printf("%-20s %-5s %-10s\n", "Nama Mata Kuliah", "SKS", "Hari");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < namaMataKuliah.length; i++) {
      if (semester[i] == sem) {
        System.out.printf("%-20s %-5d %-10s\n", namaMataKuliah[i], sks[i], hariKuliah[i]);
      }
    }
  }

  //fungsi mencari mata kuliah berdasarkan nama
  public static void cariMataKuliah(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String nama) {
    System.out.println("\nHasil pencarian mata kuliah dengan nama \"" + nama + "\":");
    boolean ditemukan = false;
    System.out.println("-------------------------------------------------");
    System.out.printf("%-20s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < namaMataKuliah.length; i++) {
      if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
        System.out.printf("%-20s %-5d %-10d %-10s\n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
        ditemukan = true;
      }
    }
    if (!ditemukan) {
      System.out.println("Mata kuliah dengan nama \"" + nama + "\" tidak ditemukan.");
    }
  }
}