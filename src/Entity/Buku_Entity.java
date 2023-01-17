package Entity;
import model.Buku_Model;

public class Buku_Entity {
    public String penerbit;
    public String judul;
    public String terbit;
    public int idKoleksi;
    public Buku_Entity(String judul, String penerbit, String terbit) {
        idBukuBaru();
        this.penerbit = penerbit;
        this.judul = judul;
        this.terbit = terbit;
    }
    public Buku_Entity() {
    }
    private void idBukuBaru() {
        if (Buku_Model.databuku.size() == 0) {
            this.idKoleksi = 1;
        } else {
            int indexTerakhirDalamList = Buku_Model.databuku.size() - 1;
            Buku_Entity bukuTerakhirDalamList = Buku_Model.databuku.get(indexTerakhirDalamList);
            int idBukuTerakhir = bukuTerakhirDalamList.idKoleksi;
            this.idKoleksi = idBukuTerakhir + 1;
        }
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getTerbit() {
        return terbit;
    }
    public void setTerbit(String terbit) {
        this.terbit = terbit;
    }
}