package vectors;

import exceptions.VectorIndexOutOfBoundsException;



import vectors.*;



import java.io.IOException;
import java.io.Serializable;
import java.util.List;


public class ArrayVector implements Vector{

    private double[] vector;
    ArrayVector()
    {

    }

    public ArrayVector(int size)
    {
        vector = new double[size];
    }

    public double getElement(int index) throws VectorIndexOutOfBoundsException
    {
        String message = "Vector Index Out Of Bounds";
        if (index > vector.length - 1) throw new VectorIndexOutOfBoundsException(message);

        return vector[index];
    }

    public int getSize()
    {
        return vector.length;
    }

    public void setElement(int index, double element)
    {

        vector[index] = element;

    }



public double getNorm() throws VectorIndexOutOfBoundsException
{
    double norm = 0;

    for (int i = 0; i < vector.length; i++) {

        norm += (vector[i] * vector[i]);
    }

    return Math.sqrt(norm);
}
private class LinkedListVectorIterator implements java.util.Iterator<Double> {
    int currIndex = 0;
    public LinkedListVectorIterator()
    {

    }

    public boolean hasNext()
    {
        if (currIndex < vector.length) return true;
        return false;
    }

    public Double next()
    {

        double currElement = vector[currIndex];
        currIndex++;

        return currElement;
    }

    public void remove()
    {

    }
}



}

