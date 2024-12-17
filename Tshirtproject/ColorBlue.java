
package Tshirtproject;


public class ColorBlue extends Features{
    
    public ColorBlue(TShirt tShirt) {
        this.tShirt = tShirt;

    }

    @Override
    public String getDescription() {
        return tShirt.getDescription() + " Color: " + "Blue";
    }

    @Override
    public void formSize() {
        System.out.println("Tshirt with Blue Color");
    }

    
}
