package bai3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketClient {
    public static int PORT = 5657;
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("localhost", PORT);
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        DataOutputStream outToServer = new DataOutputStream(sk.getOutputStream());
        outToServer.writeBytes(a + "\n");
        BufferedReader b;
        b = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String thongDiep;
        while((thongDiep = b.readLine()) != null){
            break;
        }
        System.out.println(thongDiep);
        
    }
}
