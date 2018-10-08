/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan33.login;

/**
 *
 * @author xider
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk membuat login
 */
public class User {
    private static String username;
    private static String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        username ="Alfan";
        password ="ingat";
        if(parPassword.equals(password) && parUserName.equals(username)){
            statusAkun = true;
        } else{
            statusAkun = false;
        }
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if(status == true){
            System.out.println("\n*******HALLO"+parUserName.toUpperCase()+
                    "********");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
