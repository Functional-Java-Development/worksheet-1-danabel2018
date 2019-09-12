import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;
import static java.lang.String.format;


public class LambdaExpressions {

    static int Randomize(int index) {
        int number;

        Random rd = new Random();
        number = rd.nextInt() & Integer.MAX_VALUE;

        return number;
    }

//Question 1
    public static void main(String[] args) {

        int size = 100;


        //create Random object
       Integer[] arr = new Integer[size];
        Arrays.setAll(arr, LambdaExpressions::Randomize);



            final Comparator<Integer> comparator = (integer1, integer2) -> {
                if (
                    integer1.toString().length() == integer2.toString().length()
                ) {
                    return Integer.compare(integer1, integer2);

                }

                return Integer.compare(integer1.toString().length(), integer2.toString().length());

        };

        Arrays.sort(arr, comparator);

        System.out.println(Arrays.toString(arr));

        //Question 2
     final var filteredList = new FilteredList<Integer>(item -> item % 2 == 1);
     filteredList.add(13);
     filteredList.add(15);
     filteredList.add(17);
     filteredList.forEach(item -> System.out.println(format("Item %d is in the list.", item)));
     try {
         filteredList.add(20);
     } catch (final IllegalArgumentException illegalArgumentException) {
         System.out.println(illegalArgumentException.getMessage());
     }
        System.out.println();
    }




    }

