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
public class Latihan2 {
    public static void main (String [] args){
        System.out.println("Luas persegi :" + persegi());
        System.out.println("Luas segitiga :" + segitiga());
        System.out.println("Luas lingkaran :" + lingkaran());
        System.out.println("Luas persegipanjang :" + persegipanjang());
        
    }
    private static double persegi(){
        int s = 30;
        double hasil = s * s;
        return hasil;
    }
    private static double segitiga(){
        int a = 20;
        int t = 10;
        double hasil2 = 0.5 * a * t;
        return hasil2;
    }
    private static double persegipanjang (){
        int p = 20;
        int l = 18;
        double hasil3 = p * l;
        return hasil3;
    }
    private static double lingkaran (){
        double pi = 3.14;
        int r =7;
        double hasil4 = pi * r * r;
        return hasil4;
        
    }
}
