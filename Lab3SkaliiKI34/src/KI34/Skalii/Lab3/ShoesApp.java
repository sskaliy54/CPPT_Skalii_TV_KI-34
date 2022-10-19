/**
 * lab 3 package
 */
package KI34.Skalii.Lab3;

import java.io.*;
import java.util.*;

/**
 * Shoes Application class implements main method for Shoes class possibilities demonstration
 * @author Tetiana Skalii
 * @version 1.0
 */
public class ShoesApp {
    /**
    * @param args 
    * @throws FileNotFoundException
    */
    public static void main(String[] args) throws FileNotFoundException {
        try{
        	Shoes AirForce1 = new Shoes("Jordan",38, "Leather");
        	Shoes AirForce2 = new Shoes("Blazer",37, "Leather");
            System.out.println("Count pair with size>37=" +Shoes.count);
        	Shoes AirForce3 = new Shoes("AIRMAX-97",35, "Textil");
        	Shoes AirForce4 = new Shoes("Ozweego",36, "Suede");
        	Shoes AirForce5 = new Shoes("Salomon",40, "Leather");
           /* Shoes AirForce = new Shoes(38, "Leather");
            AirForce.Start();
            AirForce.showClean();
            AirForce.showLacing();
            AirForce.changeLacing(2);
            AirForce.showLacing();
            AirForce.End();
            AirForce.Start();
            AirForce.showClean();
            AirForce.showRepair();
            AirForce.showSize();
            AirForce.repair();
            AirForce.showRepair();
            AirForce.showMaterial();
            AirForce.clean();
            AirForce.End();
            AirForce.showClean();
            AirForce.dispose();*/
       /* List<Shoes> shoesList = new ArrayList<Shoes>();
        shoesList.add(new Shoes(38, "Leather"));
        shoesList.add(new Shoes(39, "Leather"));
        shoesList.add(new Shoes(37, "Leather"));
        shoesList.add(new Shoes(35, "Leather"));
        shoesList.add(new Shoes(33, "Leather"));
        int k=0;
        for (Shoes shoes : shoesList){
        	if(shoes.size>37)
        	k++;
        	}*/
            System.out.println("Count pair with size>37=" +Shoes.count);
               }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
