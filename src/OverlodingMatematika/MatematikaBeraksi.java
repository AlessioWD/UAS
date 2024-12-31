/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OverlodingMatematika;

/**
 *
 * @author Toshiba
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mat = new MatematikaCanggih();

        mat.pertambahan(12.5, 28.7, 14.2);
        mat.pertambahan(12, 28, 14);
        mat.pertambahan(23, 34);
        mat.pertambahan(3.4, 4.9);

        mat.pengurangan(12.5, 28.7, 14.2);
        mat.pengurangan(12, 28, 14);

        mat.perkalian(12.5, 28.7, 14.2);
        mat.perkalian(12, 28, 14);

        mat.pembagian(12.5, 28.7, 14.2);
        mat.pembagian(12, 28, 14);

        mat.modulus(12.5, 28.7, 14.2);
        mat.modulus(12, 28, 14);

        mat.pecahan(12.5, 28.7, 14.2);
    }
}
