public class Dosen12 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    
    public Dosen12(String kd, String name, Boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public Boolean getJenisKelamin() {
        return jenisKelamin;
    }
    
    public int getUsia() {
        return usia;
    }
    
    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("---------------------------");
    }
}