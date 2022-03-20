 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sinir Sayisini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4 ){
            System.out.println("4un katlari :" + i);
        }
        for (int k = 1; k <= n; k *= 5){
            System.out.println("5in katlari : " + k);
        }
    }
}