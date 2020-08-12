package switchStatement;

public class Switch {

        public void testingSwitch() {
            String activity = "Running over the line";

            switch (activity) {
                case "Running over the line":
                    System.out.println("Competition : " + activity);
                    System.out.println("over the moon : " + activity);
                    System.out.println("over the river : " + activity);
                    break;
                case "Running between the line":
                    System.out.println("out of competition : " + activity);
                    break;
                case "Crossing in & out":
                    System.out.println("Not in competition : " + activity);
                    break;
                default:
                    System.out.println("None them them");
            }
        }
    }

