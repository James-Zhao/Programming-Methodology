package handout4;

/**
 * the rational class is used to represent rational numbers,
 * which are defined to be the quotient of two integer.
 */

public class Rational {

    /** creates a new Rational initialized to zero */
    public Rational() {
        this(0);
    }

    /**
     * create a new Rational from this integer argument
     * @param n the initial value
     */
    public Rational(int n) {
        this(n, 1);
    }

    /**
     * create a new Rational with the value x / y
     * @param x the numerator of the rational number
     * @param y the denominator of the rational number
     */
    public Rational(int x, int y) {
        int g = gcd(Math.abs(x), Math.abs(y));
        num = x / g;
        den = Math.abs(y) / g;
        if (y < 0) num = -num;
    }

    /**
     * Add the rational number r to this one and returns the sum.
     * @param r the rational number to be added
     * @return the sum of the current number and r
     */
    public Rational add(Rational r) {
        return new Rational(this.num * r.den + r.num * this.den,
                this.den * r.den);
    }

    /**
     * subtracts the rational number r from this one
     * @param r the rational number to be subtracted
     * @return the result of subtracting r from current number
     */
    public Rational subtract(Rational r) {
        return new Rational(this.num * r.den - r.num * this.den,
                this.den * r.den);
    }

    /**
     * multiplies this number by the rational number r
     * @param r the rational number used as multiplier
     * @return the result of multiplying the current number by r
     */
    public Rational multiply(Rational r) {
        return new Rational(this.num * r.num, this.den * r.den);
    }

    /**
     * divides this number by the rational number r
     * @param r the rational number used as a divisor
     * @return the result of dividing the current number by r
     */
    public Rational divide(Rational r) {
        return new Rational(this.num * r.den, this.den * r.num);
    }

    /**
     * creates a string representation of this rational number
     * @return the string representation of this rational number
     */
    public String toString() {
        if (den == 1) {
            return "" + num;
        }
        else {
            return num + "/" + den;
        }
    }

    /**
     * calculates the greatest common divisor using Euclid's algorithm
     * @param x first integer
     * @param y second integer
     * @return the greatest common divisor of x and y
     */
    private int gcd(int x, int y) {
        int r = x % y;
        while (r != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }

    /* private instance variables */
    private int num;
    private int den;
}
