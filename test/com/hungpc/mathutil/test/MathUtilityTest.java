/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungpc.mathutil.test;

import com.hungpc.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SE140018
 */
public class MathUtilityTest {
    
    // ta sẽ viết những đoạn code ở đây để tét cái hàm chính getFactorial()
    // bên MathUtility coi chạy đúng ko
    //viết code để test code chính
    //đúng sai ở đây chúng tôi dùng màu XANH ĐỎ
   
    //Shift F6 để chạy
    @Test     //@Test biến hàm thường thành hàm main
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        
        int n=5;//tui muốn tính 5!
        long expect = 120;//tui hy vọng trả về 120
        long actual = MathUtility.getFactorial(n);
        assertEquals(expect, actual);
        //khớp màu xanh, sai lệch màu đỏ
        //màu xanh xuất hiện khi tất cả tình huống xài hàm đều đúng
        //test case đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ
        //                      một test case sai, tất cả bỏ
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả các case (tình huống)
        //mình test
        
        assertEquals(720, MathUtility.getFactorial(6)); //6! có đúng là 720 không
        assertEquals(24, MathUtility.getFactorial(4)); //6! có đúng là 720 không
        assertEquals(6, MathUtility.getFactorial(3)); //6! có đúng là 720 không
        assertEquals(2, MathUtility.getFactorial(2)); //6! có đúng là 720 không
        assertEquals(1, MathUtility.getFactorial(1)); //6! có đúng là 720 không
        assertEquals(1, MathUtility.getFactorial(0)); //6! có đúng là 720 không
        //khi màu đỏ thì có 2 tình huống: hàm bạn tính sai ko như kì vong
                                        //hàm tính đúng, bạn kì vọng sai
    }
    //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay không
    //hàm được thiết kế rằng: đưa tham số n 0..20 -> tính đúng n!
    //hàm được thiết kế rằng: đưa thám số cà chớn, < 0 > 20
    //                        ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính!
    //chốt: đưa tham số cà chớn phải ném về ngoại lệ
    //      nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn
    //      thí kết luận hàm đúng, XANH
    //thấy ngoại lệ khi đưa n cà chớn, mừng vì hàm chạy đúng như thiết kế
    //ngoại lệ xuất hiện khi 5! thì hàm đúng mà ngoại lệ thì ko phải là giá trị để so sánh kiểu assertEquals()
    //vậy ta phải dùng kiểu khác!!!
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
        //cả 2 phải ném về ngoại lệ IllegalArgumentException
    }
    
}
