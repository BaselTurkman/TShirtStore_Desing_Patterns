package Tshirtproject;

public class TShirtProject {

    public static void main(String[] args) {
        // A person from china order blue medium T-shirt with bird logo
        ShopOwner onOwner = ShopOwner.getInstance();
        System.out.println("--------------------------------------------------");
        System.out.println("First Order ");
        TShirtStore chShirtStore = new ChinaTShirtStore(); // done
        Customer noor = new Customer();
        TShirt noorFirstOrder = noor.makeOrder(chShirtStore, "medium", "blue", true, true);
        System.out.println(noorFirstOrder.getDescription());
        onOwner.display();
        noorFirstOrder = noor.makeOrder(chShirtStore, "large", "red", true, true);
        System.out.println(noorFirstOrder.getDescription());
        onOwner.display();
        //b. A person from middle east orders a red large T-shirt with Text
        System.out.println("--------------------------------------------------");
        System.out.println("Second Order");
        TShirtStore middShirtStore = new MiddleEastTShirtStore();
        Customer basel = new Customer();
        TShirt baselOrder = basel.makeOrder(middShirtStore, "small", "red", false, true);
        System.out.println(baselOrder.getDescription());
        onOwner.display();

    }
}
