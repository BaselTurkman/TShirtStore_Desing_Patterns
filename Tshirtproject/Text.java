package Tshirtproject;

public class Text extends Features {

    public Text(TShirt tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + " Text: nice day! ";
    }

    @Override
    public void formSize() {
        System.out.println("Tshirt with Text");
    }

}
