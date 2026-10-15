import java.util.Scanner;

public class UTSDaspro23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y, x;

        System.out.print("Masukkan nilai x: ");
        x = sc.nextInt();
        System.out.print("Masukkan nilai y: ");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Berada di titik pusat.");
        } else if (x == 0) {
            System.out.println("Tepat di sumbu  y.");
        } else if (y == 0) {
            System.out.println("Tepat di sumbu  x.");
        } else if (x > 0 && y > 0) {
            System.out.println("Berada di kuadran I.");
        } else if (x < 0 && y > 0) {
            System.out.println("Berada di kuadran II.");
        } else if (x < 0 && y < 0) {
            System.out.println("Berada di kuadran III.");
        } else {
            System.out.println("Berada di kuadran IV.");
        }
        sc.close();
    }
}
