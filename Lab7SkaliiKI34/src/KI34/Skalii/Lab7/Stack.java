package KI34.Skalii.Lab7;
import java.util.ArrayList;
/**
 * Class Stack implements Stack
 * @author Tetiana Skalii
 * @version 1.0
 */
class Stack<T extends Data>
{
 
	private ArrayList<T> arr;
    private int top;
    private int capacity;
    int minEle;
    /**
     * Constructor
     */

   public Stack(int size)
    {
        arr = new ArrayList<T>(size);
        capacity = size;
        top = 0;
   
    }
   /**
    * Method simulates finding the MinElement in Stack
    */

   void getMin() 
   { 
       // Get the minimum number in the entire stack 
       if (arr.isEmpty()) 
           System.out.println("Stack is empty"); 

       // variable minEle stores the minimum element in the stack. 
           else
           System.out.println("Minimum Element in the stack is: " + minEle); 
   } 
    /**
    * Method simulates push data
    */

    public void Push(T Data)
    {
        if (IsFull())
        {
            System.out.println("Stack is FULL!!! \n");
            System.exit(-1);
        }

      /*  int x =Data.getsize();
        if(x<minEle)
        	minEle =x;
        if(top==0)
        	minEle=x;*/
        
        arr.add(Data);
        ++top;
        minEle= arr.get(0).getsize();
        
        for(int i=0 ; i<top;i++) {
         	if (arr.get(i).getsize()<minEle) {
         		 minEle= arr.get(i).getsize();
         	}
         }
        Data.print();
    }
  
   /* public T Pop()
    {
        if (IsEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + Peek(null));
        return arr.get(top--);
    }*/
    /**
     * Method simulates deleting data
     */
    public T Pop() {

        // if stack is empty no element to pop
        if (IsEmpty()) {
          System.out.println("STACK EMPTY!");
          // terminates the program
          System.exit(1);
        }
        
        T t = arr.get(--top);
        //arr.remove(top);
        minEle= arr.get(0).getsize();

       for(int i=0 ; i< top;i++) {
        	if (arr.get(i).getsize() < minEle) {
        		 minEle= arr.get(i).getsize();
        	}
        }

      //System.out.println(minEle);
      /*  if (t.getsize() < minEle) 
        { 
            minEle = t.getsize();
            System.out.println(minEle); 
           // minEle = t.getsize();
           
        } */
                // pop element from top of stack
        System.out.println("Removing " + arr.get(top).getTextName());
              return t;
      }

 	public T Peek()
    {
        if (!IsEmpty()) {
        	T t = arr.get(top);
        	 if (t.getsize() < minEle) 
        		 
                   return arr.get(top);
        }
        else {
            System.exit(-1);
        }
        return null;
    }


    public int GetSize() {
        return top ;
    }


    public boolean IsEmpty() {
        return top == 0;
    }
    public boolean IsFull() {
        return top == capacity - 1;
    }
    public void Print() {
    for (int i =0 ; i<top; i++) {
    	arr.get(i).print();
    	}
    }
    public String toString()
    {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(arr.get(i)) ;
        }
        Ans += String.valueOf(arr.get(top));
        return Ans;
    }
}

