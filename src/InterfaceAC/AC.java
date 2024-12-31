/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author Toshiba
 */
public class AC implements InterfaceAC {
    private int suhu;
    private boolean statusAC;

    static final int SUHU_MINIMUM = 12;
    static final int SUHU_MAKSIMUM = 30;

    public AC() {
        this.suhu = 20;
        this.statusAC = false;
    }

    
    public void hidupkanAC() {
        if (!statusAC) {
            statusAC = true;
            System.out.println("AC Hidup! Suhu saat ini: " + suhu + "C");
        } else {
            System.out.println("AC sudah hidup.");
        }
    }

    
    public void matikanAC() {
        if (statusAC) {
            statusAC = false;
            System.out.println("AC Mati! Suhu berhenti pada: " + suhu + "C");
        } else {
            System.out.println("AC sudah mati.");
        }
    }

    
    public void dinginkanAC() {
        if (statusAC) {
            if (suhu > SUHU_MINIMUM) {
                suhu -= 1;
                System.out.println("AC Mendinginkan... Suhu sekarang: " + suhu + "C");
            } else {
                System.out.println("Suhu sudah mencapai minimum: " + SUHU_MINIMUM + "C");
            }
        } else {
            System.out.println("AC mati! Hidupkan AC terlebih dahulu.");
        }
    }

    
    public void panaskanAC() {
        if (statusAC) {
            if (suhu < SUHU_MAKSIMUM) {
                suhu += 1;
                System.out.println("AC Memanaskan... Suhu sekarang: " + suhu + "C");
            } else {
                System.out.println("Suhu sudah mencapai maksimum: " + SUHU_MAKSIMUM + "C");
            }
        } else {
            System.out.println("AC mati! Hidupkan AC terlebih dahulu.");
        }
    }
}
