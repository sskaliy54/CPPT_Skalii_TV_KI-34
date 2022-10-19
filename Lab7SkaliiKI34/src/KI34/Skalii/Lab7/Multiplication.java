package KI34.Skalii.Lab7;
/**
 * Class Multiplication extends Task
 * @version 1.0
 */
public class Multiplication extends Task{
    /**
     * Constructor
     * @param a
     * @param b
     */
    public Multiplication(int a, int b)
    {
        super(a,b);
    }
    /**
     * Execute method
     */
    public int execute()
    {
    	System.out.print("Multiplication:");
        return super.showResult(a * b);
    }
}

