import java.util.Scanner;

public class StudiKasus2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan, status;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine().toUpperCase();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();
        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
        statusPendanaan = sc.nextInt();

        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA")
                || jenisKegiatan.equals("MANDIRI")) {
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }
        } else if (jenisKegiatan.equals("PKM")) {
            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
        } else {
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan.";
        }

        System.out.println("Status : " + status);
        sc.close();
    }
}