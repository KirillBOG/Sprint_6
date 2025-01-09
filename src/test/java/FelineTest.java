import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {



    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String name = feline.getFamily();
        assertEquals("Кошачьи", name);
    }

    @Test
    public void getKittensWithoutParams() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens();
        assertEquals(1, actualCount);
    }

    @Test
    public void getKittensWithParamsInt() {
        int expectedCount = 2;
        Feline feline = new Feline();
        int actualCount = feline.getKittens(expectedCount);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualGetFood = feline.eatMeat();
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedGetFood, actualGetFood);
    }
}