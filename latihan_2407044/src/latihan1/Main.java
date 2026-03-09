package latihan1;

import java.util.Scanner;

class Cafe {
    private String namaMenu;
    private String bahan1;
    private String bahan2;
    private String bahan3;
    private int harga;

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setResep() {
        switch (namaMenu.toLowerCase()) {
            case "mocafino":
                bahan1 = "1 shot espresso";
                bahan2 = "2 oz foam";
                bahan3 = "1 sendok coklat bubuk";
                harga = 18000;
                break;
            case "espresso":
                bahan1 = "1 shot espresso (30 ml)";
                bahan2 = "-";
                bahan3 = "-";
                harga = 15000;
                break;
            case "cappuccino":
                bahan1 = "1 shot espresso";
                bahan2 = "1 oz susu steamed";
                bahan3 = "1 oz foam";
                harga = 20000;
                break;
            case "latte":
                bahan1 = "1 shot espresso";
                bahan2 = "3 oz susu steamed";
                bahan3 = "tipis foam";
                harga = 22000;
                break;
            case "americano":
                bahan1 = "1 shot espresso";
                bahan2 = "3 oz air panas";
                bahan3 = "-";
                harga = 17000;
                break;
            default:
                bahan1 = "Menu tidak tersedia";
                bahan2 = "-";
                bahan3 = "-";
                harga = 0;
                break;
        }
    }

    public void tampilResep() {
        System.out.println("\n=== DETAIL MENU KOPI PANGKU ===");
        System.out.println("Menu       : " + namaMenu);
        System.out.println("Bahan 1    : " + bahan1);
        System.out.println("Bahan 2    : " + bahan2);
        System.out.println("Bahan 3    : " + bahan3);
        System.out.println("Harga      : Rp " + harga);
        System.out.println("===============================");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();
        int totalBayar = 0;
        String lanjut;

        System.out.println("===== SELAMAT DATANG DI KOPI PANGKU =====");

        do {
            System.out.println("\nDaftar Menu KOPI PANGKU:");
            System.out.println("1. Mocafino  (18000)");
            System.out.println("2. Espresso  (15000)");
            System.out.println("3. Cappuccino (20000)");
            System.out.println("4. Latte (22000)");
            System.out.println("5. Americano (17000)");
            System.out.print("Masukkan nama menu: ");

            String menu = input.nextLine();

            cafe.setNamaMenu(menu);
            cafe.setResep();
            cafe.tampilResep();

            totalBayar += cafe.getHarga();

            System.out.print("Pesan lagi? (y/n): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\nTotal Bayar Anda: Rp " + totalBayar);
        System.out.println("Terima kasih sudah berkunjung ke KOPI PANGKU ☕");
        System.out.println("Silakan datang kembali!");

        input.close();
    }
}