package Lesson1.EX2;

import java.util.Arrays;
import java.util.List;

public class Ex2 {

    public  static <T> List<T> convertToArraylist (T[] array) {

        return Arrays.asList(array);

    }

}
