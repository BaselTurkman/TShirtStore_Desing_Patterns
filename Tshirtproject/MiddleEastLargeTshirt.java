package Tshirtproject;

public class MiddleEastLargeTshirt extends TShirt {

    public MiddleEastLargeTshirt() {
        this.name = "MiddleEast Tshirt.";
        this.description = "MiddleEast Large Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("MiddleEastLargeTshirt");
    }

}
