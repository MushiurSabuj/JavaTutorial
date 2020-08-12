package enumTypeData;

public class EnumTest {
    EnumTypeData myData;
    public EnumTest(EnumTypeData myData) {
        this.myData = myData;
    }
        public void useEnum() {
            switch(myData){
                case MONDAY:
                    System.out.println("My week is starting now");
                    break;
                case TUESDAY:
                    System.out.println("Passing the second day of the week");
                    break;

            }

        }
    }
