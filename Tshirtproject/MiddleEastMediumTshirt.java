package Tshirtproject;

public class MiddleEastMediumTshirt extends TShirt {

    public MiddleEastMediumTshirt() {
        this.name = "Middle East Tshirt.";
        this.description = "Middle East Medium Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("MiddleEastMediumTshirt");
    }

}
