package Lesson1.EX1;

public class Ex1 {

    public static <T> void changeElements(T[] elements, int i1, int i2) {

        T a = elements[i1];
        elements[i1]=elements[i2];
        elements[i2]=a;

    }
}
