package exam;

public class prime {
    public static void  main(String []args)
    {
        int num = 0,sum=0;

        for(int i=2;i<=50;i++)
        {
            num=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    num++;
                }
                if(num==2)
                {
                    System.out.println(i);
                    sum=sum+i;
                }
            }


        }

        System.out.println("THE SUM OF PRIME NUMBERS FROM 1 TO N :"+sum);
    }
}
