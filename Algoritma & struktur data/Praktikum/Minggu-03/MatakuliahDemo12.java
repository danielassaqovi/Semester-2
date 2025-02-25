
import java.util.Scanner;

public class MatakuliahDemo12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //input jumlah matkul
      System.out.println("Jumlah Matkul: ");
      int jmlmtkl = sc.nextInt();
      sc.nextLine();
      Matakuliah12 [] arraayOfMatakuliah = new Matakuliah12[jmlmtkl];
      String kode, nama, jam;
      int sks, jumlahJam;

      //proses
      for (int i = 0; i < arraayOfMatakuliah.length; i++) {
        System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        System.out.print("Kode\t: ");
        kode = sc.nextLine();
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("SKS\t: ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam\t: ");
        jumlahJam = sc.nextInt();
        jam = sc.nextLine();
        arraayOfMatakuliah[i] = new Matakuliah12(kode, nama, sks, jumlahJam);
        System.out.println("----------------------------------------");

        //method tambahData
          arraayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
      }

        //method cetakInfo
        for (int i = 0; i < arraayOfMatakuliah.length; i++) {
          arraayOfMatakuliah[i].cetakInfo();
        }

      // for (int i = 0; i < 3; i++) {
      //   System.out.println("Kode\t:" + arraayOfMatakuliah[i].kode);
      //   System.out.println("Nama\t:" + arraayOfMatakuliah[i].nama);
      //   System.out.println("SKS\t:" + arraayOfMatakuliah[i].sks);
      //   System.out.println("Jumlah Jam\t:" + arraayOfMatakuliah[i].jumlahJam);
      //   System.out.println("----------------------------------------");
      // }
  }
}