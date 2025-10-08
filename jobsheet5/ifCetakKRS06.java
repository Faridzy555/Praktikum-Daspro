package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS06 {
    public static void main(String[] args) {
        Scanner Farid = new Scanner(System.in);

        System.out.println("Cetak KRS Siakad");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean ukt_lunas = Farid.nextBoolean();

        if (ukt_lunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Regristrasi ditolak");
        }
    }
}