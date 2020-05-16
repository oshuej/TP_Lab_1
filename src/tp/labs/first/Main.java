package tp.labs.first;

import com.sun.tools.corba.se.idl.InterfaceGen;

class Main {
    public static void main(String[] args) {

        // ex 2
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 10000L;
        boolean booleanValue = true;
        char charValue = 'c';
        float floatValue = 1.1f;
        double doubleValue = 1.231241;

        // from conditions
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296L;
        float v_float = 0.33333334f;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;

        System.out.println("This is byte " + byteValue);
        System.out.println("This is short " + shortValue);
        System.out.println("This is int " + intValue);
        System.out.println("This is long " + longValue);
        System.out.println("This is boolean " + booleanValue);
        System.out.println("This is char " + charValue);
        System.out.println("This is float " + floatValue);
        System.out.println("This is double " + doubleValue);

        // ex 3
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

        long begin = new java.util.Date().getTime();
        for (long i = 0; i <= 100000000; i++) {
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);

        // ex 5-1
        int[] mas = {12,43,12,-65,778,123,32,76};
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int number : mas) {
            if (number > maxElement) {
                maxElement = number;
            } else if (number < minElement) {
                minElement = number;
            }
        }

        System.out.println("min : " + minElement + " max : " + maxElement);

        // ex 5-2
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)Math.round(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        transposeMatrix(matrix);
        System.out.println();

        for (int[] array : matrix) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
