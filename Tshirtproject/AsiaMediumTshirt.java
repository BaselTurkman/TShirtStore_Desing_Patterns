package Tshirtproject;

public class AsiaMediumTshirt extends TShirt {

    public AsiaMediumTshirt() {
        this.name = "Asia Tshirt.";
        this.description = "Asia Medium Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("AsiaMediumTshirt");
    }

}
