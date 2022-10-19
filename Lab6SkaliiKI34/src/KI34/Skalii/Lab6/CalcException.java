package KI34.Skalii.Lab6;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Tetiana Skalii
 * @version 1.0
 */
class CalcException extends ArithmeticException
{
    
	private static final long serialVersionUID = 1L;

	public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}

