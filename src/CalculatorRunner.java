import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        String expression = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        expression = scan.nextLine();
        String substringOperation = "";
        int operationVal = 0;
        int var1 = expression.indexOf("*");
        int var2 = expression.indexOf("/");
        int var3 = expression.indexOf("+");
        int var4 = expression.indexOf("-");
        int var5 = expression.indexOf("%");
        int var6 = expression.indexOf("^");

        if (var1 != -1) {
            operationVal = var1;
            substringOperation = expression.substring(var1, var1 + 1);
        } else if (var2 != -1) {
            operationVal = var2;
            substringOperation = expression.substring(var2, var2 + 1);
        } else if (var3 != -1) {
            operationVal = var3;
            substringOperation = expression.substring(var3, var3 + 1);
        } else if (var4 != -1) {
            operationVal = var4;
            substringOperation = expression.substring(var4, var4 + 1);
        } else if (var5 != -1) {
            operationVal = var5;
            substringOperation = expression.substring(var5, var5 + 1);
        } else if (var6 != -1) {
            operationVal = var6;
            substringOperation = expression.substring(var6, var6 + 1);
        }

        String num1String = expression.substring(0, operationVal - 1);
        String num2String = expression.substring(operationVal + 2);

        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);

        Calculator calc = new Calculator(num1, num2);

        if (substringOperation.equals("*")) {
            System.out.println(calc.Multiplication());
        } else if (substringOperation.equals("/")) {
            System.out.println(calc.Division());
        } else if (substringOperation.equals("+")) {
            System.out.println(calc.Addition());
        } else if (substringOperation.equals("-")) {
            System.out.println(calc.Subtraction());
        } else if (substringOperation.equals("%")) {
            System.out.println(calc.Modulus());
        } else if (substringOperation.equals("^")) {
            System.out.println(calc.Exponent());
        }
    }
}
