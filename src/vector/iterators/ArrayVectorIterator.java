package vector.iterators;

import vector.ArrayVector;
import vector.exceptions.VectorIndexOutOfBoundsException;
import vector.interfaces.Vector;
import vector.interfaces.*;

import java.util.Iterator;

public class ArrayVectorIterator implements Iterator<Double> {

    double[] vector;
    int currIndex = 0;
    public ArrayVectorIterator(double[] vector)
    {
        this.vector = vector;
    }

    public boolean hasNext()
    {
        if (currIndex  < vector.length) return true;

        return false;
    }

    public Double next()
    {
        double currElement = 0;


            currElement = vector[currIndex];
            currIndex++;
            return currElement;

    }

    public void remove()
    {

    }

}
