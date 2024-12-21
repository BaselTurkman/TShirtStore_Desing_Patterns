package Tshirtproject;

public class MiddleEastSmallTshirt extends TShirt {

    public MiddleEastSmallTshirt() {
        this.name = "MiddleEast Tshirt.";
        this.description = "MiddleEast Small Tshirt.";
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
