/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phyt.mathutil.core;

import com.khanq.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Dell
 */
public class MathUtilityDDTTest {
    
    // ta tách bộ data kiểm thử ra khỏi các câu lệnh so sánh
    // kĩ thuật này gọi là DDT - Data Driven Testing
    //kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ để kiểm 
    // soát sự thiếu đủ của các test case, test data
    // data test ta để riêng ra 1 chỗ, thường là mảng, hay file
    //0! -> 1
    // 1! -> 1
    
    public static Object[][] initData() {
//        int [] a = {phần tử cách nhau bằng dấu phẩy 5, 10, 15};
          Object [][] testData = {{0,1},
        {1,1},
        {2,2}, 
        {4,24}, 
        {5,120}
                  };
        return testData;
        }
          
    
@ParameterizedTest
@MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected){
        assertEquals(expected,  MathUtility.getFactorial(n));
}
}
