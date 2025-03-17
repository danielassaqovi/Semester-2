public class MainAnalisisNilai {
    public static void main(String[] args) {
        // Deklarasi data mahasiswa
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
        int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        
        System.out.println("======================================================");
        System.out.println("      ANALISIS NILAI MAHASISWA DENGAN ALGORITMA       ");
        System.out.println("======================================================");
        
        // Nilai UTS tertinggi menggunakan Divide and Conquer
        int nilaiUTSTertinggi = AnalisisNilai.cariNilaiTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi : " + nilaiUTSTertinggi);
        
        // Mencari mahasiswa dengan nilai UTS tertinggi
        for (int i = 0; i < nilaiUTS.length; i++) {
            if (nilaiUTS[i] == nilaiUTSTertinggi) {
                System.out.println("   Diperoleh oleh : " + nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        
        // Nilai UTS terendah menggunakan Divide and Conquer
        int nilaiUTSTerendah = AnalisisNilai.cariNilaiTerendah(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("\nNilai UTS terendah : " + nilaiUTSTerendah);
        
        // Mencari mahasiswa dengan nilai UTS terendah
        for (int i = 0; i < nilaiUTS.length; i++) {
            if (nilaiUTS[i] == nilaiUTSTerendah) {
                System.out.println("   Diperoleh oleh : " + nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        
        // Rata-rata nilai UAS menggunakan Brute Force
        double rataRataUAS = AnalisisNilai.hitungRataRataBruteForce(nilaiUAS);
        System.out.println("\nRata-rata nilai UAS : " + rataRataUAS);
        
        // Menampilkan daftar mahasiswa yang nilainya di atas rata-rata
        System.out.println("\nDaftar mahasiswa dengan nilai UAS di atas rata-rata:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-12s %-15s %-10s\n", "Nama", "NIM", "Tahun Masuk", "Nilai UAS");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < nilaiUAS.length; i++) {
            if (nilaiUAS[i] > rataRataUAS) {
                System.out.printf("%-10s %-12s %-15d %-10d\n", nama[i], nim[i], tahunMasuk[i], nilaiUAS[i]);
            }
        }
        
        System.out.println("======================================================");
    }
}