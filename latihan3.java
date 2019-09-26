/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;
import java.util.Scanner;

/**
 *
 * @author DKID
 */
public class latihan3 {
    public static void main (String [] args){
        System.out.println("Hasil penjumlahan :" + penjumlahan() + "\t");
        System.out.println("Hasil pengurangan :" + pengurangan() + "\t");
        System.out.println("Hasil perkalian :" + perkalian() + "\t");
        System.out.println("Hasil pembagian :" + pembagian() + "\t");
        System.out.println("Hasil sisa bagi : " + sisa() + "\t");

        
        
    }
    private static int penjumlahan(){
        int bila ; int bilb ;int hasil;
        Scanner dam = new Scanner (System.in);
        System.out.println("===penjumlahan===");
        System.out.print("Masukan bil a :" + "\t");
        bila = dam.nextInt();
        System.out.print("Masukan bil b :");
        bilb = dam.nextInt();
        hasil = bila + bilb;
        return hasil;
        
        
    
}
    private static int pengurangan(){
        int bila; int bilb; int hasil;
        Scanner dam = new Scanner (System.in);
        System.out.println("===pengurangan===");
        System.out.print("Masukan bila :");
        bila = dam.nextInt();
        System.out.print("Masukkan bilb :");
        bilb = dam.nextInt();
        hasil = bila - bilb;
        return hasil;
    }
    private static int perkalian (){
        int bila; int bilb; int hasil;
        Scanner dam = new Scanner (System.in);
        System.out.println("===perkalian===");
        System.out.print("Masukkan bila :");
        bila = dam.nextInt();
        System.out.print("Masukkan bilb :");
        bilb =  dam .nextInt();
        hasil = bila * bilb;
        return hasil;
    }
    private static double pembagian(){
        double bila; double bilb; double hasil;
        Scanner dam = new Scanner (System.in);
        System.out.println("===pembagian===");
        System.out.print("Masukkan bila :");
        bila = dam.nextDouble();
        System.out.print("Masukkan bilb ;");
        bilb = dam.nextDouble();
        hasil = bila / bilb;
        return hasil;
        
    }
    private static double sisa (){
        double bila; double bilb; double hasil;
        Scanner dam = new Scanner (System.in);
        System.out.println("===hasil bagi===");
        System.out.print("Masukkan bila :");
        bila = dam.nextDouble();
        System.out.print("Masukkan bilb :");
        bilb = dam.nextDouble();
        if(bila>bilb) {
            hasil = bila%bilb;
            return hasil;
        }else if (bila<bilb){
            System.out.println("ERROR 404");
        
        }return 0 ;


        

        
    }
}

    

    
        
    
