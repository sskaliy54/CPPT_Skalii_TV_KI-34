package KI34.Skalii.Lab7;

/**
 * Interface <code>Data</code> extends Comparable
 * @author Tetiana Skalii
 * @version 1.0
 **/
interface Data extends Comparable<Data>
{
    public int getSize();
    public void print();
    public String getTextName();
	public int getsize();
}