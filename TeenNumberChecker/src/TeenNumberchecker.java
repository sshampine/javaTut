public class TeenNumberchecker {
    public static boolean hasTeen (int num1, int num2, int num3) {
        return ((num1 >= 13 && num1<=19) || (num2 >= 13 && num2<=19) || (num3 >= 13 && num3<=19)) ? true :false;
    }
    public static boolean isTeen (int age){
        return age >=13 && age <=19 ? true : false;
    }
}
