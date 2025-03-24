public class DataDosen12 {
    Dosen12[] dataDosen12;
    int idx;
    
    public DataDosen12() {
        dataDosen12 = new Dosen12[10];
        idx = 0;
    }
    
    public void tambah(Dosen12 dsn) {
        if (idx < dataDosen12.length) {
            dataDosen12[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan!");
        } else {
            System.out.println("Array sudah penuh!");
        }
    }
    
    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
            return;
        }
        
        System.out.println("\n=== DATA DOSEN ===");
        for (int i = 0; i < idx; i++) {
            System.out.println("Data ke-" + (i+1));
            dataDosen12[i].tampil();
        }
    }
    
    public void sortingASC() {
        // Bubble sort - mengurutkan dari termuda ke tertua (ascending)
        if (idx <= 1) {
            System.out.println("Data dosen kurang dari 2, tidak perlu diurutkan!");
            return;
        }
        
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen12[j].getUsia() > dataDosen12[j + 1].getUsia()) {
                    // Tukar posisi
                    Dosen12 temp = dataDosen12[j];
                    dataDosen12[j] = dataDosen12[j + 1];
                    dataDosen12[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ascending berdasarkan usia!");
    }
    
    public void sortingDSC() {
        // Selection sort - mengurutkan dari tertua ke termuda (descending)
        if (idx <= 1) {
            System.out.println("Data dosen kurang dari 2, tidak perlu diurutkan!");
            return;
        }
        
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen12[j].getUsia() > dataDosen12[maxIdx].getUsia()) {
                    maxIdx = j;
                }
            }
            
            // Tukar posisi
            Dosen12 temp = dataDosen12[i];
            dataDosen12[i] = dataDosen12[maxIdx];
            dataDosen12[maxIdx] = temp;
        }
        System.out.println("Data berhasil diurutkan secara descending berdasarkan usia!");
    }
    
    public void insertionSort() {
        // Insertion sort - mengurutkan dari tertua ke termuda (descending)
        if (idx <= 1) {
            System.out.println("Data dosen kurang dari 2, tidak perlu diurutkan!");
            return;
        }
        
        for (int i = 1; i < idx; i++) {
            Dosen12 key = dataDosen12[i];
            int j = i - 1;
            
            // Pindahkan elemen yang lebih muda dari key ke posisi satu di depannya
            while (j >= 0 && dataDosen12[j].getUsia() < key.getUsia()) {
                dataDosen12[j + 1] = dataDosen12[j];
                j--;
            }
            dataDosen12[j + 1] = key;
        }
        System.out.println("Data berhasil diurutkan secara descending berdasarkan usia menggunakan Insertion Sort!");
    }
}