/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.khanq.mathutil.main;

import com.khanq.mathutil.core.MathUtility;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TEST CASE #1 - xem chi tiế mô tả ở dưới (case n = 0 | 0!)
        int n = 0;//tình huống kiểm tra 0!
        long expected = 1; //0!, ko cần lập trình cũng ra kq này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm và run là biết ngay
        
        //so sánh giữa expected == actual hay không
        System.out.println("0! -> expected = " + expected + " | actual = " + actual);
        //cách 1 kiểm thử bằng sức người: mắt nhìn, não nghĩ
        
        
        //TEST CASE #2 - mô  tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected + " | actual = " + actual);
        
        //TEST CASE #3 - mô  tả ở dưới
        System.out.println("5! -> expected = 120" + " | actual = " + MathUtility.getFactorial(5));
    }
    
}
//DEV PHẢI TEST CODE CỦA MÌNH, CÓ 3 CÁCH
        //CÁCH 1: IN KẾT QUẢ XỬ LÍ CỦA HÀM RA MÀN HÌNH
        
        //NHẮC LẠI: CÔNG VIỆC CỦA QC BAO GỒM
        //THIẾT KẾ TEST CASE, RUN TEST CASE, GHI LẠI BUG NẾU CÓ
        //         TEST CASE, TEST RUN       LOG BUG > jira, BugZilla
        //TEST CASE => nói ra bạn sẽ test app thế nào
        //bằng các đưa vào data, giá trị kì vọng, cách dùng app với 
        //bộ data đó như thế nào
        //lát rồi run thử app xem sao -> TEST RUN
        
        //ĐỀ THI PE LUÔN Ở ĐÂY!!! THIẾT KẾ TEST CASE
        //TA THIẾT KẾ TEST CASE ĐỂ TEST HÀM TÍNH GIAI THỪA TA VỪA VIẾT
        //TEST CODE THÌ ĐƯỢC GỌI LÀ UNIT TEST 
        //TEST CASE CHO UNIT TEST THÌ GỌI LÀ "UNIT TEST" TEST CASE 
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPS/PROCEDURES: 
        //          1. Given n = 0
        //          2. Invoke/call getFactorial(n = 0)
        //EXPECTED RESULT: the method returns 1 stands for 0! = 1
        //STATUS         : PASSED? or FAILED? -> lúc chạy mới biết được kết quả gọi là test run. có thể test đi test lại nhiều lần

        //TEST CASE #2; check getFactorial() with n = 1
        //STEPS/PROCEDURES:
        //          1. Given n = 1
        //          2. Invoke/call getFactorial(n = 1)
        //EXPECTED RESULT: the method returns 1 stands for 1! = 1
        //STATUS         : PASSED? or FAILED? to be update later, when finishing TEST RUN

        //TEST CASE #3: Check getFactorial() with n = 5
        //STEPS/PROCEDURES:
        //          1. Given n = 5
        //          2. Invoke/call getFactorial(n = 5)
        //EXPECTED RESULT: the method returns 1 stands for 5! = 120
        //STATUS         : PASSED? or FAILED? to be update later, when finishing TEST RUN