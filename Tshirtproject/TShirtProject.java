package Tshirtproject;

public class TShirtProject {

    public static void main(String[] args) {
        // A person from china order blue medium T-shirt with bird logo
        ShopOwner onOwner = ShopOwner.getInstance();
        System.out.println("--------------------------------------------------");
        System.out.println("First Order ");
        TShirtStore chShirtStore = new ChinaTShirtStore();
        TShirt firstOrder = chShirtStore.orderTShirt("medium");
        firstOrder = new ColorBlue(firstOrder);
        firstOrder = new Logo(firstOrder);
        System.out.println(firstOrder.getDescription());
        onOwner.display();
        //b. A person from middle east orders a red large T-shirt with Text
        System.out.println("--------------------------------------------------");
        System.out.println("Second Order");
        TShirtStore middShirtStore = new MiddleEastTShirtStore();
        TShirt secondOrder = middShirtStore.orderTShirt("large");
        TShirt secondOrderw = middShirtStore.orderTShirt("small");
        secondOrder = new ColorRed(secondOrder);
        secondOrder = new Text(secondOrder);
        System.out.println(secondOrder.getDescription());
        onOwner.display();

    }
}
