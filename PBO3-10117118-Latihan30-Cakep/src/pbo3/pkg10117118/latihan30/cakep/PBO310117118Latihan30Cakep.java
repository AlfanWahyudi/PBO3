/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117118.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk menjawab jawaban secara
 * otomatis
 */
public class PBO310117118Latihan30Cakep {

    public static final String XIDER_RESET = "\u001B[0m";
    public static final String XIDER_BLACK = "\u001B[30m";
    public static final String XIDER_RED = "\u001B[31m";
    public static final String XIDER_GREEN = "\u001B[32m";
    public static final String XIDER_YELLOW = "\u001B[33m";
    public static final String XIDER_BLUE = "\u001B[34m";
    public static final String XIDER_PURPLE = "\u001B[35m";
    public static final String XIDER_CYAN = "\u001B[36m";
    public static final String XIDER_WHITE = "\u001B[37m";
//    kode background color
    public static final String XIDER_BLACK_BACKGROUND = "\u001B[40m";
    public static final String XIDER_RED_BACKGROUND = "\u001B[41m";
    public static final String XIDER_GREEN_BACKGROUND = "\u001B[42m";
    public static final String XIDER_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String XIDER_BLUE_BACKGROUND = "\u001B[44m";
    public static final String XIDER_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String XIDER_CYAN_BACKGROUND = "\u001B[46m";
    public static final String XIDER_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {
        // TODO code application logic here
        String jawab;
        Scanner doyen = new Scanner(System.in);
        
        System.out.print(XIDER_RED+"Kamu "+XIDER_RESET);
        System.out.print(XIDER_GREEN+"ngerjain sendiri "+XIDER_RESET);
        System.out.print(XIDER_YELLOW+"latihan 17 sampe "+XIDER_RESET);
        System.out.print(XIDER_BLUE+"latihan 30 ini? \n"+XIDER_RESET);
        System.out.print(XIDER_BLUE+"Jawab "+XIDER_RESET);
        System.out.print(XIDER_RED+"(Yoi/Enggak) : "+XIDER_RESET);
        jawab = doyen.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(XIDER_RED+"\nCakep Bener. "+XIDER_RESET);
            System.out.print(XIDER_PURPLE+"Good Job \n"+XIDER_RESET);
        }else{
            System.out.print(XIDER_RED+"\nTetep cakep sih. "+XIDER_RESET);
            System.out.print(XIDER_CYAN+"\nSing penting paham konsep nya yee. "
                    +XIDER_RESET);
            System.out.print(XIDER_BLACK+"\nKeep the code works dude."+XIDER_RESET);  
        }
    }
    
}
