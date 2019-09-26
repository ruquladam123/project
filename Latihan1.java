/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

/**
 *
 * @author DKID
 */
public class Latihan1 {
    public static void main (String [] args){
       System.out.println("======WELCOME TO MOBILE LEGENDS======");
       
       
       int v = 10;
       int w = 20;
       int y = 30;
       int x = jumlah(v,w);
       double b = jumlah (v,w,x);
       System.out.println("Hasil :" + x );
       System.out.println("Hasil2 :" + b);
        
    }
    private static int jumlah (int a , int b ){
        int hasil = a + b;
        return hasil;
    }
    private static double jumlah (int a , int b ,int c){
        double hasil = a + b + c;
        return hasil;
    }
    }
    

