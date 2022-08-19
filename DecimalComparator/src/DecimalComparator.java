public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = num1*1000;
        num2 = num2*1000;
        int num_1 = (int) num1;
        int num_2 = (int) num2;

        if (num_1 == num_2) return true;
        else return false;
    }
}
