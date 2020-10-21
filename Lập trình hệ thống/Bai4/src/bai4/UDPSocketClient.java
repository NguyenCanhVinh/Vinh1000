/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.DatagramPacket  ;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author nguyenquanghieu
 */
public class UDPSocketClient {
    private static int PORT = 49152;
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        System.out.println("Nhập port hiển thị bên server: ");
        Scanner sc = new Scanner(System.in);
        PORT = sc.nextInt();
        byte[] rData = new byte[1024];
        byte[] sData = new byte[1024];
        DatagramSocket clientSocket = new DatagramSocket();
        
        InetAddress IPAddress = InetAddress.getByName("localhost");
        System.out.println("Nhập số fibo thứ n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        sData = s.getBytes();
        DatagramPacket sendPacket;
        DatagramPacket sendPacket1 = new DatagramPacket(sData, sData.length, IPAddress, PORT);
//        sendPacket = DatagramPacket(sData,sData.length, IPAddress,PORT);
        clientSocket.send(sendPacket1);
//        System.out.println("Đang chờ ...");
        DatagramPacket receivePacket = new DatagramPacket(rData,rData.length);
        clientSocket.receive(receivePacket);
//        System.out.println("Đang chờ ...2");
        System.out.println("Giá trị nhận được: ");
        String get = new String(receivePacket.getData());
        System.out.println(get);
        
    }
}
