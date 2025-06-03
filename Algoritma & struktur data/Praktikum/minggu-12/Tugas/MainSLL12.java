import java.util.Scanner;

public class MainSLL12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        int menu;

        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("==============================");
            System.out.println("Jumlah Data: " + sll.getSize());
            System.out.println("------------------------------");
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
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\nTAMBAH DATA AWAL");
                    System.out.println("----------------");
                    inputData(sc, sll, 1);
                    break;

                case 2:
                    System.out.println("\nTAMBAH DATA AKHIR");
                    System.out.println("-----------------");
                    inputData(sc, sll, 2);
                    break;

                case 3:
                    System.out.println("\nTAMBAH DATA PADA INDEKS TERTENTU");
                    System.out.println("--------------------------------");
                    System.out.print("Masukkan Index [0-" + sll.getSize() + "]: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    inputData(sc, sll, 3, index);
                    break;

                case 4:
                    System.out.println("\nTAMBAH DATA SETELAH NAMA");
                    System.out.println("-----------------------");
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String key = sc.nextLine();
                    inputData(sc, sll, 4, key);
                    break;

                case 5:
                    System.out.println("\nHAPUS DATA PERTAMA");
                    System.out.println("------------------");
                    sll.removeFirst();
                    break;

                case 6:
                    System.out.println("\nHAPUS DATA TERAKHIR");
                    System.out.println("-------------------");
                    sll.removeLast();
                    break;

                case 7:
                    System.out.println("\nHAPUS DATA TERTENTU");
                    System.out.println("-------------------");
                    System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                    key = sc.nextLine();
                    sll.remove(key);
                    break;

                case 8:
                    System.out.println("\nHAPUS DATA PADA INDEKS TERTENTU");
                    System.out.println("------------------------------");
                    if (sll.isEmpty()) {
                        System.out.println("Linked List Kosong!");
                    } else {
                        System.out.print("Masukkan indeks [0-" + (sll.getSize()-1) + "]: ");
                        index = sc.nextInt();
                        sll.removeAt(index);
                    }
                    break;

                case 9:
                    System.out.println("\nCARI DATA MAHASISWA");
                    System.out.println("------------------");
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    key = sc.nextLine();
                    index = sll.indexOf(key);
                    if (index != -1) {
                        System.out.println("Data " + key + " berada pada indeks ke-" + index);
                        System.out.println("Detail data:");
                        sll.getData(index);
                    } else {
                        System.out.println("Data " + key + " tidak ditemukan!");
                    }
                    break;

                case 10:
                    sll.print();
                    break;

                case 11:
                    System.out.println("\nCEK DATA PADA INDEKS TERTENTU");
                    System.out.println("----------------------------");
                    if (sll.isEmpty()) {
                        System.out.println("Linked List Kosong!");
                    } else {
                        System.out.print("Masukkan indeks [0-" + (sll.getSize()-1) + "]: ");
                        index = sc.nextInt();
                        sll.getData(index);
                    }
                    break;

                case 0:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("\nMenu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }

    private static void inputData(Scanner sc, SingleLinkedList sll, int mode) {
        inputData(sc, sll, mode, -1);
    }

    private static void inputData(Scanner sc, SingleLinkedList sll, int mode, int index) {
        inputData(sc, sll, mode, index, null);
    }

    private static void inputData(Scanner sc, SingleLinkedList sll, int mode, String key) {
        inputData(sc, sll, mode, -1, key);
    }

    private static void inputData(Scanner sc, SingleLinkedList sll, int mode, int index, String key) {
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // clear buffer
        
        mhs12 m = new mhs12(nama, nim, kelas, ipk);
        
        switch (mode) {
            case 1:
                sll.addFirst(m);
                System.out.println("Data berhasil ditambahkan di awal");
                break;
            case 2:
                sll.addLast(m);
                System.out.println("Data berhasil ditambahkan di akhir");
                break;
            case 3:
                sll.insertAt(index, m);
                break;
            case 4:
                sll.insertAfter(key, m);
                break;
        }
    }
}
