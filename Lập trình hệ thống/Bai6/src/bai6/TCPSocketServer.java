/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketServer {
    private static final int PORT = 9876;
    public static void main(String[] args) throws IOException {
        ServerSocket ssk = new ServerSocket(PORT);
        System.out.println("Đang đợi tín hiệu từ client ...");
        Socket sk = ssk.accept();
        BufferedReader bf = null;
        bf = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String thongDiep;
        while((thongDiep = bf.readLine()) != null){
            break;
        }
        System.out.println("Thông điệp: " + thongDiep);
        String result = "";
        DateTimeFormatter dtf = null;
        LocalDateTime now = LocalDateTime.now();
        DataOutputStream outToClient = new DataOutputStream(sk.getOutputStream());
        if("1".equals(thongDiep)) {
            dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            result = dtf.format(now);
        }
        else if("2".equals(thongDiep)) {
            dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            result = dtf.format(now);
        }
        else if("3".equals(thongDiep)) {
            dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
            result = dtf.format(now);
        }
        else {
            result = "Nhập sai";
            
            
        }
        outToClient.writeBytes(result+"\n");
        bf = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        while((thongDiep = bf.readLine()) != null){
            break;
        }
    }
}
