/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author Toshiba
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acRuangan = new AC();

        System.out.println("Status AC Saat Ini: Mati\n");

        acRuangan.hidupkanAC();
        acRuangan.dinginkanAC();
        acRuangan.panaskanAC();
        acRuangan.matikanAC(); 
        acRuangan.matikanAC();
        acRuangan.hidupkanAC();
        acRuangan.dinginkanAC(); 
    }
}