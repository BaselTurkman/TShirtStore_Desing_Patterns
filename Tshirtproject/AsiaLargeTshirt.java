package Tshirtproject;

public class AsiaLargeTshirt extends TShirt {

    public AsiaLargeTshirt() {
        this.name = "Asia Tshirt.";
        this.description = "Asia Large Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("AsiaLargeTshirt");
    }

}
