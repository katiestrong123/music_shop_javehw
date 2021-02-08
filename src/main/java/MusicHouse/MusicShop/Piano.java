package MusicHouse.MusicShop;

public class Piano extends Instrument implements IPlay {

    int numberOfAliciaKeys;

    public Piano(String instrumentType, String colour, int buyingPrice, int sellingPrice, int numberOfAliciaKeys) {
        super(instrumentType, colour, buyingPrice, sellingPrice);
        this.numberOfAliciaKeys = numberOfAliciaKeys;
    }

    public int getNumberOfAliciaKeys() {
        return numberOfAliciaKeys;
    }

    @Override
    public String playSweetMelody() {
        return "Let's hear it for NY";
    }

    @Override
    public int calculateProfit(){
        return this.getSellingPrice() - getBuyingPrice();
    }
}
