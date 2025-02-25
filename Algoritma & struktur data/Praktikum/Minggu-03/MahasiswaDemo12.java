
import java.util.Scanner;

public class MahasiswaDemo12{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      Mahasiswa12 [] arraayOfMahasiswa = new Mahasiswa12[3];
      //perulangan
      for (int i = 0; i < arraayOfMahasiswa.length; i++) {
        arraayOfMahasiswa[i] = new Mahasiswa12();

        //input
        System.err.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        System.out.print("NIM\t: ");
        arraayOfMahasiswa[i].nim = sc.nextLine();
        System.out.print("Nama\t: ");
        arraayOfMahasiswa[i].nama = sc.nextLine();
        System.out.print("Kelas\t: ");
        arraayOfMahasiswa[i].kelas = sc.nextLine();
        System.out.print("IPK\t: ");
        arraayOfMahasiswa[i].ipk = sc.nextFloat();
        sc.nextLine();
        System.out.println("----------------------------------------");

      }
      //output
        for (int i=0; i<3; i++){
          System.out.println("NIM\t:" + arraayOfMahasiswa[i].nim);
          System.out.println("Nama\t:" + arraayOfMahasiswa[i].nama);
          System.out.println("Kelas\t:" + arraayOfMahasiswa[i].kelas);
          System.out.println("IPK\t:" + arraayOfMahasiswa[i].ipk);
          System.out.println("----------------------------------------");
        
      }


      // arraayOfMahasiswa[0] = new Mahasiswa12();
      // arraayOfMahasiswa[0].nim = "123";
      // arraayOfMahasiswa[0].nama = "Budi";
      // arraayOfMahasiswa[0].kelas = "A";
      // arraayOfMahasiswa[0].ipk = 3.5f;

      // arraayOfMahasiswa[1] = new Mahasiswa12();
      // arraayOfMahasiswa[1].nim = "124";
      // arraayOfMahasiswa[1].nama = "Susi";
      // arraayOfMahasiswa[1].kelas = "B";
      // arraayOfMahasiswa[1].ipk = 3.6f;

      // arraayOfMahasiswa[2] = new Mahasiswa12();
      // arraayOfMahasiswa[2].nim = "125";
      // arraayOfMahasiswa[2].nama = "Rudi";
      // arraayOfMahasiswa[2].kelas = "C";
      // arraayOfMahasiswa[2].ipk = 3.7f;

      // System.out.println("NIM\t:" + arraayOfMahasiswa[0].nim);
      // System.out.println("Nama\t:" + arraayOfMahasiswa[0].nama);
      // System.out.println("Kelas\t:" + arraayOfMahasiswa[0].kelas);
      // System.out.println("IPK\t:" + arraayOfMahasiswa[0].ipk);
      // System.out.println("----------------------------------------");
      // System.out.println("NIM\t:" + arraayOfMahasiswa[1].nim);
      // System.out.println("Nama\t:" + arraayOfMahasiswa[1].nama);
      // System.out.println("Kelas\t:" + arraayOfMahasiswa[1].kelas);
      // System.out.println("IPK\t:" + arraayOfMahasiswa[1].ipk);
      // System.out.println("----------------------------------------");
      // System.out.println("NIM\t:" + arraayOfMahasiswa[2].nim);
      // System.out.println("Nama\t:" + arraayOfMahasiswa[2].nama);
      // System.out.println("Kelas\t:" + arraayOfMahasiswa[2].kelas);
      // System.out.println("IPK\t:" + arraayOfMahasiswa[2].ipk);
      // System.out.println("----------------------------------------");

  }
}