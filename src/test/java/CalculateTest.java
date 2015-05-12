/**
 * Created by Liliia_Klymenko on 12-May-15.
 */

import org.junit.Test;
import static junit.framework.Assert.*;

public class CalculateTest {

    @Test
    public void  testCalculator(){
        Calculator calc = new Calculator();
        int n = calc.calculate(2,3);

        assertEquals(5, n);
    }
}
