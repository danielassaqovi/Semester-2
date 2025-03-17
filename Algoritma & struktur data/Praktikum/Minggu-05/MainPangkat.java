
import java.util.Scanner;

public class MainPangkat{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan Jumlah elemen: ");
      int elemen = input.nextInt();

      //intansiasi array objek
      Pangkat[] png = new Pangkat[elemen];
      for(int i = 0; i < elemen; i++){
          System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
          int basis = input.nextInt();
          System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
          int pangkat = input.nextInt();
          png[i] = new Pangkat(basis, pangkat);
      }

      //method PangkatBF
      System.out.println("HASIL PANGKAT BRUTEFORCE");
      for(Pangkat p : png){
          System.out.println("Nilai " + p.nilai + "^" + p.pangkat + " adalah: " + p.PangkatBF(p.nilai, p.pangkat));
      }

      //method PangkatDC
      System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
      for(Pangkat p : png){
          System.out.println("Nilai " + p.nilai + "^" + p.pangkat + " adalah: " + p.PangkatDC(p.nilai, p.pangkat));
      }
  }
}