import java.util.ArrayList;
import java.util.List;

class ProgramStudi {
    private String nama;
    public ProgramStudi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class FakultasTeknik {
    private String namaFakultas;
    private List<ProgramStudi> daftarProdi;

    public FakultasTeknik(String nama) {
        this.namaFakultas = nama;
        this.daftarProdi = new ArrayList<>();

        this.daftarProdi.add(new ProgramStudi("Teknologi Informasi"));
        this.daftarProdi.add(new ProgramStudi("Teknik Sipil"));
    }

    public void hapusFakultas() {
        System.out.println("\n[!] Menghapus Fakultas " + this.namaFakultas + "...");
        this.daftarProdi = null;
    }

    public void cekStatusAnak() {
        if (this.daftarProdi != null) {
            System.out.println("Status: Program Studi masih aktif di bawah " + namaFakultas);
            for (ProgramStudi p : daftarProdi) {
                System.out.println("- " + p.getNama());
            }
        } else {
            System.out.println("Status: Program Studi ikut terhapus karena Fakultas sudah tidak ada.");
        }
    }

    public static void main(String[] args) {
        FakultasTeknik ft = new FakultasTeknik("Fakultas Teknik Undiknas");
  
        System.out.println("--- Kondisi Awal ---");
        ft.cekStatusAnak();
        ft.hapusFakultas();
        System.out.println("--- Kondisi Akhir ---");
        ft.cekStatusAnak();
    }
}