public class MahasiswaBaru {

    private String nama;
    private int usia;
    private double ipk;
    private String status;

    public MahasiswaBaru(String nama, int usia, double ipk, String status) {
        this.nama = nama;
        setUsia(usia); 
        setIpk(ipk);
        setStatus(status);
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("LOG: IPK " + ipk + " tidak valid!");
        }
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Aktif") || status.equalsIgnoreCase("Cuti")) {
            this.status = status;
        } else {
            System.out.println("LOG: Status '" + status + "' tidak valid!");
        }
    }

    public void setUsia(int usia) {
        if (usia > 0) this.usia = usia;
    }
  
    public void tampilkanData() {
        System.out.println("Nama: " + nama + " | IPK: " + ipk + " | Status: " + status);
    }
   
    public static void main(String[] args) {
       
        MahasiswaBaru mhs = new MahasiswaBaru("Budi", 20, 3.5, "Aktif");
        mhs.tampilkanData();

        System.out.println("--- Tes Input Salah ---");
        mhs.setIpk(99.0);   
        mhs.setStatus("Lagi Bolos"); 
        
        mhs.tampilkanData(); 
    }
}