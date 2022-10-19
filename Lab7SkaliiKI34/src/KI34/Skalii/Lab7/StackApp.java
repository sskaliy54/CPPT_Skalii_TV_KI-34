package KI34.Skalii.Lab7;
/**
 * Class App
 * @author Tetiana Skalii
 * @version 1.0
 */
public class StackApp {
	   /**
	     * @param args
	     */
	    public static void main(String[] args) throws Exception
	    {
	        Stack<? super Task> stack = new Stack<Task>();

	        stack.add(new Multiplication(2,10));
	        stack.add(new Sum(1,2));
	     	System.out.print("Stack Size: ");
	        System.out.println(stack.getSize());
	        stack.get().execute();
	 
	        Task minimal= stack.getTaskWithMinimalResult();
	        minimal.execute();
	        stack.add(new Multiplication(7,5));
	        stack.add(new Multiplication(17,52));
	        stack.add(new Multiplication(74,25));
	        stack.executeAll();
	        System.out.print("Stack Size: ");
	        System.out.println(stack.getSize());
	    }


}
