/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Toshiba
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 60);

        System.out.println("Merk Mobil: " + mobil.getMerk());
        System.out.println("Kecepatan Mobil: " + mobil.getKecepatan() + " km/jam");
        System.out.println("Gigi Mobil: " + mobil.getGigi());

        mobil.gantiGigi(3);
        System.out.println("Gigi Mobil Saat Ini: " + mobil.getGigi());

        mobil.tambahKecepatan(40);
        System.out.println("Kecepatan Mobil Sekarang: " + mobil.getKecepatan() + " km/jam");

        mobil.kurangiKecepatan(30);
        System.out.println("Kecepatan Mobil Sekarang: " + mobil.getKecepatan() + " km/jam");
    }
}
