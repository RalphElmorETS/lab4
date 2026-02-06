public class Term {
    private double coefficient;
    private char variable;
    private int exponent;

    public Term(double coefficient, char variable, int exponent) {
        this.coefficient = coefficient;
        this.variable = variable;
        this.exponent = exponent;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public char getVariable() {
        return variable;
    }

    public int getExponent() {
        return exponent;
    }


}
