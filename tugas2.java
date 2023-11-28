import java.util.Scanner;

public class tugas2 {
     public static int penjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc.nextInt();

        System.out.println("Proses penjumlahan:");
        int hasil = 0;
        for (int i = 1; i <= f; i++) {
            hasil += i;
            System.out.print(i + " + ");
        }
        System.out.print("= " + hasil);
        System.out.println();
        
        int total = penjumlahan(f);
        System.out.println("Hasil penjumlahan bilangan dari 1 sampai " + f + " adalah " + total);
    }
}
