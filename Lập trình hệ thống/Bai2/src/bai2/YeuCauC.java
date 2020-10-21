/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.TimerTask;
import static bai2.YeuCauA.c;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nguyenquanghieu
 */
public class YeuCauC extends Thread{

    @Override
    public void run() {
        while(c != 0){
            System.out.println(c);
        
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(YeuCauC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
