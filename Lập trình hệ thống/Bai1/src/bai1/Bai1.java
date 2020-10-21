/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
/*
Bài 1: Lập trình trên ngôn ngữ tùy chọn với yêu cầu sau:
Viết chương trình 1.
a. Viết 1 hàm gồm 1 vòng lặp nhập 1 kí tự từ bàn phím, ghi kí tự lên 1 file dulieu.txt.
Nếu kí tự là &#39;!&#39; thì thoát khỏi vòng lặp.
b. Đặt hàm vào 1 luồng, dịch chương trình CT1.
Viết chương trình 2.
c. Viết 1 hàm có 1 vòng lặp vô hạn đọc kí tự ở file dulieu.txt. Đọc được kí tự thì đóng
file. Hiển thị kí tự. Nếu kí tự đọc được là &#39;!&#39; thì thoát vòng lặp.
d. Đặt hàm vào 1 luồng, dịch chương trình CT2.
Chạy CT1 và CT2 để thấy hiệu ứng trao đổi dữ liệu.

*/



/**
 *
 * @author nguyenquanghieu
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        
        
        // TODO code application logic here
    }
    
}
