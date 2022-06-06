import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void maltiplicationで5と2の乗算結果が取得できる() throws Exception {
        Calculator sut = new Calculator();
        int expected = 10;
        int actual = sut.maltiplication(5, 2);
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void divisionで5と8の除算結果が取得できる() throws Exception {
        Calculator sut = new Calculator();
        float expected = 0.625f;
        float actual =  sut.division(5, 8);
        assertEquals(actual, expected, 0.001);
    }
}