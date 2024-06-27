/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perbankan;

/**
 *
 * @author KAMAL
 */
public class Tabungan {
   
    protected double tingkatBunga;
    protected int saldo;

    public Tabungan(int saldo, double tingkatBunga) {
        this.saldo = saldo;
        this.tingkatBunga = tingkatBunga;
    }

    public double cekUang() {
        return saldo + (saldo * tingkatBunga);
    }
}


