public class lattihan2 {
    
    // Menambahkan keyword 'static' agar bisa diakses oleh method main
    static class Cafe {
        String nama;
        String alamat;
    }

    public static void main(String[] args) {
        // Cafe 1
        Cafe cafe1 = new Cafe();
        cafe1.nama = "Kenangan";
        cafe1.alamat = "IMKOT";
        System.out.println("nama cafenya adalah : " + cafe1.nama);
        System.out.println("alamatnya di : " + cafe1.alamat);
        System.out.println("====================");

        // Cafe 2
        Cafe cafe2 = new Cafe();
        cafe2.nama = "Janji Jiwa";
        cafe2.alamat = "Cirebon";
        System.out.println("nama cafenya adalah : " + cafe2.nama);
        System.out.println("alamatnya di : " + cafe2.alamat);
        System.out.println("====================");

        // Cafe 3
        Cafe cafe3 = new Cafe();
        cafe3.nama = "Kopi";
        cafe3.alamat = "Indramayu";
        System.out.println("nama cafenya adalah : " + cafe3.nama);
        System.out.println("alamatnya di : " + cafe3.alamat);  
    }    
}