package Tshirtproject;

public class AsiaTShirtStore extends TShirtStore {

    public AsiaTShirtStore() {
    }

    @Override
    public TShirt createSmallTShirt() {
        return new AsiaSmallTshirt();
    }

    @Override
    public TShirt createMediumTShirt() {
        return new AsiaMediumTshirt();
    }

    @Override
    public TShirt createLargeTShirt() {
        return new AsiaLargeTshirt();
    }

}
