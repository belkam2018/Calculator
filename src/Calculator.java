public class Calculator {
    // this is a very usful method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double substract(double num1, double num2) {
        double result = num1 - num2;
        return result;
        //or return num1 - num2
    }
// divide method
    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
 // rem method
    public static double rem(double num1, double num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        
        multiply first = new multiply();
        first(10,20);
        substract(49,66);
        add(55,67);

    }
}
