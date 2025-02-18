public class DosenMain12 {

    public static void main(String[] args) {

        Dosen12 dosen1 = new Dosen12();
        dosen1.idDosen = "Dsn1";
        dosen1.nama = "Imam";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pemrograman Dasar";

        Dosen12 dosen2 = new Dosen12("Dsn2", "Vivin", true, 2010, "Algoritma");

        System.out.println("Informasi Dosen 1 :");
        dosen1.tampilInformasi();
        System.out.println("\nInformasi Dosen 2 :");
        dosen2.tampilInformasi();

        //ubah keahlian dan status dosen 1
        System.out.println("\n+=================================+\n");
        dosen1.ubahKeahlian("Basis Data");
        dosen1.statusAktif = false;
        dosen1.tampilInformasi();

        //hitung masa kerja dosen 2
        System.out.println("\n+=================================+\n");
        dosen2.tampilInformasi();
        int masaKerja = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen : " + masaKerja + " tahun.");
    }

}