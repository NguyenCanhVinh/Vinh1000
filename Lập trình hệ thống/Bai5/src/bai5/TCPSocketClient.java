/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketClient {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int PORT;
        String IP;
        Socket sk;
        while(true){
            try{
                System.out.println("Nhập PORT: ");
                PORT = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập IP: ");
                IP = sc.nextLine();
                sk = new Socket(IP, PORT);
                break;
            }catch(Exception e){
                System.out.println("Lỗi xin vui lòng nhập lại");
                System.out.println(e);
            }
            
        }
   
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        
        String thongDiep;
        while((thongDiep = br.readLine()) != null){
            break;
        }
        System.out.println("Đây là thông điệp");
        System.out.println(thongDiep);
        DataOutputStream sendToClient = new DataOutputStream(sk.getOutputStream());
        sendToClient.writeBytes("okok\n");
    }
}
