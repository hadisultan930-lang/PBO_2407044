package latihan6;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;
        char ulang;

        do {
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Bola");
            System.out.println("5. Keluar");
            System.out.print("Pilih bangun ruang (1-5): ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> hitungKubus();
                case 2 -> hitungBalok();
                case 3 -> hitungTabung();
                case 4 -> hitungBola();
                case 5 -> {
                    System.out.println("Terima kasih sudah menggunakan program ini 🙏");
                    return;
                }
                default -> System.out.println("Pilihan tidak tersedia!");
            }

            System.out.print("\nHitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');
    }

    static double inputPositif(String pesan) {
        double nilai;
        do {
            System.out.print(pesan);
            nilai = input.nextDouble();
            if (nilai <= 0) {
                System.out.println("Nilai harus lebih dari 0!");
            }
        } while (nilai <= 0);
        return nilai;
    }

    // Kubus
    static void hitungKubus() {
        double sisi = inputPositif("Masukkan sisi kubus: ");

        double volume = Math.pow(sisi, 3);
        double luas = 6 * Math.pow(sisi, 2);
        double diagonal = sisi * Math.sqrt(3);

        System.out.println("\n=== HASIL KUBUS ===");
        System.out.printf("Volume              = %.2f\n", volume);
        System.out.printf("Luas Permukaan      = %.2f\n", luas);
        System.out.printf("Diagonal Ruang      = %.2f\n", diagonal);
    }

    // Balok
    static void hitungBalok() {
        double p = inputPositif("Masukkan panjang: ");
        double l = inputPositif("Masukkan lebar: ");
        double t = inputPositif("Masukkan tinggi: ");

        double volume = p * l * t;
        double luas = 2 * ((p * l) + (p * t) + (l * t));
        double diagonal = Math.sqrt((p * p) + (l * l) + (t * t));

        System.out.println("\n=== HASIL BALOK ===");
        System.out.printf("Volume              = %.2f\n", volume);
        System.out.printf("Luas Permukaan      = %.2f\n", luas);
        System.out.printf("Diagonal Ruang      = %.2f\n", diagonal);
    }

    // Tabung
    static void hitungTabung() {
        double r = inputPositif("Masukkan jari-jari: ");
        double t = inputPositif("Masukkan tinggi: ");

        double volume = Math.PI * r * r * t;
        double luas = 2 * Math.PI * r * (r + t);

        System.out.println("\n=== HASIL TABUNG ===");
        System.out.printf("Volume              = %.2f\n", volume);
        System.out.printf("Luas Permukaan      = %.2f\n", luas);
    }

    // Bola
    static void hitungBola() {
        double r = inputPositif("Masukkan jari-jari: ");

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double luas = 4 * Math.PI * Math.pow(r, 2);

        System.out.println("\n=== HASIL BOLA ===");
        System.out.printf("Volume              = %.2f\n", volume);
        System.out.printf("Luas Permukaan      = %.2f\n", luas);
    }
}