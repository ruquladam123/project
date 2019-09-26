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
public class method4 {
      public static void main (String [] args){
          
        System.out.println("Hasil PEngurutan :" + pengurutan() + "\t");
        System.out.println(" ");

        
        
    }
    private static int pengurutan(){
        int a ; int b ;int c; int urut;
        Scanner dam = new Scanner (System.in);
        System.out.println("===><pengurutann><===");
        System.out.print("Masukan bilI :");
        a = dam.nextInt();
        System.out.print("Masukan bil II :");
        b = dam.nextInt();
        System.out.print("Masukkan bil III :");
        c = dam.nextInt();
         if (a > b && a > c ){
             System.out.print("Nilai terbesar :" + a);
             
         } else if (b > a && b > c ){
                     System.out.print("Nilai tterbesar :" + b);
                     }
                 else if (c > a && c > b){
                         System.out.print("Nilai terbesar :" + c);
                         }
          int berhasil;
    return berhasil = 0;
}
}
