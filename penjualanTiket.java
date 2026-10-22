import java.util.Scanner;

public class penjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tiket = 50000, totalTiket = 0, jmlhTiket;
        double totalUang = 0, diskon;

        do {
            System.out.println("Ketik '0' jika ingin keluar");
            System.out.print("Masukkan jumlah tiket      : ");
            jmlhTiket = sc.nextInt();
            if (jmlhTiket == 0) {
                break;
            }
            if (jmlhTiket > 0) {
                if (jmlhTiket > 10) {
                    diskon = 0.15;
                } else if (jmlhTiket > 4){
                    diskon = 0.1;
                } else {
                    diskon = 0;
                }
                
                totalUang += jmlhTiket * tiket * (1 - diskon);
    
                totalTiket += jmlhTiket;
            }

        } while (true);
        System.out.println("===============================================");
        System.out.println("Total tiket terjual         : " + totalTiket);
        System.out.println("Total uang yang dihasilkan  : " + totalUang);

        sc.close();
    }
}
