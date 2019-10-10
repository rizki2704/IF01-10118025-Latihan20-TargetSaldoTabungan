/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF01
 * 
 */
public class IF0110118025Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, saldo;
        
        DecimalFormat satuan = new DecimalFormat();
        
        i = 1;
        saldo = 3500000;
        
        while(saldo <= 6000000){
            saldo += saldo*0.08;
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + satuan.format(saldo));
            i++;
        }
        
    }
    
}
