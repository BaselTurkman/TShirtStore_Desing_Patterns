package Tshirtproject;

public class MiddleEastLargeTshirt extends TShirt {

    public MiddleEastLargeTshirt() {
        this.name = "Middle East Tshirt.";
        this.description = "Middle East Large Tshirt.";
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
