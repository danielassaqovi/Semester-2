public class Mahasiswa12{
  String nim;
  String nama;
  String kelas;
  double ipk;

  //konstruktor default
  public Mahasiswa12() {
  }

  //konstruktor bermarameter(dibuat ada yang nama var parameter inputnya sama ada yang tidak)
  Mahasiswa12(String nm, String nma, String kls, double ip){
    nim = nm;
    nama = nma;
    ipk = ip;
    kelas = kls;
  }

  //method tampil
  void tampilInformasi(){
    System.out.println("nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Kelas: " + kelas);
    System.out.println("IPK: " + ipk);
  }   
}