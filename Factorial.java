import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        
        int n,temp=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            temp=i*temp;
        }
        System.out.println("the factorial of 5 is:");
        System.out.println(temp);
    }
}