import MusicHouse.MiscProducts.MusicSheet;
import MusicHouse.MusicShop.Guitar;
import MusicHouse.MusicShop.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    Instrument.Shop shop;
    Guitar guitar;
    MusicSheet musicSheet;

    @Before
    public void before()  {
        shop = new Instrument.Shop();
        guitar = new Guitar("electric", "hot pink", 60, 500, 4);
        musicSheet = new MusicSheet("complete works of PCD", 2, 25, false);
    }

    @Test
    public void stockListStartsEmpty() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void addToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(musicSheet);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canGetTotalProfit() {
        shop.addToStock(guitar);
        shop.addToStock(musicSheet);
        assertEquals(463, shop.getTotalProfit());
    }
}