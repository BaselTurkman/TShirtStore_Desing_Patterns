package Tshirtproject;

public class ChinaTShirtStore extends TShirtStore {

    public ChinaTShirtStore() {
    }

    @Override
    public TShirt createSmallTShirt() {
        return new ChinaSmallTshirt();
    }

    @Override
    public TShirt createMediumTShirt() {
        return new ChinaMediumTshirt();
    }

    @Override
    public TShirt createLargeTShirt() {
        return new ChinaLargeTshirt();
    }

}
