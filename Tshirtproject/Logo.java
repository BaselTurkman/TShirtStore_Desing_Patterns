package Tshirtproject;

public class Logo extends Features {

    public Logo(TShirt tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + " Logo: bird ";
    }

    @Override
    public void formSize() {
        System.out.println("Tshirt with Logo ");
    }

}
