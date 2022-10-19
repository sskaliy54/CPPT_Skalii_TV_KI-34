package KI34.Skalii.Lab7;
/**
 * Class Sum extends Task
 * @version 1.0
 */
public class Sum extends Task{
    /**
     * Constructor
     * @param a
     * @param b
     */
    public Sum(int a, int b)
    {
        super(a,b);
    }
    /**
     * Execute method
     */
    public int execute()
    {
    	System.out.print("Sum:");
        return super.showResult(a + b);
    }
}

