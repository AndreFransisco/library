package view;

import Controller.Buku_Controller;
import Entity.Buku_Entity;
import Entity.Login_Staff_Entity;
import model.Buku_Model;
import model.Interface_Model;
import java.util.Scanner;
import static model.Buku_Model.databuku;

public class HomePage implements Interface_Model {
    static Login_Staff_Entity login = new Login_Staff_Entity();
    static Buku_Entity item = new Buku_Entity();
    static Scanner input = new Scanner(System.in);
    public HomePage(){
    }
    public static int login(String username, String password) {
        if (login.getUsername().equals(password) && login.getPassword().equals(password)) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
        return 0;
    }
    public void insertuserpass() {
        String username = "andre";
        String password = "andre";
        login = new Login_Staff_Entity(username, password);
    }
    public void menu() {
        int pil = 0;
        int index;
        String email, password;

        System.out.println("----------LOGIN STAFF------------");
        System.out.print("Masukkan Username anda \t: ");
        email = input.nextLine();
        System.out.print("Masukkan Password anda \t: ");
        password = input.nextLine();
        login(email, password);

        do {
            if (login.getUsername().equals(password) && login.getPassword().equals(password)) {
                System.out.println("----------LIBRARY------------");
                System.out.println("1. buat buku");
                System.out.println("2. hapus buku");
                System.out.println("3. edit buku");
                System.out.println("4. tampil buku");
                System.out.println("5. logout");
                System.out.print("Pilih : ");
                pil = input.nextInt();
                input.nextLine();
                System.out.println();
                switch (pil) {
                    case 1: {
                        tambahBuku();
                        break;
                    }

                    case 2: {
                        hapusBuku();
                        break;
                    }
                    case 3: {
                        editBuku();
                        break;
                    }

                    case 4: {
                        lihatbuku();
                        break;

                    }
                }
            }
            else
            {
                System.out.print("\nMasukkan username anda \t: ");
                email = input.nextLine();
                System.out.print("Masukkan Password anda \t: ");
                password = input.nextLine();
                login(email, password);
            }
        } while (pil != 5);
    }
    @Override
    public void view() {
        input.nextLine();
        for (Buku_Entity item : databuku) {
            System.out.println("===========================");
            System.out.println("judul buku  : " + item.getJudul());
            System.out.println("nama penerbit : " + item.getPenerbit());
            System.out.println("tahun terbit  : " + item.getTerbit());
            System.out.println("===========================");
        }
    }
    public void tambahBuku() {
        String judul, penerbit, tglterbit;
        System.out.print("judul buku : ");
        judul = input.nextLine();

        System.out.print("nama penerbit : ");
        penerbit = input.nextLine();

        System.out.print("tahun terbit : ");
        tglterbit = input.nextLine();
        Buku_Entity bukuBaru = new Buku_Entity(judul, penerbit, tglterbit);
        Buku_Controller.tambahBuku(bukuBaru);

        System.out.println("Berhasil Menambahkan Buku");
        System.out.println("=======================================");
        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }
    private void hapusBuku(Buku_Entity buku) {
        System.out.println("============ KONFIRMASI ============");
        lihatBuku(buku);
        System.out.println("Ingin Menghapus Buku ini ? (y/n) ");
        char konf = input.nextLine().charAt(0);
        if (konf == 'y') {
            Buku_Controller.deleteBuku(buku);
        }
    }
    public void hapusBuku() {
        int idKoleksi;

        System.out.println("============ HAPUS  BUKU ============");

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku_Entity buku = Buku_Controller.findBukuById(idKoleksi);

        if (buku != null) {
            hapusBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }

    public void editBuku(Buku_Entity buku, int pilihEdit) {
        switch (pilihEdit) {
            case 1:
                String judulBukuBaru;
                System.out.println("Judul Buku          : " + buku.judul);
                System.out.print("Masukan Judul Baru  : ");
                judulBukuBaru = input.nextLine();
                buku.setJudul(judulBukuBaru);
                break;
            case 2:
                String penerbit;
                System.out.println("Nama Penerbit              : " + buku.penerbit);
                System.out.print("Masukan Nama Penerbit Baru : ");
                penerbit = input.nextLine();
                input.nextLine();
                buku.setPenerbit(penerbit);
                break;
            case 3:
                String terbit;
                System.out.println("Tahun Terbit              : " + buku.terbit);
                System.out.print("Masukan Tahun Terbit Baru : ");
                terbit = input.nextLine();
                input.nextLine();
                buku.setTerbit(terbit);
                break;
        }
        Buku_Controller.updateBuku(buku);
        System.out.println("Berhasil mengubah data buku");

        System.out.println("Lanjut....");
        input.nextLine();
        System.out.println();
    }

    public void editBuku(Buku_Entity buku) {
        System.out.println("---------------------------------------");
        System.out.println("Ingin mengubah apa ? ");

        int pilihEdit;
        System.out.print("""
                1. Judul Buku
                2. Nama Penerbit
                3. Tanggal Terbit
                0. Selesai
                Pilih: """);
        pilihEdit = input.nextInt();
        input.nextLine();

        editBuku(buku, pilihEdit);
        System.out.println("---------------------------------------");
    }

    public void editBuku() {
        int idKoleksi;

        System.out.println("============= EDIT BUKU =============");

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku_Entity buku = Buku_Controller.findBukuById(idKoleksi);

        if (buku != null) {
            editBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
        System.out.println();
    }

    private void lihatBuku(Buku_Entity buku){

        System.out.println("---------------------------------------");
        System.out.println("ID Buku         :"+buku.idKoleksi);
        System.out.println("Judul Buku      :"+buku.judul);
        System.out.println("Nama Penerbit   :"+buku.penerbit);
        System.out.println("Tanggal Terbit  :"+buku.terbit);
        System.out.println("---------------------------------------");
    }

    public void lihatbuku(){
        System.out.println("============== LIHAT BUKU =============");
        for (Buku_Entity buku : Buku_Model.databuku){
            lihatBuku(buku);
        }
        System.out.println("=======================================");

        System.out.print("Lanjut....");
        input.nextLine();
        System.out.println();
    }
}
