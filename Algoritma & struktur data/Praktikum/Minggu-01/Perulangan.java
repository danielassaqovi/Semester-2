import java.util.Scanner;

public class Perulangan {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan NIM Anda: ");
    int nim = scanner.nextInt();

    //ambil 2 digit terakhir dari NIM
    int duaDigitTerakhir = nim % 100;

    //perhitungan
    for (int i = 1; i <= duaDigitTerakhir; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      } else {
        System.out.print("* ");
      }
    }
  }
}