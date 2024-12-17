package Tshirtproject;

public class ChinaLargeTshirt extends TShirt {

    public ChinaLargeTshirt() {
        this.name = "China Tshirt.";
        this.description = "China Large Tshirt.";
    }

    @Override
    public String getDescription() {
        return "name: " + this.name + " description: " + this.description;
    }

    @Override
    public void formSize() {
        System.out.println("ChinaLargeTshirt");
    }

}
