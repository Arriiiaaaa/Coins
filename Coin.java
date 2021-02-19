
/**
 
 *
 * @author Arianna
 * @version 19/2/21
 */
public class Coin
{
    private final int HEADS = 0; // Tails is 1. final means cannot be changed
    private int face; // current side showing
    
    /**
     * Setup this coin by flipping it initially
     */
    
    public Coin() {
        flip();
    }
    
    /**
     * Flip this coin by randomly chosing a face value
     */
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }
    
    /**
     * @ return bool returns true if the current face of the coin is heads
     */
    public boolean isHeads() {
        return (face == HEADS);
    }
    
    /**
     * @ return Returns the current face of this coin as a string
     */
    public String toString()
    {
        return (face == HEADS) ? "Heads" : "Tails";
    }
    

}