import vectors.ArrayVector;
import vectors.Vector;
import vectors.Vectors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayVector vector1 = new ArrayVector(5);
        ArrayVector vector = new ArrayVector(5);
        for (int i = 0; i <vector.getSize() ; i++) {
            vector.setElement(i,i);
            System.out.println(vector.getElement(i));



        }
        vector.sort();
        for (int i = 0; i <vector.getSize() ; i++) {
            System.out.println(vector.getElement(i));

        }
        System.out.println(vector.getNorm());
        FileOutputStream fileOutputStream = new FileOutputStream("Out.txt");
        Vectors.outputVector(vector,fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        vector1 =(ArrayVector) Vectors.inputVector(new FileInputStream("Out.txt"));
        for (int i = 0; i <vector1.getSize() ; i++) {
            System.out.println(vector1.getElement(i));

        }

        Vectors.scalarMult(vector,vector1);
        for (int i = 0; i <vector.getSize() ; i++) {
            System.out.println(vector.getElement(i));

        }




    }

}
