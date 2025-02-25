public class Matakuliah12{
  public String kode;
  public String nama;
  public int sks;
  public int jumlahJam;

  public Matakuliah12(String kd, String nm, int sks, int jj){
    kode = kd;
    nama = nm;
    this.sks = sks;
    jumlahJam = jj;
  }
  //method tambahData
  public void tambahData(String kd, String nm, int sks, int jj){
    kode = kd;
    nama = nm;
    this.sks = sks;
    jumlahJam = jj;
  }
  //method cetak info
  public void cetakInfo(){
    System.out.println("Kode\t:" + kode);
    System.out.println("Nama\t:" + nama);
    System.out.println("SKS\t:" + sks);
    System.out.println("Jumlah Jam\t:" + jumlahJam);
    System.out.println("----------------------------------------");
  }
}