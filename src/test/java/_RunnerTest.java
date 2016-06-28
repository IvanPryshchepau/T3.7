import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][] {
                {1,2,1,-0.99908}
        };
    }


    //not completed
    @Test(dataProvider = "data", enabled = false)
    public void testCalculate(double a, double b, double h, double result) throws Exception {
        _Runner.calculate(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(h)});
        for (int i = 0; i < _Runner.f.length; i++) {
            assertEquals(_Runner.f[i], result, 0.00001);
        }
    }

}