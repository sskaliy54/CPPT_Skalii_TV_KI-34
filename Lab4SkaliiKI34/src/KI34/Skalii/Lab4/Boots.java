package KI34.Skalii.Lab4;
import java.io.FileNotFoundException;

interface IBoots
{
    void takeOffInsulation();
    void insulationOnBoots();
}
/**
 * Class <code>Boots</code> extends Shoes and implements IBoots
 * @author Tetiana Skalii
 * @version 1.0
 */
public class Boots extends Shoes implements IBoots {

    boolean insulation = false;
    public static int count;
    public Boots() throws FileNotFoundException{
        super("Airmax97", 35, "leather");
        count++;

    }
    /**
     * Constructor
     * @param name
     * @param size
     * @param material
     */
    public Boots(String name,int size, String material) throws FileNotFoundException{
        super(name,size, material);
    }
    /**
     * Method takes off insulation
     */
    public void takeOffInsulation()
    {
        if(insulation)
        {
        	insulation = false;
            System.out.println("Taking off insulation");
            fout.println("Taking off insulation");
                 return;
        }
        System.out.println("insulation removed");
    }
    /**
     * Method adds insulation on boots
     */
    public void insulationOnBoots()
    {
        if(!insulation)
        {
        	insulation = true;
        }
        System.out.println("The insulation are on");
    }
}
