package Controller;

import Entity.Buku_Entity;
import static model.Buku_Model.databuku;

public class Buku_Controller {

    public static int banyakData() {
        return databuku.size();
    }

    public static void lihatData() {
        for (Buku_Entity buku : databuku) {
        }
    }

    public static Buku_Entity findBukuById(int idbuku) {
        for (Buku_Entity buku : databuku) {
            if (buku.idKoleksi==(idbuku)){
                return buku;
            }
        }
        return null;
    }

    public static int indexData(Buku_Entity buku) {
        for (int i = 0;i<databuku.size();i++){
            if (databuku.get(i).idKoleksi==buku.idKoleksi){
                return i;
            }
        }
        return -1;
    }
    public static void tambahBuku(Buku_Entity buku){
        databuku.add(buku);
    }

    public static void updateBuku(Buku_Entity buku){
        int indexdatabuku = indexData(buku);
        if (indexdatabuku != -1){
            databuku.set(indexdatabuku,buku);
        }
    }
    public static void deleteBuku(Buku_Entity buku){
        databuku.remove(buku);
    }
}