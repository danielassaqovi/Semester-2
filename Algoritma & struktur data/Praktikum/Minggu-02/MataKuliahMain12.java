public class MataKuliahMain12 {
    
    public static void main(String[] args) {
        
        MataKuliah12 matkul1 = new MataKuliah12();
        matkul1.kodeMK = "PRAKASD";
        matkul1.nama = "Praktikum Algoritma Struktur Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        MataKuliah12 matkul2 = new MataKuliah12("AGM", "Agama", 2, 4);

        System.out.println("Informasi Mata Kuliah 1:");
        matkul1.tampilInformasi();
        System.out.println("\nInformasi Mata Kuliah 2:");
        matkul2.tampilInformasi();

        //ubah sks, tambah jam matkul1
        System.out.println("\n=====================\n");
        matkul1.ubahSKS(2);
        matkul1.tambahJam();
        matkul1.tampilInformasi();

        //ubah sks, kurangi jam matkul2
        System.out.println("\n=====================\n");
        matkul2.ubahSKS(3);
        matkul2.kurangiJam();;
        matkul2.tampilInformasi();


    }

}