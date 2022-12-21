import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
        Calculator calculator = new Calculator();
        @Test
        void additional(){
            assertEquals(2,calculator.add(1,1));
        }
        @Test
        void difference(){
            assertEquals(3,calculator.subtract(4,1));
        }
        @Test
        void multiplication(){
            assertEquals(200,calculator.multiply(5,40));
        }
        @Test
        void division(){
            assertEquals(120,calculator.devide(360,3));
        }
    }


