package Tshirtproject;

public class MiddleEastTShirtStore extends TShirtStore {

    public MiddleEastTShirtStore() {
    }

    @Override
    public TShirt createSmallTShirt() {
        return new MiddleEastSmallTshirt();
    }

    @Override
    public TShirt createMediumTShirt() {
        return new MiddleEastMediumTshirt();
    }

    @Override
    public TShirt createLargeTShirt() {
        return new MiddleEastLargeTshirt();
    }

}
