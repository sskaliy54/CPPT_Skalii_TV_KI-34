/**
 * lab 4 package
 */
package KI34.Skalii.Lab4;

/**
 * Class <code>ShoesApp</code>
 * @author Tetiana Skalii
 * @version 1.0
 */
public class ShoesApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
            /*Boots Martens = new Boots("Dr.Martens 1460", 39 , "leather");
            Martens.Start();
            Martens.showInfo();
            Martens.showClean();
            Martens.insulationOnBoots();
            Martens.changeLacing(2);
            Martens.showLacing();
            Martens.takeOffInsulation();
            Martens.showSize();
            Martens.End();
            Martens.Start();
            Martens.showClean();
            Martens.showRepair();
            Martens.repair();
            Martens.showRepair();
            Martens.showMaterial();
            Martens.clean();
            Martens.End();
            Martens.showClean();
            Martens.dispose();*/
        	Boots Boots1 =new Boots("Dr.Martens 1460", 39 , "leather");
        	Boots Boots2 =new Boots("Dr.Martens 1460", 39 , "leather");
        	Boots Boots3 =new Boots();
        	Boots Boots4 =new Boots("Dr.Martens 1460", 39 , "leather");
        	Boots Boots5 =new Boots();
        	Boots Boots6 =new Boots();
        	        	System.out.println("Count without param : "+Boots.count);
      
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
