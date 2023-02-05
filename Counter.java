import javax.swing.text.html.HTMLDocument.BlockElement;

/**
 * The counter class implements a counter that will roll over to the initial
 * value when it hits the maximum value.
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
public class Counter
{
    // PUT PRIVATE DATA FIELDS HERE
    private int min, max, counter; 
    private boolean hasRolledOver = false;

    /**
     * The default constructor for objects of class Counter.  Minimum is 0 and the maximum
     * is the largest possible integer.
     */
    public Counter()
    {
        this(0, Integer.MAX_VALUE);
    }
    
    
    /**
     * The alternate constructor for objects of class Counter.  The minimum and maximum values are given as parameters.
     * The counter starts at the minimum value.
     * @param min The minimum value that the counter can have
     * @param max The maximum value that the counter can have
     * */
    public Counter(int min, int max)
    {
        if (min < max) {
            // storing values from paraemters
            this.min = counter = min;
            this.max = max;
        } else {
            throw new CounterInitializationException(
                "Min value cannot be greater than Max value."
            );
        }
    }
    
    /**
     * Determine if two counters are in the same state
     *
     * @param  otherObject   the object to test against for equality
     * @return     true if the objects are in the same state
     */
    public boolean equals(Object otherObject)
    {
        boolean result = true;
        if (otherObject instanceof Counter)
        {
            Counter temp = (Counter) otherObject;
            result = ((temp.counter == counter) && (temp.min == min) && (temp.max == max) && (temp.hasRolledOver == hasRolledOver));
        }
        return result;
    }
    
    

    /**
     * Increases the counter by one
     */
    public void increase()
    {
        counter++;
        if (counter > max) {
            counter = min;
            hasRolledOver = true;
        } else {
            hasRolledOver = false;
        }
    }
 
 
     /**
     * Decreases the counter by one
     */
    public void decrease()
    {
        counter--;
        if (counter < min) {
            counter = max;
            hasRolledOver = true;
        } else {
            hasRolledOver = false;
        }
    }
    
    /**
     * Get the value of the counter
     *
     * @return     the current value of the counter
     */
    public int value()
    {
        return counter;
		
    }
    
    
    /**
     * Accessor that allows the client to determine if the counter
     *             rolled over on the last count
     *
     * @return     true if the counter rolled over
     */
    public boolean rolledOver()
    {
        return hasRolledOver;
    }
    
    /**
     * Override the toString method to provide a more informative
     * description of the counter
     *
     * @return     a descriptive string about the object
     */
    public String toString()
    {
        return "The counter should have the value " + counter +
               "\n    the minimum should be " + min +
               ", the maximum should be " + max +
               "\n    it should not have rolled over";	
    }
 
}
