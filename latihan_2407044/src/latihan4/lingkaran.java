package latihan4;

public class lingkaran extends bangun_datar {
     
    public double hitungLuas() {
        return Math.PI * jari_jari * jari_jari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jari_jari;
    }
}
