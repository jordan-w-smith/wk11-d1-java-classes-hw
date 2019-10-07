import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void waterBottleHasVolume() {
        WaterBottle bottle = new WaterBottle();
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeByTen() {
        WaterBottle bottle = new WaterBottle();
        bottle.drinkWater();
        bottle.drinkWater();
        bottle.drinkWater();
        assertEquals(70, bottle.getVolume());
    }

    @Test
    public void emptyBottle() {
        WaterBottle bottle = new WaterBottle();
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle() {
        WaterBottle bottle = new WaterBottle();
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }


}
