public class Calculator {

    // instance variables
    private double num1;
    private double num2;

    // constructor
    public Calculator (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // methods
    public double Multiplication () {
        return num1 * num2;
    }

    public double Division () {
        return num1 / num2;
    }

    public double Addition () {
        return num1 + num2;
    }

    public double Subtraction () {
        return num1 - num2;
    }

    public double Modulus () {
        return num1 % num2;
    }

    public double Exponent () {
        return Math.pow(num1, num2);
    }
}