/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan33.login;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk membuat login
 */
public class PBO310117118Latihan33Login {

    /**
     * @param args the command line arguments
     */
    
        private static String usName;
        private static String passWord;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName =scan.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scan.next();
        
        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }
    
}
