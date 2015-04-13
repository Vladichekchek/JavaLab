package vector;

import vector.exceptions.VectorIndexOutOfBoundsException;
import vector.factories.ArrayVectorFactory;
import vector.factories.LinkedListVectorFactory;
import vector.interfaces.Vector;
import vector.iterators.LinkedListVectorIterator;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class LinkedListVector implements Vector{
    List<Double> vector = new LinkedList<Double>();

    public double getElement(int i) throws VectorIndexOutOfBoundsException
    {
        String message = "Vector Index Out Of Bounds";
        if (i > vector.size() - 1) throw new VectorIndexOutOfBoundsException(message);
        return vector.get(i);
    }

    public void setElement(int index, double element)
    {
        vector.set(index,element);
    }

    public int getSize()
    {
        return vector.size();
    }

    public double getNorm() throws VectorIndexOutOfBoundsException
    {
        double norm = 0;

        for (int i = 0; i < vector.size(); i++)  {

            norm += (vector.get(i) * vector.get(i));
        }

        return Math.sqrt(norm);
    }

    public void add(double value)
    {
        vector.add(value);
    }

    public void remove(int index)
    {
        vector.remove(index);
    }

    public LinkedListVectorIterator iterator()
    {
        LinkedListVectorIterator linkedListIterator = new LinkedListVectorIterator(vector);
        return linkedListIterator;
    }




}
