import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(5, 10));
    }

    @Test
    public void canSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(30, 25));
    }

    @Test
    public void canMultiply() {
        Calculator calc = new Calculator();
        assertEquals(120, calc.multiply(12, 10));
    }

    @Test
    public void canDivide() {
        Calculator calc = new Calculator();
        assertEquals(75, calc.divide(150, 2), 0.001);
    }

}
