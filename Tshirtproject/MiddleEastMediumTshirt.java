package Tshirtproject;

public class MiddleEastMediumTshirt extends TShirt {

    public MiddleEastMediumTshirt() {
        this.name = "MiddleEast Tshirt.";
        this.description = "MiddleEast Medium Tshirt.";
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
