import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        }else {
            return (x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.println("bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.println("pangkat : ");
        pangkat = sc.nextInt();
        System.out.println("hituung perhitungan : ");
        for(int i=1; i<= pangkat; i++){
            if(i==pangkat){
                System.out.print(bilangan + "=");
            }else{
                System.out.print(bilangan + "x");
            }
        }
        System.out.print(hitungPangkat(bilangan, pangkat));
        }
    }
    

