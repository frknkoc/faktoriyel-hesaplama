import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen geçerli bir sayı giriniz...");
        sayi = input.nextInt();

        /*
        while (sayi > 0) {
            total = total * sayi;
            --sayi;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli : " + total);
        */

        for (int i = 1; i <= sayi; i++){
            total = total * i;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli : " + total);
    }
}