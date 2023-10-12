/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phyt.mathutil.core;

import com.khanq.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell
 */
public class MathUtilityTest {
    //Test case template/structure:
    //id | desc | steps/procedures | expected value | status ( passed/failed)
    
    //TEST CASE #1: VERIFY the GetFactorial() function with n = 0
    //Steps/ Procedures:
    //              1. Given n = 0
    //              2. Call/Invoke getFactorial(int n)
    //Expected result
    // The method getFactorial(n = 0) must return 1 as the result of 0! == 1
    //Status: PASSED | FAILDED đoán xem khi chạy app/hàm/method
    @Test //dính đến thuật ngữ framework
    
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(6));
    }
}
