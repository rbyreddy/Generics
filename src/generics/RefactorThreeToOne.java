package generics;
//Refactoring all 3 to one generic method and find out the maximum.
import java.util.Scanner;

public class RefactorThreeToOne {

        //Default Constructor
        public RefactorThreeToOne()
        {
            System.out.println("Welcome to Generic Assignment Problem.");
        }

        public static void main(String[] args) {
            //Initialization of object.
            RefactorThreeToOne testMaximum = new RefactorThreeToOne();

            //Define the array where size is 3(given).
            Integer[] intArray = {3,4,8};
            Float[] floatArray = {5.2f, 4.5f, 3.5f};
            String[] stringArray = {"Apple","Peach","Banana"};
            System.out.println("Considering integer array");
            printArray(intArray);
            getMaximum(intArray);
            System.out.println("Considering float array");
            printArray(floatArray);
            getMaximum(floatArray);
            System.out.println("Considering string array");
            printArray(stringArray);
            getMaximum(stringArray);
        }

        //Get maximum from the array and its position.
        public static <T extends Comparable<T>> void getMaximum(T[] array) {
            T max = array[0];
            int position = 0;
            for (int i = 0; i < array.length; i++)
            {
                int a = array[i].compareTo(max);
                if(a > 0)
                {
                    max = array[i];
                    position = i;
                }
            }
            System.out.println("\nMaximum integer is : "+max);
            System.out.println("Maximum integer position is : "+position+" in array.");
        }

        //Printing the array.
        public static <T> void printArray(T[] array) {
            System.out.println("Array is : ");
            for (T element : array)
            {
                System.out.print(element+"  ");
            }
        }
    }
