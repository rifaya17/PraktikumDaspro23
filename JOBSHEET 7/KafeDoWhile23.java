import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.print("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("\nSemua transaksi selesai.");
        sc.close();
    }
}
