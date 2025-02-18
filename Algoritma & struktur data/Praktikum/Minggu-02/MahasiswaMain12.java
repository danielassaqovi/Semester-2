class MahasiswaMain12{

    public static void main(String[] args) {
        Mahasiswa12 mhs1 = new Mahasiswa12();
        mhs1.nama = "Muhammad Daniel Assaqovi";
        mhs1.nim = "244107020061";
        mhs1.kelas = "1F";
        mhs1.ipk = 3.85;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("1I");
        mhs1.updateIPK(3.91);
        mhs1.tampilInformasi();

        Mahasiswa12 mhs2 = new Mahasiswa12("Muhammad Daniel Assaqovi", "244107020061", 3.85, "1F");
        mhs2.updateIPK(3.95);
        mhs2.tampilInformasi();

        Mahasiswa12 mhsDaniel = new Mahasiswa12("Muhammad Daniel Assaqovi", "244107020061", 3.85, "1F");
        mhsDaniel.tampilInformasi();
       
    }
}