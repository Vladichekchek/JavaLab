package vectors;

import vectors.*;

import java.io.*;
import java.util.LinkedList;

public class Vectors {


    public static void mult(double number, Vector arrayVector) {
        for (int i = 0; i < arrayVector.getSize(); i++) {
            arrayVector.setElement(i, arrayVector.getElement(i) * number);
        }

    }

    public static void vectorSum(Vector arrayVector, Vector arrayVector2) {
        for (int i = 0; i < arrayVector.getSize(); i++) {
            arrayVector.setElement(i, arrayVector.getElement(i) + arrayVector2.getElement(i));
        }
    }

    public static void scalarMult(Vector arrayVector, Vector arrayVector2) {
        for (int i = 0; i < arrayVector.getSize(); i++) {
            arrayVector.setElement(i, arrayVector.getElement(i) * arrayVector2.getElement(i));
        }
    }


    public static void outputVector(Vector v, OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        for (int i = 0; i < v.getSize(); i++) {
            dataOutputStream.writeDouble(v.getElement(i));
        }
        dataOutputStream.flush();
    }

   public static Vector inputVector(InputStream in) throws IOException {
        LinkedListVector linkedListVector = new LinkedListVector();
        DataInputStream dataInputStream = new DataInputStream(in);
        double buf = 0;
        while ((buf = dataInputStream.readDouble()) >= 0.0) linkedListVector.addElement(buf);
        return (Vector) linkedListVector;
    }

   public static void writeVector(Vector v, Writer out) {
        PrintWriter printWriter = new PrintWriter(out);
        for (int i = 0; i < v.getSize(); i++) {
            printWriter.println(v.getElement(i));
        }
    }

   public static  Vector readVector(Reader in) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(in);
        LinkedListVector linkedListVector = new LinkedListVector();
        for (int type = streamTokenizer.nextToken(); type != StreamTokenizer.TT_EOF; type = streamTokenizer.nextToken()) {
            if (type == StreamTokenizer.TT_NUMBER) {
                linkedListVector.addElement(streamTokenizer.nval);
            }
        }
        return (Vector) linkedListVector;
    }
}




