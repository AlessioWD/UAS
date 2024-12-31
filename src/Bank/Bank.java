/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Toshiba
 */
public class Bank {
    private int saldo;
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil uang Rp. " + jumlah);
        }
    }

    public int getSaldo() {
        return saldo;
    }
}
