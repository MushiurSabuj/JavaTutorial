package enumTypeData;

public class Main {
    public static void main(String[] args) {
        EnumTypeData enumdata=null;
        EnumTypeData today= enumdata.MONDAY;
        System.out.println(today);

        CustomizedEnum newEnum= null;
        CustomizedEnum name=newEnum.LIBAN;
        System.out.println(name);

        EnumTest callingEnum= new EnumTest(EnumTypeData.TUESDAY);
        callingEnum.useEnum();
        //System.out.println(callingEnum);

    }

}
