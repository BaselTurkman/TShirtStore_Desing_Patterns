package Tshirtproject;

public class ChinaMediumTshirt extends TShirt {

    public ChinaMediumTshirt() {
        this.name = "China Tshirt.";
        this.description = "China Medium Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("ChinaMediumTshirt");
    }

}
