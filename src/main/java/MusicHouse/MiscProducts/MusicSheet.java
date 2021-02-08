package MusicHouse.MiscProducts;

import MusicHouse.MiscProducts.OtherProducts;
import MusicHouse.MusicShop.ISell;

public class MusicSheet extends OtherProducts implements ISell {

    boolean givesASheet;

    public MusicSheet(String product, int buyingPrice, int sellingPrice, boolean givesASheet) {
        super(product, buyingPrice, sellingPrice);
        this.givesASheet = givesASheet;
    }

    public boolean getGivesASheet() {
        return givesASheet;
    }

    public void setGivesASheet(boolean givesASheet) {
        this.givesASheet = givesASheet;
    }

    @Override
    public int calculateProfit() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
