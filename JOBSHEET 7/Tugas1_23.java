import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000, totalTiket = 0, jumlahTiket;
        double totalPenjualan = 0, totalBayar;

        do {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silahkan masukkan ulang");
                continue;
            } else if (jumlahTiket == 0) {
                break;
            }

            totalBayar = jumlahTiket * harga;
            if (jumlahTiket > 10) {
                totalBayar = totalBayar - (totalBayar * 0.15);
            } else if (jumlahTiket > 4) {
                totalBayar = totalBayar - (totalBayar * 0.10);
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}