/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author Toshiba
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hpBudal = new Handphone();
        
        hpBudal.hidupkan = "klutik";
        hpBudal.kirimSMS = 100;
        hpBudal.matikan = "tetot";
        hpBudal.printHP();
    }
}
