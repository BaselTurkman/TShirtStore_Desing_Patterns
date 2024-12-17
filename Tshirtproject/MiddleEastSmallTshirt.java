package Tshirtproject;

public class MiddleEastSmallTshirt extends TShirt {

    public MiddleEastSmallTshirt() {
        this.name = "Middle East Tshirt.";
        this.description = "Middle East Small Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("MiddleEastSmallTshirt");
    }

}
