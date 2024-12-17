package Tshirtproject;

public class AsiaSmallTshirt extends TShirt {

    public AsiaSmallTshirt() {
        this.name = "Asia Tshirt.";
        this.description = "Asia Small Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("AsiaSmallTshirt");
    }

}
