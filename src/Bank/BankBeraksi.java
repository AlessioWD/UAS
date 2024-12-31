/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bank;

/**
 *
 * @author Toshiba
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(300000);

        System.out.println("Selamat Datang di Bank JATIM");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        bank.simpanUang(550000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        bank.ambilUang(250000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}
