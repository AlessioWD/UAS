/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Toshiba
 */
public class Mobil {
    private String merk;
    private int kecepatan;
    private int gigi;

    public Mobil(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.gigi = 1;
    }

    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public int getGigi() {
        return gigi;
    }

    public void gantiGigi(int gigiBaru) {
        if (gigiBaru >= 1 && gigiBaru <= 5) {
            this.gigi = gigiBaru;
            System.out.println("Gigi telah diganti ke: " + gigi);
        } else {
            System.out.println("Gigi tidak valid! Gigi harus antara 1 dan 5.");
        }
    }

    public void tambahKecepatan(int kecepatanTambah) {
        if (kecepatanTambah > 0) {
            this.kecepatan += kecepatanTambah;
            System.out.println("Kecepatan bertambah: " + kecepatanTambah + " km/jam");
        }
    }

    public void kurangiKecepatan(int kecepatanKurang) {
        if (kecepatanKurang > 0 && kecepatanKurang <= kecepatan) {
            this.kecepatan -= kecepatanKurang;
            System.out.println("Kecepatan berkurang: " + kecepatanKurang + " km/jam");
        } else {
            System.out.println("Kecepatan tidak dapat dikurangi. Kecepatan saat ini: " + kecepatan);
        }
    }
}
