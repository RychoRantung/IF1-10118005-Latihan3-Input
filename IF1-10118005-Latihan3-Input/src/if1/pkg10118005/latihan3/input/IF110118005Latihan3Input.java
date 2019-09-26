/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan3.input;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA   : Rycho Rantung
 * KELAS  : IF-1
 * NIM    : 10118005
 * Deskripsi Program : Program ini berisi program untuk menginput nama
 */
public class IF110118005Latihan3Input {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukkan nama anda: ");
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
