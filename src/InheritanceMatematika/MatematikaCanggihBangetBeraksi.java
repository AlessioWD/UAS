/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author Toshiba
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mathCanggihBanget = new MatematikaCanggihBanget();

        System.out.println("Pertambahan: 20 + 20 = " + mathCanggihBanget.pertambahan(20, 20));
        System.out.println("Perkalian: 10 * 20 = " + mathCanggihBanget.perkalian(10, 20));
        System.out.println("Modulus: 21 % 4 = " + mathCanggihBanget.modulus(21, 4));
        System.out.println("Pertambahan Tiga Angka: 10 + 5 + 2 = " + mathCanggihBanget.pertambahanTiga(10, 5, 2));
    }
}
