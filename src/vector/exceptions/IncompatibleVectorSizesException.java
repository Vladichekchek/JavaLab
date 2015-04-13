package vector.exceptions;


public class IncompatibleVectorSizesException extends RuntimeException{
    public IncompatibleVectorSizesException()
    {
        super();
    }

    public IncompatibleVectorSizesException(String message)
    {
        super(message);
    }

}
