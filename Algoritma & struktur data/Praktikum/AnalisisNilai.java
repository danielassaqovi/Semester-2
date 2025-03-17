public class AnalisisNilai {
    // Metode Divide and Conquer untuk mencari nilai tertinggi
    public static int cariNilaiTertinggi(int[] arr, int awal, int akhir) {
        // Basis: Jika hanya satu elemen
        if (awal == akhir) {
            return arr[awal];
        }
        
        // Jika hanya dua elemen
        if (akhir - awal == 1) {
            return Math.max(arr[awal], arr[akhir]);
        }
        
        // Divide: Bagi array menjadi dua bagian
        int tengah = (awal + akhir) / 2;
        
        // Conquer: Cari nilai tertinggi di kedua bagian
        int nilaiTertinggiKiri = cariNilaiTertinggi(arr, awal, tengah);
        int nilaiTertinggiKanan = cariNilaiTertinggi(arr, tengah + 1, akhir);
        
        // Combine: Bandingkan dan kembalikan nilai tertinggi
        return Math.max(nilaiTertinggiKiri, nilaiTertinggiKanan);
    }
    
    // Metode Divide and Conquer untuk mencari nilai terendah
    public static int cariNilaiTerendah(int[] arr, int awal, int akhir) {
        // Basis: Jika hanya satu elemen
        if (awal == akhir) {
            return arr[awal];
        }
        
        // Jika hanya dua elemen
        if (akhir - awal == 1) {
            return Math.min(arr[awal], arr[akhir]);
        }
        
        // Divide: Bagi array menjadi dua bagian
        int tengah = (awal + akhir) / 2;
        
        // Conquer: Cari nilai terendah di kedua bagian
        int nilaiTerendahKiri = cariNilaiTerendah(arr, awal, tengah);
        int nilaiTerendahKanan = cariNilaiTerendah(arr, tengah + 1, akhir);
        
        // Combine: Bandingkan dan kembalikan nilai terendah
        return Math.min(nilaiTerendahKiri, nilaiTerendahKanan);
    }
    
    // Metode Brute Force untuk menghitung rata-rata
    public static double hitungRataRataBruteForce(int[] arr) {
        int total = 0;
        
        // Iterasi melalui semua elemen dan jumlahkan
        for (int nilai : arr) {
            total += nilai;
        }
        
        // Hitung rata-rata
        return (double) total / arr.length;
    }
}