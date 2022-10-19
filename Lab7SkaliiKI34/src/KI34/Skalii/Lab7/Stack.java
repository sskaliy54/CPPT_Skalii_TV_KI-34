package KI34.Skalii.Lab7;
import java.util.ArrayList;
/**
 * @author Tetiana Skalii
 * Class Stack
 * @version 1.0
 */
public class Stack <T extends Task> {
    private final int MAX_CAPACITY = 10;
    private ArrayList<T> storage;
public Stack()
{
	storage= new ArrayList<>();
}
    /**
     * Method returns last task
     */
    public T get() throws Exception
    {

        if(storage.size() == 0)
        {
            throw new Exception("Stack is empty!");
        }

        int lastIndex = storage.size() - 1;

        T task = storage.get(lastIndex);

        storage.remove(lastIndex);

        return task;
    }
    /**
     * Method adds a task
     */
    public void add(T task)
    {

        if(storage.size() >= MAX_CAPACITY)
        {
            throw new StackOverflowError();
        }

        storage.add(task);
    }
    /**
     * Method executes all tasks in the stack
     */
    public void executeAll() throws Exception
    {
        for(int i = storage.size(); i != 0; i--)
        {
           get().execute();
        }
    }
    /**
     * Method returns stack size
     */
    public int getSize()
    {
        return storage.size();
    }
    /**
     * Method returns task with minimal result
     */
    public T getTaskWithMinimalResult() throws Exception
    {
       
        if(storage.size() == 0)
        {
            throw new Exception("Stack is empty!");
        }
        int minResult = storage.get(0).execute();
        for(int i = 0; i < storage.size(); i++)
        {
            int result = storage.get(i).execute();

           if (minResult>result) {
        	   minResult=result;
           }
        }
         return storage.get(minResult);
    }
}

