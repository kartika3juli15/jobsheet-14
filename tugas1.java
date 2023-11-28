import java.util.Scanner;

public class tugas1 {
    
    public static void bilangan(int angka) {
        if (angka >= 0) {
            System.out.print(angka + " ");
            bilangan(angka - 1);
        }
    }

    public static void bilangan2(int angka) {
        for (int i = angka; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("masukkan bilangan : ");
        angka = sc.nextInt();

        System.out.println("Menggunakan Fungsi Rekursif:");
        bilangan(angka);

        System.out.println();

        System.out.println("Menggunakan Fungsi Iteratif:");
        bilangan2(angka);
    }
}
