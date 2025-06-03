import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList12 sll = new SingleLinkedList12();
        int menu;

        do {
            System.out.println("\n=========================");
            System.out.println("LINKED LIST MAHASISWA");
            System.out.println("=========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Tambah Data Setelah Nama");
            System.out.println("5. Hapus Data Pertama");
            System.out.println("6. Hapus Data Terakhir");
            System.out.println("7. Hapus Data Tertentu");
            System.out.println("8. Hapus Data pada Posisi Tertentu");
            System.out.println("9. Cari Data");
            System.out.println("10. Tampil Data");
            System.out.println("11. Cek Data pada Indeks Tertentu");
            System.out.println("0. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (menu) {
                case 1:
                    System.out.println("\nTambah Data Awal");
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    
                    Mahasiswa12 mhs = new Mahasiswa12(nama, nim, kelas, ipk);
                    sll.addFirst(mhs);
                    break;

                case 2:
                    System.out.println("\nTambah Data Akhir");
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    ipk = sc.nextDouble();
                    
                    mhs = new Mahasiswa12(nama, nim, kelas, ipk);
                    sll.addLast(mhs);
                    break;

                case 3:
                    System.out.println("\nTambah Data Index Tertentu");
                    System.out.print("Masukkan Index: ");
                    int index = sc.nextInt();
                    sc.nextLine();  // clear buffer
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    ipk = sc.nextDouble();
                    
                    mhs = new Mahasiswa12(nama, nim, kelas, ipk);
                    sll.insertAt(index, mhs);
                    break;

                case 4:
                    System.out.println("\nTambah Data Setelah Nama");
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String key = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    ipk = sc.nextDouble();
                    
                    mhs = new Mahasiswa12(nama, nim, kelas, ipk);
                    sll.insertAfter(key, mhs);
                    break;

                case 5:
                    System.out.println("\nHapus Data Pertama");
                    sll.removeFirst();
                    System.out.println("Data pertama berhasil dihapus!");
                    break;

                case 6:
                    System.out.println("\nHapus Data Terakhir");
                    sll.removeLast();
                    System.out.println("Data terakhir berhasil dihapus!");
                    break;

                case 7:
                    System.out.println("\nHapus Data Tertentu");
                    System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                    key = sc.nextLine();
                    sll.remove(key);
                    System.out.println("Data mahasiswa dengan nama " + key + " berhasil dihapus!");
                    break;

                case 8:
                    System.out.println("\nHapus Data pada Posisi Tertentu");
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    index = sc.nextInt();
                    sll.removeAt(index);
                    System.out.println("Data pada indeks ke-" + index + " berhasil dihapus!");
                    break;

                case 9:
                    System.out.println("\nCari Data");
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    key = sc.nextLine();
                    index = sll.indexOf(key);
                    if (index != -1) {
                        System.out.println("Data " + key + " berada pada indeks ke-" + index);
                    } else {
                        System.out.println("Data " + key + " tidak ditemukan!");
                    }
                    break;

                case 10:
                    System.out.println("\nData dalam Linked List:");
                    sll.print();
                    break;

                case 11:
                    System.out.println("\nCek Data pada Indeks Tertentu");
                    System.out.print("Masukkan indeks yang ingin dilihat: ");
                    index = sc.nextInt();
                    try {
                        System.out.println("Data pada indeks ke-" + index + ":");
                        sll.getdata(index);
                    } catch (Exception e) {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;

                case 0:
                    System.out.println("\nTerima kasih!");
                    break;

                default:
                    System.out.println("\nMenu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}