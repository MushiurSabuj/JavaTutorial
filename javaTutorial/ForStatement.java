package javaTutorial;

public class ForStatement {
    public static void main(String[] args) {
        int[] googleID=new int[5];
        try {
            googleID[0] = 901;
            googleID[1] = 902;
            googleID[2] = 903;
            googleID[3] = 904;
            googleID[4] = 905;
            googleID[5] = 906;
            googleID[6] = 907;
        }
        catch (Exception find){
            find.printStackTrace();
            System.out.println("print a message for user that inserting a additional number.");
        }
        System.out.println("Print the google ID for user: " + googleID[4]);
        for(int x=0; x<4; x++){
            System.out.println("Print the id for user: " + googleID[x]);
        }
        for(int x=4; x>0; x--)
            System.out.println("Print the id for user: " + googleID[x]);

    }
}
