import java.util.Scanner;

public class DosenDemo12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //input jumlah dosen
    System.out.print("Masukkan jumlah dosen : ");
    int jmlDosen = sc.nextInt();
    sc.nextLine();
    //array of object
    Dosen12[] arraayOfDosen = new Dosen12[jmlDosen];
    String kode, nama, jenisKelamin;
    int usia;
    //looping input data dosen
    for (int i = 0; i < arraayOfDosen.length; i++) {
      System.out.println("Masukkan Data Dosen ke-" + (i + 1));
      System.out.print("Kode\t: ");
      kode = sc.nextLine();
      System.out.print("Nama\t: ");
      nama = sc.nextLine();
      System.out.print("Jenis Kelamin(true = laki-laki)\t: ");
      boolean jk = sc.nextBoolean();
      jenisKelamin = jk ? "laki-laki" : "perempuan";
      System.out.print("Usia\t: ");
      usia = sc.nextInt();
      sc.nextLine();
      arraayOfDosen[i] = new Dosen12(kode, nama, jk, usia);
      System.out.println("----------------------------------------");
    }
    //output
    DataDosen12.dataSemuaDosen(arraayOfDosen);
    DataDosen12.jumlahDosenPerJenisKelamin(arraayOfDosen);
    DataDosen12.rataRataUsiaDosenPerJenisKelamin(arraayOfDosen);
    DataDosen12.dosenPalingTua(arraayOfDosen);
    DataDosen12.dosenPalingMuda(arraayOfDosen);
  }
}
