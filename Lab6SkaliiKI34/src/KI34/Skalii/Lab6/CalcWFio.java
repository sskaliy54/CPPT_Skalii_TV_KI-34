package KI34.Skalii.Lab6;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Class <code>CalcWFio</code> implements method for tg(x)*ctg(2x) expression calculation and methods for writing and reading files
 * @author Tetiana Skalii
 * @version 1.0
 */

class CalcWFio
{

    /**
     * Method writes txt file
     * @param fName File's name
     * @throws FileNotFoundException error
     */

    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }
    
    /**
     * Method read txt file
     * @param fName File's name
     */

    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
        	System.out.print(ex.getMessage());
        }
    }
    /**
     * Method writes bin file
     * @param fName File's name
     * @throws IOException error
     */
    public void writeResBin(String fName) //throws FileNotFoundException, IOException
    {
    	try ( DataOutputStream f = new DataOutputStream(new FileOutputStream(fName)) ) {
       f.writeDouble(result);
       f.close();
    	}

    	catch (IOException e) {
    		System.out.println("Cannot Open the Output File");
    		return;
    	}

        //DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        //f.writeDouble(result);
        //f.close();
    }

    /**
     * Method reads bin file
     * @param fName File's name
     * @throws IOException error
     */
    public void readResBin(String fName) //throws FileNotFoundException, IOException
    {
        try(DataInputStream f = new DataInputStream(new FileInputStream(fName))){
        	result = f.readDouble();
            f.close();
        } 
        catch (IOException e) {
        	PrintWriter writer=null;
        	try {
				 writer = new PrintWriter("textRes.txt");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
        	writer.println("BinFileNotFound\n" +result);
        	writer.flush();
            writer.close();

    		//System.out.println("Cannot Open the Input File");
        }
       // result = f.readDouble();
        //f.close();
    }
 

    
   
    

    public void calculate(double x)
    {
        Equations eq = new Equations();
        result = eq.calculate(x);
    }

    public double getResult()
    {
        return result;
    }
    private double result;
}
