package ifStatement;

public class IfStatementDemo {

    public void seaFood() {
        int tastySeaFood = 6;
        if (tastySeaFood == 6) {
            fatyseafood();
        } else if (tastySeaFood >= 4) {
            lowfatFood();
        } else {
            System.out.println("you don't love sea food.");
        }
    }
        public void fatyseafood(){
            System.out.println("Salmon Fish");
        }
        public void lowfatFood(){
            System.out.println("Organic Food");
        }
    }
