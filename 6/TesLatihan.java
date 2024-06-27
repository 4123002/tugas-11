/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Perbankan.Tabungan;

/**
 *
 * @author KAMAL
 */
public class TesLatihan {
    public static void main(String args[]) {
        Tabungan tabungan = new Tabungan(5000, 8.5 / 100);
        System.out.println("Uang yang ditabung : 5000");
        System.out.println("Tingkat bunga sekarang : 8.5%");
        System.out.println("Total uang anda sekarang : " + tabungan.cekUang());
    }
}
