/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenquanghieu
 */

public class Thread1 extends Thread{
    Scanner sc;
    String i;
    Thread1(){
        sc = new Scanner(System.in);
        i = "";
    }
    @Override
    public void run() {
        while(!"!".equals(i)){
            i = sc.nextLine();
            File f = new File("C:\\Users\\nguyenquanghieu\\Documents\\NetBeansProjects\\Bai1\\src\\bai1\\Hello.txt");
            FileWriter fw = null;
            try {
                fw = new FileWriter(f);
            } catch (IOException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fw.write(i);
            } catch (IOException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
