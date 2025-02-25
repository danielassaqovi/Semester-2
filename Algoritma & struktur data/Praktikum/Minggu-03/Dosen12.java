public class Dosen12{

  String kode;
  String nama;
  Boolean jenisKelamin;
  int usia;

  //konstruktor
  public Dosen12(String kd, String nm, Boolean jk, int us){
    kode = kd;
    nama = nm;
    jenisKelamin = jk;
    usia = us;
  }

  //cetak info
  public void cetakInfo(){
    System.out.println("Kode\t:" + kode);
    System.out.println("Nama\t:" + nama);
    System.out.println("Jenis Kelamin\t:" + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    System.out.println("Usia\t:" + usia);
    System.out.println("----------------------------------------");
  }
}