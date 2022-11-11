package KI34.Skalii.Lab7;

/**
 * Class StackApp implements main method for Stack
 * class possibilities demonstration 
 * @author Tetiana Skalii
 * @version 1.0
 */
public class StackApp {
	   /**
	     * @param args
	     */
			 
	    // main driver method
	    public static void main(String[] args)
	    {
	        Stack <? super Data> Stack1 = new Stack <Data>(10);
	        Stack1.Push(new text("Tania",9));
	        Stack1.Push(new Variable("Integer",8));
	        Stack1.Push(new Variable("Integer",8));
	        Stack1.Push(new Variable("Integer",8));
	        Stack1.Push(new Variable("Char",5));
	        Stack1.Push(new text("Vitalii",7));
	        Stack1.Push(new Variable("Float",1));
            System.out.print("___________________________________ \n");
	        Stack1.getMin();
	        System.out.print("___________________________________ \n");
	        System.out.println("Count of Integer: " +Variable.count );
	        System.out.print("___________________________________ \n");
	        Stack1.Pop();
	        System.out.print("************************************ \n");
	        System.out.println("Stack after delete element ");
	        System.out.print("************************************ \n");
	        Stack1.Print();
	        Stack1.getMin();
	        	        }
	}

