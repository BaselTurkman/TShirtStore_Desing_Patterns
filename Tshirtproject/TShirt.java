package Tshirtproject;

public abstract class TShirt {

    String name;
    String description;

    public abstract String getDescription();

    public abstract void formSize();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
