class Hewan {
    private String nama; 
    private String jenis;

    public Hewan(String nama) {
        this.nama = nama; 
        this.jenis = "Mamalia";
    }

    public void bersuara() {
        System.out.println("...");
    }

    public String getNama() {
        return nama;
    }
}

class Anjing extends Hewan {
    private int jumlahKaki = 4;

    public Anjing(String nama) {
        super(nama); 
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong!");
    }
}

public class TestHewan {
    public static void main(String[] args) {
        Hewan h = new Anjing("Rex");
        
        h.bersuara(); 
        System.out.println("Nama hewan: " + h.getNama());
    }
}