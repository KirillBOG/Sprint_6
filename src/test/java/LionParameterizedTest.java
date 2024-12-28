import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private static String sex;
    private final boolean hasManeResult;

    static Feline feline = Mockito.mock(Feline.class);

    public LionParameterizedTest(Feline feline, String sex, boolean hasManeResult) {
        LionParameterizedTest.sex = sex;
        this.hasManeResult = hasManeResult;
    }

    @Parameterized.Parameters
    public static Object [][] getDataOrder() {
        return new Object[][] {
                {feline, "Самец", true},
                {feline, "Самка", false},
                //{feline, "Самец", false},

        };
    }

    @Test
    public void doesHaveManeTest () throws Exception {
        Lion lion = new Lion(feline,sex);
        boolean sexOptions = lion.doesHaveMane();
        assertEquals(hasManeResult, sexOptions);
    }


}
