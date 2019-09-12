import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class LambdaExpressions {

    static int Randomize(int index) {
        int number;

        Random rd = new Random();
        number = rd.nextInt() & Integer.MAX_VALUE;

        return number;
    }


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

        }




    }

