/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perbankan;

/**
 *
 * @author KAMAL
 */


public class PengambilanUang {
    private int saldo;
    private int proteksi;
    private int tingkatBunga;

    public PengambilanUang(int saldo, int proteksi, int tingkatBunga) {
        this.saldo = saldo;
        this.proteksi = proteksi;
        this.tingkatBunga = tingkatBunga;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah >= proteksi) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}

