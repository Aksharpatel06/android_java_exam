
import java.util.ArrayList;
import java.util.Scanner;

public class Largest{
    public static void main(String []arg)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList =new ArrayList<Integer>();

        System.out.print("Enter your length:");
        int len= input.nextInt();


        for(int i=0;i<len;i++)
        {
            System.out.print("Enter your num"+i);
            int num = input.nextInt();
            numList.add(num);
        }

        int lergest=0;
        for(int i=0;i<len;i++)
        {
            if(lergest < numList.get(i))
            {
                lergest=numList.get(i);
            }
        }

        System.out.print("largest number:"+lergest);
    }
}