package exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class assending {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int[] num = {1, 2, 3, 6, 7, 4};

        Arrays.sort(num);
        System.out.println("Assending order");
        for(int i:num)
        {
            System.out.println(i);
        }


    }
}
