package Tshirtproject;

public abstract class TShirtStore implements Subject {

    private static int smallShirtsSold = 0;
    private static int mediumShirtsSold = 0;
    private static int largeShirtsSold = 0;
    private final ShopOwner owner = ShopOwner.getInstance();

    @Override
    public void notifyObservers() {
        owner.update(smallShirtsSold, mediumShirtsSold, largeShirtsSold);
    }

    public void sellSmallSize() {
        smallShirtsSold++;
        notifyObservers();
    }

    public void sellMediumSize() {
        mediumShirtsSold++;
        notifyObservers();
    }

    public void sellLargeSize() {
        largeShirtsSold++;
        notifyObservers();
    }

    public abstract TShirt createSmallTShirt();

    public abstract TShirt createMediumTShirt();

    public abstract TShirt createLargeTShirt();

    public TShirt orderTShirt(String size) {
        TShirt tShirt;
        switch (size.toLowerCase()) {
            case "small" -> {
                tShirt = createSmallTShirt();
                sellSmallSize();
            }
            case "medium" -> {
                tShirt = createMediumTShirt();
                sellMediumSize();
            }
            case "large" -> {
                tShirt = createLargeTShirt();
                sellLargeSize();
            }
            default -> {
                throw new IllegalAccessError("Size dose not support");
            }
        }
        return tShirt;

    }
}
