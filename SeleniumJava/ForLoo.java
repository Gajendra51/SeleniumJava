import   java.util.Scanner;

public class ForLoo
{
        public static void main(String[]   args)
        {
                   Scanner scanner=new  Scanner(System.in);
                   System.out.println("Enter first number: ");
                    int num1=scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int num2=scanner.nextInt();
                    System.out.println("Enter third number: ");
                    int num3=scanner.nextInt();
                    System.out.println("Enter fourth number: ");
                    int num4=scanner.nextInt();

                    int[] num={num1, num2, num3, num4};
                    int max= num[0];
                    for(int i=0;i<num.length;i++)
                   {
                         if(num[i]>max)
                          {
                                   max=num[i];
                           }
                   }
                   System.out.println(max+" is the maximun number.");
          }
}