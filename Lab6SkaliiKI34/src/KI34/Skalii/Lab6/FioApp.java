package KI34.Skalii.Lab6;
import java.util.Scanner;
import java.io.*;

/**
 * Class <code>FioApp</code> Implements driver for CalcWFio class
 * @author Tetiana Skalii
 * @version 1.0
 */

public class FioApp{
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // TODO Auto-generated method stub
        CalcWFio obj = new CalcWFio();
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter data: ");
			double data = s.nextDouble();
			obj.calculate(data);
		}
        System.out.println("Result is: " + obj.getResult());
        obj.writeResTxt("textRes.txt");
        //obj.writeResBin("BinRes.bin");
        
        obj.readResTxt("textRes.txt");
        System.out.println("Result is: " + obj.getResult());
        obj.readResBin("BinRes.bin");
        System.out.println("Result is: " + obj.getResult());
       
        
    }
    
}
