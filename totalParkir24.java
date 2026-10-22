import java.util.Scanner;

public class totalParkir24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int jenis, durasi, total = 0;

    
    do {
        System.out.print("Masukkan tipe kendaraan(1 = mobil, 2 = motor,0 = keluar): ");
        jenis = sc.nextInt();
        if (jenis == 0) {
            break;
        }
        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi parkir: ");
            durasi = sc.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
        } else {
            System.out.println("INVALID REQUEST");
        }
    } while (true);
    System.out.println("Total uang yang diperoleh: Rp. " + total);
    sc.close();
    }
}
