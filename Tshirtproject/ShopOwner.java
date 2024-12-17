package Tshirtproject;

public class ShopOwner implements Observer {

    private static volatile ShopOwner instance;
    private int small = 0;
    private int medium = 0;
    private int large = 0;

    private ShopOwner() {
    }

    public static ShopOwner getInstance() {
        if (instance == null) {
            synchronized (ShopOwner.class) {
                if (instance == null) {
                    instance = new ShopOwner();
                }
            }
        }
        return instance;
    }

    @Override
    public void update(int small, int medium, int lagre) {
        this.small = small;
        this.medium = medium;
        this.large = lagre;
    }

    @Override
    public String toString() {
        return "ShopOwner{" + "small=" + small + ", medium=" + medium + ", large=" + large + '}';
    }

    public void display() {
        System.out.println("The owner has sold these T-shirts:");
        System.out.println("Small:" + this.small);
        System.out.println("Medium:" + this.medium);
        System.out.println("Large:" + this.large);
        System.out.println("Total: " + (this.small + this.medium + this.large));
    }

    public int getSmall() {
        return small;
    }

    public int getMedium() {
        return medium;
    }

    public int getLarge() {
        return large;
    }

}
