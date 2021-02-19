
/**
* Driver class
 * Flips a coin multiple times and counts the number of heads and tails that reult
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountFlips
{
    public static void main(String[] args)
    {
        final int FLIPS = 1000;
        int heads = 0, tails = 0;
        
        Coin myCoin = new Coin();
        
        for (int count = 1; count <= FLIPS; count++)
        {
            myCoin.flip();
            
            if (myCoin.isHeads())
                heads++;
            else
                tails++;
    }
    
    }
}