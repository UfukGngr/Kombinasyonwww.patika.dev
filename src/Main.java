import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int comb;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kombinasyonu hesaplanacak olan 1. sayıyı girin:");
        sayi=scan.nextInt();

        for (int i=0; i<=sayi ; i++){
            comb=Faktoriyel(sayi)/(Faktoriyel(i)*Faktoriyel(sayi-i));
            System.out.println(sayi +" in " + i +" li kombinasyonu " + comb);
        }
    }
    public static int Faktoriyel(int sayi){
        int fact=1;
        for(int i=1; i<=sayi ;i++){
            fact*=i;
        }
        return fact;
    }
}