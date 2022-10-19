package KI34.Skalii.Lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author EOM Stuff
 * @version 1.0
 */
public class EquationsApp {
    public static void main(String[] args){
        System.out.println("Success");
        try
        {
            out.print("Enter file name: ");
            try (Scanner in = new Scanner(System.in)) {
				String fName = in.nextLine();
				PrintWriter fout = new PrintWriter(new File(fName));
				try
				{
				    try
				    {
				        Equations eq = new Equations();
				        out.print("Enter X: ");
				        int x = in.nextInt();
				        fout.print(eq.calculate(x));
				        out.print(eq.calculate(x));
				    }
				    finally
				    {
				        fout.flush();
				        fout.close();
				    }
				}
				catch (CalcException ex)
				{
				    out.print(ex.getMessage());
				}
			}
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}


