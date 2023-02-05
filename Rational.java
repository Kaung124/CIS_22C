/**
 * A class that represents a rational number. 
 * 
 * Author: Kaung Sithu Hein
 * Class: CIS 22C
 * Prof: Mirsaeid Abolghasemi
 * Created Date: 01/29/2023
 * Last Modified Date: 02/04/2023
 * TEAM NAME: Team MLK
 * Members: May Sabai, Lwin Moe, Kaung Sithu Hein
 * 
 * @author Charles Hoot 
 * @version 4.0
*/

public class Rational
{
    // PUT PRIVATE DATA FIELDS HERE
    private int numerator, denominator;

    /**
     * The default constructor for objects of class Rational.  Creates the rational number 1.
     */
    public Rational()
    {       
        this(1, 1); // define numerator = 1 and denominator = 1;
    }

    /**
     * The alternate constructor for objects of class Rational.  Creates a rational number equivalent to n/d.
     * @param n The numerator of the rational number.
     * @param d The denominator of the rational number.
     */    
    public Rational(int n, int d)
    {

        // if the denominator is non-zero
        if (d != 0) { // if the denominator is negative value
            if (d < 0) {
                n *= -1;
                d *= -1;
            }
            // storing values from paraemters
            numerator = n;
            denominator = d; 
            normalize(); // simplify the rational number to the lowest fraction

        } else {
            // when the denominator is zero
            throw new ZeroDenominatorException(
                "Denominator cannot be zero."
            );
        }
    }
    
    /**
     * Get the value of the Numerator
     *
     * @return     the value of the numerator
     */
    public int getNumerator()
    {
        return numerator;
    }
    
    /**
     * Get the value of the Denominator
     *
     * @return     the value of the denominator
     */
    public int getDenominator()
    {
        return denominator;
    }


    /**
     * Negate a rational number r
     * 
     * @return a new rational number that is negation of this number -r
     */    
    public Rational negate()
    {               
        if (denominator != 0) {
            return new Rational(-numerator, denominator); // return the negated value.
        } else {
            return new Rational(0, 1); // default value "0" is returned.
        }
    }


    /**
     * Invert a rational number r 
     * 
     * @return a new rational number that is 1/r.
     */    
    public Rational invert()
    {               
        return new Rational(denominator, numerator); // swap numerator and denominator position
    }


    /**
     * Add two rational numbers
     *
     * @param other the second argument of the add
     * @return a new rational number that is the sum of this and the other rational
     */    
    public Rational add(Rational other)
    {       
        // calculate new numerator and denominator after adding.
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator; // eg: 1/2 + 3/4 = (1*4 + 3*2) = 10
        int newDenominator = this.denominator * other.denominator; // eg: 1/2 + 3/4 = 2*4 = 8
        return new Rational(newNumerator, newDenominator); // eg: 1/2 + 3/4 = 10/8
    }
    
     /**
     * Subtract a rational number t from this one r
     *
     * @param other the second argument of subtract
     * @return a new rational number that is r-t
     */    
    public Rational subtract(Rational other)
    {               
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator; // eg: 1/2 - 3/4 = (1*4 - 3*2) = -2
        int newDenominator = this.denominator * other.denominator; // eg: 1/2 + 3/4 = 2*4 = 8
        return new Rational(newNumerator, newDenominator); // eg: 1/2 + 3/4 = -2/8
    }

    /**
     * Multiply two rational numbers
     *
     * @param other the second argument of multiply
     * @return a new rational number that is the sum of this object and the other rational.
     */    
    public Rational multiply(Rational other)
    {       
        int newNumerator = this.numerator * other.numerator; // eg: 1/2 * 3/4 = 1*3 = 3
        int newDenominator = this.denominator * other.denominator; // eg: 1/2 * 3/4 = 2*4 = 8
        return new Rational(newNumerator, newDenominator); // eg: 1/2 * 3/4 = 3/8
    }
        
 
     /**
     * Divide this rational number r by another one t
     *
     * @param other the second argument of divide
     * @return a new rational number that is r/t
     */    
    public Rational divide(Rational other)
    {         
        int newNumerator = this.numerator * other.denominator; // eg: (1/2) / (3/4) = 1*4 = 4
        int newDenominator = this.denominator * other.numerator; // eg: (1/2) / (3/4) = 2*3 = 6
        return new Rational(newNumerator, newDenominator); // eg: 1/2 * 3/4 = 4/6
    }
     
 
 
 /**
     * Put the rational number in normal form where the numerator
     * and the denominator share no common factors.  Guarantee that only the numerator
     * is negative.
     *
     */
    private void normalize()
    {
        int gcd = gcd(Math.abs(numerator), denominator); // call gcd to simplify the numerator and denominator, and store the new value.
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    
    /**
     * Recursively compute the greatest common divisor of two positive integers
     *
     * @param a the first argument of gcd
     * @param b the second argument of gcd
     * @return the gcd of the two arguments
     */
    private int gcd(int a, int b)
    {
        int result = 0;
        if(a<b)
            result = gcd(b,a);
        else if(b==0)
            result = a;
        else
        {
            int remainder = a % b;
            result = gcd(b, remainder);
        }
        return result;
    }
    
    /** 
     * Return the valid rational number (numerator/denominator) as a string
    */
    public String toString() {
        String finalString = null;
        // if the rational is in a valid state
        if (denominator != 0) {
            finalString = numerator + "/" + denominator;
        }
        return finalString;
    }
    
    
} // End of Rational class
