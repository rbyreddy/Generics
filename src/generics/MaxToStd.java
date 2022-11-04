package generics;
//Use Case 5 is to extend the max method to also print the max to std out using Generic Method.
import java.util.Arrays;

    public class MaxToStd <T extends Comparable<T>> {

        //Creating 3 variables.
        T x, y, z;

        //Creating Parameterized constructor for generic data types.
        public MaxToStd(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        //Default Constructor
        public MaxToStd()
        {
            System.out.println("Welcome to Generic Assignment Problem.");
        }

        public T maximum()
        {
            return MaxToStd.maximum(x, y, z);
        }

        // determines the largest of three Comparable objects
        public static <T extends Comparable<T>> T maximum(T x, T y, T z)
        {
            T max = x; // assume x is initially the largest

            if (y.compareTo(max) > 0)
            {
                max = y; // y is the largest so far
            }
            if (z.compareTo(max) > 0)
            {
                max = z; // is the largest now
            }
            printMax(x, y, z, max);
            return max; // returns the largest object
        }

        public static String testMaximum(String x, String y, String z)
        {
            String max = x;
            if(y.compareTo(max) > 0)
            {
                max = y; // y is the largest so far
            }
            if(z.compareTo(max) > 0)
            {
                max = z;// is the largest
            }
            //now printMax(x, y, z, max);
            printMax(x, y, z, max);
            return max; // returns the largest object
        }

        public static <T> void printMax(T x, T y, T z, T max)
        {
            System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
        }

        public static void main(String[] args) {
            //Initialization of object.
            MaxToStd testMaximum = new MaxToStd();

            //Define the array where size is 3(given).
            Integer xInt = 5, yInt = 6, zInt = 7;
            Float xFlt = 5.5f, yFlt = 4.5f, zFlt = 3.5f;
            String xStr = "Apple", yStr = "Peach", zStr = "Banana";

            MaxToStd.testMaximum(xStr, yStr, zStr);
            new MaxToStd(xInt, yInt, zInt).maximum();
            new MaxToStd(xFlt, yFlt, zFlt).maximum();
            new MaxToStd(xStr, yStr, zStr).maximum();

        }
    }
