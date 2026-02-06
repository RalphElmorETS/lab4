public class Term {
    private double coefficient;
    private char variable;
    private int exponent;

    public Term(double coefficient, char variable, int exponent) {
        if (coefficient == 0) {
            throw new ZeroCoefficientException();
        }
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


    @Override
    public String toString(){

        if (this.exponent == 0) {
            return String.valueOf(this.coefficient);
        }

        if (this.exponent == 1) {
            return this.coefficient + "" + this.variable;
        }

        return this.coefficient + "" + this.variable + "^" + this.exponent;
    }
}
