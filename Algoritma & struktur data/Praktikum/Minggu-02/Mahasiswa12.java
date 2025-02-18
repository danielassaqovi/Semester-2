class Mahasiswa12{

  String nama;
  String nim;
  String kelas;
  double ipk;

  void tampilInformasi(){
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
  }

  public Mahasiswa12(){
  } 

  public Mahasiswa12(String nm, String nim, double ipk, String kls){
    nama = nm;
    nim = nim;
    this.ipk = ipk;
    kelas = kls;
  }

  void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
  } 

  void updateIPK(double ipkBaru){
    ipk = ipkBaru;
  }

  String nilaiKinerja(){
    if(ipk >= 3.5){
      return "Kinerja sangat baik";
    } else if(ipk >= 3.0){
      return "Kinerja baik";
    } else if(ipk >= 2.0){
      return "Kinerja cukup";
    } else {
      return "Kinerja kurang";
    }
  }

}