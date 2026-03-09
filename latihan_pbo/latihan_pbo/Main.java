packpage latihan_pbo.latihan_1;

class Cafe{
    String nama;
    String alamat;
}
public class Main {
    public static void main(String[] args) {

        cafe cafe1 = new cafe();
        cafe1.nama = "Kopi Kenangan";
        cafe1.alamat = "indramayu";


        System.out.println("Nama Cafe: " + cafe1.nama);
        System.out.println("Alamat Cafe: " + cafe1.alamat);
    }
}