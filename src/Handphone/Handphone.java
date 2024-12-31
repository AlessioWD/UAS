/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author Toshiba
 */
public class Handphone {
    String hidupkan;
    int lakukanPanggilan;
    int kirimSMS;
    String matikan;
    
    void printHP() {
        System.out.println("Handphone hidup " + hidupkan);
        System.out.println("ting, ting, ting " + lakukanPanggilan + " panggilan dari Rizwan");
        System.out.println("kluting, kluting " + kirimSMS + " sms dari Rizwan");
        System.out.println("Handphone mati " + matikan);
    }
}
