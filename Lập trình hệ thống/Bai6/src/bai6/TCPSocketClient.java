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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketClient {
    private static final int PORT = 9876;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket sk;
        sk = new Socket("localhost",PORT);
        DataOutputStream outToServer = new DataOutputStream(sk.getOutputStream());
        String thongDiep;
        System.out.println("Nhập lựa chọn");
        thongDiep = sc.nextLine();
        outToServer.writeBytes(thongDiep + "\n");
        
        String thongDiep1;
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        while((thongDiep1 = bf.readLine()) != null){
            break;
        }
        System.out.println(thongDiep1+"\n");
        outToServer.writeBytes("bye\n");
    }
}
