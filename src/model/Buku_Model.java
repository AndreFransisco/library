package model;

import Entity.Buku_Entity;
import java.util.ArrayList;

public class Buku_Model {
    public static ArrayList<Buku_Entity> databuku = new ArrayList<>();

//    @Override
//    public void view() {
//        input.nextLine();
//        for (Buku_Entity item : databuku) {
//            System.out.println("===========================");
//            System.out.println("judul buku  : " + item.getJudul());
//            System.out.println("nama penerbit : " + item.getPenerbit());
//            System.out.println("tahun terbit  : " + item.getTerbit());
//            System.out.println("===========================");
//
//        }
//    }
//
//    public void tambahBuku() {
//        String judul, penerbit, tglterbit;
//        Scanner in = new Scanner(System.in);
//        System.out.print("judul buku : ");
//        judul = in.nextLine();
//
//        System.out.print("nama penerbit : ");
//        penerbit = in.nextLine();
//
//        System.out.print("tahun terbit : ");
//        tglterbit = in.nextLine();
//        Buku_Entity bukuBaru = new Buku_Entity(judul, penerbit, tglterbit);
//        Buku_Controller.tambahBuku(bukuBaru);
//
//        System.out.println("Berhasil Menambahkan Buku");
//        System.out.println("=======================================");
//        System.out.print("Lanjut ...");
//        in.nextLine();
//        System.out.println();
//    }
//
//    private void hapusBuku(Buku_Entity buku) {
//        System.out.println("============ KONFIRMASI ============");
//
//        lihatBuku(buku);
//
//        System.out.println("Ingin Menghapus Buku ini ? (y/n) ");
//        char konf = input.nextLine().charAt(0);
//
//        if (konf == 'y') {
//            Buku_Controller.deleteBuku(buku);
//        }
//
//    }
//
//    public void hapusBuku() {
//        int idKoleksi;
//
//        System.out.println("============ HAPUS  BUKU ============");
//
//        System.out.print("Masukan ID Buku: ");
//        idKoleksi = input.nextInt();
//        input.nextLine();
//
//        Buku_Entity buku = Buku_Controller.findBukuById(idKoleksi);
//
//        if (buku != null) {
//            hapusBuku(buku);
//        } else {
//            System.out.println("Data Buku Tidak Ditemukan !");
//        }
//
//        System.out.println("=======================================");
//    }
//
//    public void editBuku(Buku_Entity buku, int pilihEdit) {
//        switch (pilihEdit) {
//            case 1:
//                String judulBukuBaru;
//                System.out.println("Judul Buku          : " + buku.judul);
//                System.out.print("Masukan Judul Baru  : ");
//                judulBukuBaru = input.nextLine();
//                buku.setJudul(judulBukuBaru);
//                break;
//            case 2:
//                String penerbit;
//                System.out.println("Nama Penerbit              : " + buku.penerbit);
//                System.out.print("Masukan Nama Penerbit Baru : ");
//                penerbit = input.nextLine();
//                input.nextLine();
//                buku.setPenerbit(penerbit);
//                break;
//            case 3:
//                String terbit;
//                System.out.println("Tahun Terbit              : " + buku.terbit);
//                System.out.print("Masukan Tahun Terbit Baru : ");
//                terbit = input.nextLine();
//                input.nextLine();
//                buku.setTerbit(terbit);
//                break;
//        }
//        Buku_Controller.updateBuku(buku);
//        System.out.println("Berhasil mengubah data buku");
//
//        System.out.println("Lanjut....");
//        input.nextLine();
//        System.out.println();
//    }
//
//    public void editBuku(Buku_Entity buku) {
//        System.out.println("---------------------------------------");
//        System.out.println("Ingin mengubah apa ? ");
//
//        int pilihEdit;
//        System.out.print("""
//                1. Judul Buku
//                2. Nama Penerbit
//                3. Tanggal Terbit
//                0. Selesai
//                Pilih: """);
//        pilihEdit = input.nextInt();
//        input.nextLine();
//
//        editBuku(buku, pilihEdit);
//        System.out.println("---------------------------------------");
//    }
//
//    public void editBuku() {
//        int idKoleksi;
//
//        System.out.println("============= EDIT BUKU =============");
//
//        System.out.print("Masukan ID Buku: ");
//        idKoleksi = input.nextInt();
//        input.nextLine();
//
//        Buku_Entity buku = Buku_Controller.findBukuById(idKoleksi);
//
//        if (buku != null) {
//            editBuku(buku);
//        } else {
//            System.out.println("Data Buku Tidak Ditemukan !");
//        }
//
//        System.out.println("=======================================");
//        System.out.println();
//    }
//
//    private void lihatBuku(Buku_Entity buku){
//
//        System.out.println("---------------------------------------");
//        System.out.println("ID Buku         :"+buku.idKoleksi);
//        System.out.println("Judul Buku      :"+buku.judul);
//        System.out.println("Nama Penerbit   :"+buku.penerbit);
//        System.out.println("Tanggal Terbit  :"+buku.terbit);
//        System.out.println("---------------------------------------");
//    }
//
//    public void lihatbuku(){
//        System.out.println("============== LIHAT BUKU =============");
//        for (Buku_Entity buku : Buku_Controller.databuku){
//            lihatBuku(buku);
//        }
//        System.out.println("=======================================");
//
//        System.out.print("Lanjut....");
//        input.nextLine();
//        System.out.println();
//    }
}