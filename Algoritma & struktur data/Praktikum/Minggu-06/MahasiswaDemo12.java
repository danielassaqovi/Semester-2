public class MahasiswaDemo12{
  public static void main(String[] args){
    MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();
    Mahasiswa12 mhs1 = new Mahasiswa12("123", "Budi", "IF-1", 3.5);
    Mahasiswa12 mhs2 = new Mahasiswa12("124", "Susi", "IF-2", 3.7);
    Mahasiswa12 mhs3 = new Mahasiswa12("125", "Dedi", "IF-3", 3.4);
    Mahasiswa12 mhs4 = new Mahasiswa12("126", "Rina", "IF-4", 3.8);
    Mahasiswa12 mhs5 = new Mahasiswa12("127", "Fina", "IF-5", 3.9);
    
    list.tambah(mhs1);
    list.tambah(mhs2);
    list.tambah(mhs3);
    list.tambah(mhs4);
    list.tambah(mhs5);
    
    System.out.println("Data Mahasiswa Sebelum sorting");
    list.tampil();
    
    
    System.out.println("Data Mahasiswa Setelah sorting IPK (DESC)");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.selectionSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    list.insertionSort();
    list.tampil();
    
  }
    
}