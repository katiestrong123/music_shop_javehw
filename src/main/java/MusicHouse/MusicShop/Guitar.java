package MusicHouse.MusicShop;

public class Guitar extends Instrument implements IPlay {

    int numberOfStrings;

    public Guitar(String instrumentType, String colour, int buyingPrice, int sellingPrice, int numberOfStrings) {
        super(instrumentType, colour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String playSweetMelody() {
        return "And now.. wonderwall..?";
    }

    @Override
    public int calculateProfit(){
        return this.getSellingPrice() - getBuyingPrice();
    }
}
