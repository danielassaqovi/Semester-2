import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen12 data = new DataDosen12();
        int pilihan = 0;
        
        do {
            System.out.println("\n=== MENU APLIKASI DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (pilihan) {
                    case 1:
                        System.out.println("\n=== TAMBAH DATA DOSEN ===");
                        System.out.print("Kode: ");
                        String kode = scanner.nextLine();
                        
                        System.out.print("Nama: ");
                        String nama = scanner.nextLine();
                        
                        System.out.print("Jenis Kelamin (1: Laki-laki, 0: Perempuan): ");
                        int jkInput = scanner.nextInt();
                        Boolean jenisKelamin = (jkInput == 1);
                        
                        System.out.print("Usia: ");
                        int usia = scanner.nextInt();
                        
                        Dosen12 dosen = new Dosen12(kode, nama, jenisKelamin, usia);
                        data.tambah(dosen);
                        break;
                        
                    case 2:
                        data.tampil();
                        break;
                        
                    case 3:
                        data.sortingASC();
                        data.tampil();
                        break;
                        
                    case 4:
                        data.sortingDSC();
                        data.tampil();
                        break;
                        
                    case 5:
                        data.insertionSort();
                        data.tampil();
                        break;
                        
                    case 0:
                        System.out.println("Terima kasih telah menggunakan aplikasi!");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid! Silakan coba lagi.");
                scanner.nextLine(); 
                pilihan = -1;
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}