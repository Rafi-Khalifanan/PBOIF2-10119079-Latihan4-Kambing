/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119079.latihan4.kambing;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   Berisi codingan dengan contoh Kambing
 *
 */
public class PBOIF210119079Latihan4Kambing {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "
                + jumlahKambing);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBOIF210119079Latihan4Kambing kambingJantan = new PBOIF210119079Latihan4Kambing();
        kambingJantan.tambahKambing();

    }

}
