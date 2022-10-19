package KI34.Skalii.Lab7;
/**
 * Class Task
 * @author Tetiana Skalii
 * @version 1.0
 */
public abstract class Task {

    protected int a;
    protected int b;
    /**
     * Constructor
     * @param a
     * @param b
     */
    public Task(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    protected int showResult(int res)
    {
        System.out.println(res);
        return res;
    }

	protected abstract int execute();
     }
