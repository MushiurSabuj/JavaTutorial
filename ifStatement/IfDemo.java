package ifStatement;

public class IfDemo {
    public static void main(String[] args) {
        int foodType = 5;
        if (foodType < 3) {
            System.out.println("Print Burger");
        } else {
            System.out.println("Print Ice-Tea");
        }
        if (foodType < 6) {
            System.out.println("Print Chicken over rice ");
        } else {
            System.out.println("Beef-Burger");
        }
    }
}
