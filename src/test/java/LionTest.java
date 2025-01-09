import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test

    public void getKittensTest () throws Exception {
        int expectedCount = 1;
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);
        Lion lion = new Lion(feline, "Самка");
        int actualMitten = lion.getKittens();
        assertEquals(expectedCount, actualMitten);

    }
    @Test

    public void getFoodTest() throws  Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Хищник"));
        Lion lion = new Lion(feline,"Самец");
        List<String> actualFood = lion.getFood();
        List<String> expectedFood = List.of("Хищник");
        assertEquals(expectedFood, actualFood);
    }
    @Test(expected = Exception.class)
    public void testInvalidSexThrowsException() throws Exception {
       Feline feline = Mockito.mock(Feline.class);
       new Lion(feline,"Некорректный");
    }

}
