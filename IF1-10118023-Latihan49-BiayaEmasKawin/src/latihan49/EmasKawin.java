/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan49;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Zaenal PC
 */
public class EmasKawin {
    private final double mahar = 15.7;  
    private final double harga = 570000;

    public double getMahar() {
        return mahar;
    }

    public double getHarga() {
        return harga;
    }
    
    public double hargaMahar(){
        return mahar * harga;
    }
    public void tampilMahar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        rupiah.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Banyak Mahar emas : " + getMahar() + " gram");
        System.out.printf("Harga emas 1 gram : %s%n",rupiah.format(getHarga()));
        System.out.printf("Harga keseluruhan : %s%n" , rupiah.format(hargaMahar()));
        
        
       
        
    }
    
}
