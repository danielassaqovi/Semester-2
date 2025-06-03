public class Mahasiswa12 {
  String nama;
  String nim;
  String kelas;
  double ipk;

  //konstruktor
  public Mahasiswa12(String nama, String nim, String kelas, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  //method tampil informasi
  public void tampilInformasi() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Kelas: " + kelas);
    System.out.println("IPK: " + ipk);
  }
}