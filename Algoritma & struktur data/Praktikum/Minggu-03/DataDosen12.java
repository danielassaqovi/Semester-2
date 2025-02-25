public class DataDosen12 {

  // method data semua dosen
  public static void dataSemuaDosen(Dosen12[] arrayOfDosen) {
    for (Dosen12 dosen : arrayOfDosen) {
      dosen.cetakInfo();
    }
  }

  //method jumlah dosen per jenis kelamin
  public static void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
    int jumlahLaki = 0;
    int jumlahPerempuan = 0;
    for (Dosen12 dosen : arrayOfDosen) {
      if (dosen.jenisKelamin) {
        jumlahLaki++;
      } else {
        jumlahPerempuan++;
      }
    }
    System.out.println("Jumlah Dosen Laki-laki : " + jumlahLaki);
    System.out.println("Jumlah Dosen Perempuan : " + jumlahPerempuan);
  }

  //method rata-rata usia dosen per jenis kelamin
  public static void rataRataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
    int jumlahLaki = 0;
    int jumlahPerempuan = 0;
    int totalUsiaLaki = 0;
    int totalUsiaPerempuan = 0;
    for (Dosen12 dosen : arrayOfDosen) {
      if (dosen.jenisKelamin) {
        jumlahLaki++;
        totalUsiaLaki += dosen.usia;
      } else {
        jumlahPerempuan++;
        totalUsiaPerempuan += dosen.usia;
      }
    }
    System.out.println("Rata-rata usia dosen laki-laki : " + (totalUsiaLaki / jumlahLaki));
    System.out.println("Rata-rata usia dosen perempuan : " + (totalUsiaPerempuan / jumlahPerempuan));
  }

  //info dosen paling tua
  public static void dosenPalingTua(Dosen12[] arrayOfDosen) {
    Dosen12 dosenTua = arrayOfDosen[0];
    for (Dosen12 dosen : arrayOfDosen) {
      if (dosen.usia > dosenTua.usia) {
        dosenTua = dosen;
      }
    }
    System.out.println("Dosen paling tua adalah : ");
    dosenTua.cetakInfo();
  }

  //info dosen paling muda
  public static void dosenPalingMuda(Dosen12[] arrayOfDosen) {
    Dosen12 dosenMuda = arrayOfDosen[0];
    for (Dosen12 dosen : arrayOfDosen) {
      if (dosen.usia < dosenMuda.usia) {
        dosenMuda = dosen;
      }
    }
    System.out.println("Dosen paling muda adalah : ");
    dosenMuda.cetakInfo();
  }
}
