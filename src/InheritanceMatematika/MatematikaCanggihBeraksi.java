/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author Toshiba
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mathCanggih = new MatematikaCanggih();

        System.out.println("Pertambahan: 20 + 20 = " + mathCanggih.pertambahan(20, 20));
        System.out.println("Perkalian: 10 * 20 = " + mathCanggih.perkalian(10, 20));

        System.out.println("Modulus: 21 % 4 = " + mathCanggih.modulus(21, 4));
    }
}
