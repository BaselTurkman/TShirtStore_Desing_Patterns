package Tshirtproject;

public class ColorRed extends Features {

    public ColorRed(TShirt tShirt) {
        this.tShirt = tShirt;

    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + " Color: " + "Red";
    }

    @Override
    public void formSize() {
        System.out.println("Tshirt with Red Color");
    }

}
