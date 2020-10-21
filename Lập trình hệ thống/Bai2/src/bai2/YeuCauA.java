/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenquanghieu
 */



public class YeuCauA extends Thread{
    public static int c =1;
    @Override
    public void run() {
        c = 1;
        Scanner sc = new Scanner(System.in);
        while(c != 0){
            c = sc.nextInt();
        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(YeuCauA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
