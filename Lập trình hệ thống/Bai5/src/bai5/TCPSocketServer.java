/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketServer {
    public static int PORT = 9876;
    public static final String IP = "127.0.0.1";
    public static void main(String[] args) throws IOException {
        ServerSocket ssk = new ServerSocket(PORT);
        String s = "PORT: " + PORT + ", IP: " + IP + "\n";
        System.out.println(s);
        System.out.println("Đang đợi kết nối từ client");
        Socket sk = ssk.accept();
        System.out.println("Đã kết nối với client");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println();

        
        System.out.println(dtf.format(now) );
        DataOutputStream sendToClient = new DataOutputStream(sk.getOutputStream());
        sendToClient.writeBytes(dtf.format(now)+ "\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        
        String thongDiep;
        while((thongDiep = br.readLine()) != null){
            break;
        }
    }
}
