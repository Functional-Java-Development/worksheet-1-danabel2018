import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class LambdaExpressions {

    static int Randomize() {
        int number;

        Random rd = new Random();
        number = rd.nextInt() & Integer.MAX_VALUE;

        return number;
    }



    public static void main(String[] args) {

        int size = 100;


        //create Random object
       Integer[] arr = new Integer[size];
        Arrays.setAll(arr, i -> Randomize());



            //print array
            System.out.println(Arrays.toString(arr));



        }




    }

