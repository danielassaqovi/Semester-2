public class MataKuliah12 {

    //set atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    //set konstruktor
    public MataKuliah12() {

    }

    public MataKuliah12(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    //set method
    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam() {
        jumlahJam++;
    }

    void kurangiJam() {
        if (jumlahJam > 0) {
            jumlahJam--;
        } else {
            System.out.println("Jumlah jam sudah tidak bisa dikurangi");
        }
    }

}