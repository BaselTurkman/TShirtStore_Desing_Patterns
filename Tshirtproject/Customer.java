package Tshirtproject;

public class Customer {

    TShirt tShirt;
    boolean hasTshirt = false;

    public Customer() {
    }

    public TShirt makeOrder(TShirtStore area, String size, String color, boolean logo, boolean text) {
        if (hasTshirt) {
            System.out.println("Can't make order again");
            System.out.println("This is The Last Order:");
            return tShirt;
        }
        hasTshirt = true;
        tShirt = area.orderTShirt(size);
        switch (color) {
            case "blue" -> tShirt = new ColorBlue(tShirt);
            case "red" -> tShirt = new ColorRed(tShirt);
            default -> throw new IllegalArgumentException("Invalid color. Only 'blue' or 'red' are allowed.");
        }
        if (logo) {
            tShirt = new Logo(tShirt);
        }
        if (text) {
            tShirt = new Text(tShirt);
        }
        return tShirt;
    }
}
