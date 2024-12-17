package Tshirtproject;

public class ChinaSmallTshirt extends TShirt {

    public ChinaSmallTshirt() {
        this.name = "China Tshirt.";
        this.description = "China Small Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("ChinaSmallTshirt");
    }
    
}
