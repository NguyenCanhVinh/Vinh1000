/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenquanghieu
 */
public class Thread2 extends Thread{
    @Override
    public void run() {
        while(true){
            try{

                File f = new File("C:\\Users\\nguyenquanghieu\\Documents\\NetBeansProjects\\Bai1\\src\\bai1\\Hello.txt");
                FileReader fr = null;
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                int count = 0;
                while ((line = br.readLine()) != null){
                  System.out.println(line);
                  if(line.equals("!")){
                      count = 1;
                      break;
                  }
                }
                if(count == 1) break;
                
                fr.close();
                br.close();
            }catch(IOException e){
                System.out.println(e);
            }
//            break;
        }
    }
}
