
import java.util.Scanner;

public class MainSum{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan Jumlah elemen: ");
      int elemen = input.nextInt();

      //intansiasi objek
      Sum sm = new Sum(elemen);
      for(int i = 0; i < elemen; i++){
          System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
          sm.keuntungan[i] = input.nextDouble();  
      } 

      //method totalBF
      System.out.println("Total keuntunga menggunakan Bruteforce: " + sm.totalBF());
      //method totalDC
      System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));

  }
}