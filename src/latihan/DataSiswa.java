/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DataSiswa {
        public static void main(String[]args) {
    // deklarasi variabel
    String a, b, alamat;
    int usia, absen;
    //membuat scanner baru
    Scanner keyboard = new Scanner (System.in);
    //tampilkan outputke user
    System.out.println("### DATA SISWA SMK TELKOM MALAMG ###");
    System.out.print("Nama Siswa: " );
    a = keyboard.next();
    System.out.print("Nama Orang Tua: ");
    b = keyboard.next();
    //tampilkan output lagi
    System.out.print("Alamat:");
    //menggunakan scanner lagi
    alamat = keyboard.next();
    System.out.print("Absen:");
    absen = keyboard.nextInt();
    System.out.print("Usia:");
    usia = keyboard.nextInt();
    //menampilkan apa yang sudah simpan di variabel
    System.out.println("===================");
    System.out.println("Nama siswa     :" + a);
    System.out.println("Nama Orang Tua :" + b);
    System.out.println("Alamat         :" + alamat);
    System.out.println("Absen          : " +absen);
    System.out.println("Usia           :" +usia+ "tahun");
    }
}
