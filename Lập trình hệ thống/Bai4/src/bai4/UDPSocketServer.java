/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author nguyenquanghieu
 */
public class UDPSocketServer {
    public static Integer Fibonacci(Integer n){
        if (n == 1 || n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    private static final int PORT = 63758;
    public static void main(String[] args) throws SocketException, IOException {
        byte[] rData = new byte[1024];
        byte[] sData = new byte[1024];
        
        DatagramSocket serverSocket = new DatagramSocket();
        int remoteServerPort;
        remoteServerPort = serverSocket.getLocalPort();
        System.out.println("server running on port : " + remoteServerPort);
        System.out.println("Đang chờ kết nối từ client");
        DatagramPacket receivePacket = new DatagramPacket(rData,rData.length);
        serverSocket.receive(receivePacket);
        String get = new String(receivePacket.getData());
//        System.out.println(get);
//        String s = br.readLine();
        Integer a =Integer.parseInt(get.trim());
        System.out.println("Nhận: " + a);
        System.out.println(Fibonacci(8));
        sData = Fibonacci(a).toString().getBytes();
        System.out.println("Gửi: " + Fibonacci(a).toString());
        InetAddress IPAddress = receivePacket.getAddress();
        int port = receivePacket.getPort();
        System.out.println(port);
        DatagramPacket sendPacket1 = new DatagramPacket(sData, sData.length, IPAddress, port);
//        sendPacket = DatagramPacket(sData,sData.length, IPAddress,PORT);
        serverSocket.send(sendPacket1); 
        serverSocket.close();
    }
}
