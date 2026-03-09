package latihan_2;

// Class Persegi (Enkapsulasi)
// class Persegi {
//     private int panjang;
//     private int lebar;

//     // Method untuk menampilkan pesan pembuka
//     void tampil() {
//         System.out.println("=== Menghitung Persegi ===");
//     }

//     // Setter untuk Panjang
//     public void setPanjang(int panjang) {
//         this.panjang = panjang;
//     }

//     // Getter untuk Panjang
//     public int getPanjang() {
//         return panjang;
//     }

//     // Setter untuk Lebar
//     public void setLebar(int lebar) {
//         this.lebar = lebar;
//     }

//     // Getter untuk Lebar
//     public int getLebar() {
//         return lebar;
//     }

//     // Bonus: Method hitung luas
//     public int hitungLuas() {
//         return panjang * lebar;
//     }
// }

// // Class Utama
// public class Main {
//     public static void main(String[] args) {
//         Persegi persegi1 = new Persegi();
        
//         // Memasukkan nilai angka (tanpa tanda petik)
//         persegi1.setPanjang(9);
//         persegi1.setLebar(10 );
        
//         persegi1.tampil();
//         System.out.println("Panjang : " + persegi1.getPanjang());
//         System.out.println("Lebar   : " + persegi1.getLebar());
//         System.out.println("Luas    : " + persegi1.hitungLuas());
//     }
// }


class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Method tampil
    void tampil() {
        System.out.println("=== Perhitungan Persegi Panjang ===");
    }

    // Setter & Getter untuk Panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    // Setter & Getter untuk Lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    // Method untuk Menghitung Luas secara otomatis
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk Menghitung Keliling secara otomatis
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        
        p.tampil();
        
        // Cukup set panjang dan lebar saja
        p.setPanjang(9);
        p.setLebar(10);
        
        // Luas dan Keliling akan terhitung otomatis
        System.out.println("Panjang  : " + p.getPanjang());
        System.out.println("Lebar    : " + p.getLebar());
        System.out.println("Luas     : " + p.getLuas());
        System.out.println("Keliling : " + p.getKeliling());
    }
}