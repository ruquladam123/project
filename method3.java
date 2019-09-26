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
import java.util.Scanner;
public class method3 {
    public static void main (String [] args){
        System.out.println("(+)jadi kecepatan adalah :" + kecepatan () + ""
                + "(+)");
        
    }
        private static double kecepatan (){
            double k; double w; double j;
        Scanner dam = new Scanner (System.in);
            System.out.print("(+)Masukkan jarak :    ");
            j = dam.nextDouble();
            System.out.print("(+)Masukkan waktu :    ");
            w =  dam.nextInt();
            k = j / w;
            return k;
        }
}
