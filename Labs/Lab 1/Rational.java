/**
 * A class that represents a rational number. 
 * 
 * Author: Kaung Sithu Hein
 * Class: CIS 22C
 * Prof: Mirsaeid Abolghasemi
 * Created Date: 02/04/2023
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
        if (d != 0) {

            // storing values from paraemters
            numerator = n;
            denominator = d; 
            normalize();

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
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }


    /**
     * Invert a rational number r 
     * 
     * @return a new rational number that is 1/r.
     */    
    public Rational invert()
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }





    /**
     * Add two rational numbers
     *
     * @param other the second argument of the add
     * @return a new rational number that is the sum of this and the other rational
     */    
    public Rational add(Rational other)
    {       
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }
    
     /**
     * Subtract a rational number t from this one r
     *
     * @param other the second argument of subtract
     * @return a new rational number that is r-t
     */    
    public Rational subtract(Rational other)
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }

    /**
     * Multiply two rational numbers
     *
     * @param other the second argument of multiply
     * @return a new rational number that is the sum of this object and the other rational.
     */    
    public Rational multiply(Rational other)
    {       
        // ADD NEW CODE AND CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }
        
 
     /**
     * Divide this rational number r by another one t
     *
     * @param other the second argument of divide
     * @return a new rational number that is r/t
     */    
    public Rational divide(Rational other)
    {               
        // CHANGE THE RETURN TO SOMETHING APPROPRIATE
        return null;
    }
     
 
 
 /**
     * Put the rational number in normal form where the numerator
     * and the denominator share no common factors.  Guarantee that only the numerator
     * is negative.
     *
     */
    private void normalize()
    {
        int gcd = gcd(numerator, denominator); // call gcd to simplify the numerator and denominator, and store the new value.
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
   
    
    
}
