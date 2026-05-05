import java.util.ArrayList;
 
class Instruktur {
    protected String nama;
    protected String idUnik;
    protected String bidangKeahlian;

    public Instruktur(String nama, String idUnik, String bidang) {
        this.nama = nama;
        this.idUnik = idUnik;
        this.bidangKeahlian = bidang;
    }

    public double hitungPendapatan() {
        return 0;
    }

    public void tampilkanData() {
        System.out.println("ID: " + idUnik + " | Nama: " + nama + " | Bidang: " + bidangKeahlian);
    }
}

class InstrukturTetap extends Instruktur {
    private double gajiPokok;
    private int jumlahKursus;

    public InstrukturTetap(String nama, String idUnik, String bidang, double gaji, int kursus) {
        super(nama, idUnik, bidang); 
        this.gajiPokok = gaji;
        this.jumlahKursus = kursus;
    }

    @Override
    public double hitungPendapatan() {
        return gajiPokok + (jumlahKursus * 500000);
    }
}

class InstrukturFreelance extends Instruktur {
    private int jumlahSesi;

    public InstrukturFreelance(String nama, String idUnik, String bidang, int sesi) {
        super(nama, idUnik, bidang); 
        this.jumlahSesi = sesi;
    }

    @Override
    public double hitungPendapatan() {
        return jumlahSesi * 150000;
    }
}

public class SistemEdTech {
    public static void main(String[] args) {
        InstrukturTetap tetap = new InstrukturTetap("Nadnad", "T-001", "Programming", 4000000, 2);

        InstrukturFreelance freelance = new InstrukturFreelance("Ewok", "F-005", "Design", 10);

        System.out.println("=== DATA PENDAPATAN INSTRUKTUR ===");
        
        tetap.tampilkanData();
        System.out.println("Total Gaji: Rp " + tetap.hitungPendapatan());
        
        System.out.println("----------------------------------");
        
        freelance.tampilkanData();
        System.out.println("Total Gaji: Rp " + freelance.hitungPendapatan());
    }
}