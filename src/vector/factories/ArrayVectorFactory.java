package vector.factories;

import vector.ArrayVector;
import vector.interfaces.Vector;
import vector.interfaces.VectorFactory;
import vector.*;

public class ArrayVectorFactory implements VectorFactory{
    public ArrayVector createInstance(int size){
        ArrayVector vector = new ArrayVector(size);

        return vector;
    }

}