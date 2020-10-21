/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author nguyenquanghieu
 */
public class TCPSocketServer {
    public static int PORT = 5657;
    public static String getSo(String so){
        if ("1".equals(so)) return "Mot";
        else if ("2".equals(so)) return "Hai";
        else if ("3".equals(so)) return "Ba";
        else if ("4".equals(so)) return "Bon";
        else if ("5".equals(so)) return "Nam";
        else if ("6".equals(so)) return "Sau";
        else if ("7".equals(so)) return "Bay";
        else if ("8".equals(so)) return "Tam";
        else if ("9".equals(so)) return "Chin";
        else if ("0".equals(so)) return "Khong";
        else return "Khong phai so nguyen";
        
    }
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader inFromClient;
            String thongDiep = null;
            Socket conn = null;
            ServerSocket ssk = new ServerSocket(PORT);
            conn = ssk.accept();
            System.out.println("Kết nối thành công");
            
            while(true){
                inFromClient = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                if((thongDiep = inFromClient.readLine()) != null)
                    break;
            }
            System.out.println(thongDiep);
                        
            DataOutputStream outToClient = new DataOutputStream(conn.getOutputStream());
            outToClient.writeBytes(getSo(thongDiep) + "\n");
        }
        catch(IOException e){
            System.out.println( "Có vấn đề");
        }
        
    }
}
