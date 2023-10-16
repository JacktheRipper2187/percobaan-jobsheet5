import java.util.Scanner;

public class PemilihanPercobaan122Modif {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input22.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisAngka);
    }
}
