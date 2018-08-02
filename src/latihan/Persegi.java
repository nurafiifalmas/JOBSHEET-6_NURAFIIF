/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Persegi {
    public static void main(String[] args) throws IOException {
        BufferedReader data = new BufferedReader  (new InputStreamReader(System.in));
            String x = " ";
            int hitungLuas = 0;
            System.out.println("---Luas Persegi---");
            System.out.print("masukan nilai sisi :");
            
    try {
      x = data.readLine();
      int angka = Integer.parseInt(x);
      hitungLuas = angka * angka;
    }catch (Exception e ) {
        System.out.println("Error");
        
    }
    System.out.println ("Luas persegi dengan sisi"+ x + "adalah"+hitungLuas);
    
 }
}
