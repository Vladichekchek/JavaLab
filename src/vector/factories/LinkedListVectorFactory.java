package vector.factories;

import vector.LinkedListVector;
import vector.interfaces.Vector;
import vector.interfaces.VectorFactory;


public class LinkedListVectorFactory implements VectorFactory {
    public LinkedListVector createInstance(int size){
        LinkedListVector vector = new LinkedListVector();

        return vector;
    }
}
