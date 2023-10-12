/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanq.mathutil.core;

/**
 *
 * @author pc
 */
//class này chứa các hàm static dùng chung cho mọi nơi
//khi nào dùng static: khi ta làm các hàm mà chỉ xử lí xong rồi return 
//ko cần lưu trữ lại thông tin vao instance variable - đcặ tính của object
public class MathUtility {

    public static final double PI = 3.14;

    //C# public const double Pi = 3.14; static hiểu ngầm luôn 
    //Hàm tính n!= 1.2.3....n
    //ko tính giai thừa số âm
    //0! = 1! quy ước 0! là 1
    //vì giai thừa tăng rất nhanh, 21! kiểu long chứa ko nổi (vượt 18 số 0)
    //do đó getF() của chúng ta chỉ chơi với n = 0...20
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n.n must be 0..20");

        if (n == 0 || n == 1) 
            return 1; // nếu n đặc biệt, ta return sớm luôn
        
        long result = 1;//sống sót đến lệnh này, sure n = 0..20

        for (int i = 2; i <= n; i++)
            result *= i;
       
        return result;
    }
}
