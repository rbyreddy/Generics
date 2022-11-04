package generics;
//Use Case 4 is to extend the max method to take more than three parameters.
import java.util.Arrays;

public class MoreThanThreeParameters <T> {

        //Creating 3 variables.
        T[] typeArray;

        //Creating Parameterized constructor for generic data types.
        public MoreThanThreeParameters(T[] typeArray)
        {
            this.typeArray = typeArray;
        }

        //Default Constructor
        public MoreThanThreeParameters()
        {
            System.out.println("Welcome to Generic Assignment Problem.");
        }

        public static void main(String[] args) {
            //Initialization of object.
            MoreThanThreeParameters testMaximum = new MoreThanThreeParameters();

            //Define the array where size is 3(given).
            Integer[] intArray = {5,6,8,7,9};
            Float[] floatArray = {8.5f,5.5f,2.3f,3.9f,6.4f,1.2f};
            String[] strArray = {"Apple","Peach","Banana","Guava","Papaya"};

            getMaximum(new MoreThanThreeParameters(intArray));
            getMaximum(new MoreThanThreeParameters(floatArray));
            getMaximum(new MoreThanThreeParameters(strArray));

        }

        //Get maximum from the 3 variables.
        public static <T extends Comparable<T>> void getMaximum(MoreThanThreeParameters testMaximum) {
            Arrays.sort(testMaximum.typeArray);
            T max = (T) testMaximum.typeArray[0];
            int position = 0;
            for (int i = 0; i < testMaximum.typeArray.length; i++)

            {
                T a = (T)testMaximum.typeArray[i];
                int b = a.compareTo(max);
                if(b > 0)
                {
                    max = (T) testMaximum.typeArray[i];
                    position = i;
                }
            }
            System.out.println("Array is sorted.");
            System.out.println("\nMaximum integer is : "+max);
            System.out.println("Maximum integer position is : "+position+" in array.");
            printArray(testMaximum.typeArray);

        }

        //Print the maximum
        public static void printArray(Object[] typeArray) {
            for (Object element : typeArray)
            {
                System.out.println(element+"  ");
            }
        }

    }
