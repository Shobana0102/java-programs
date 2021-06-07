import java.util.*;
public class ArmstrongNumber
{
    public static void main(String[] args)//153
    
    {
        int n,a,sum=0,temp;
        
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         int num=n;
        while(n>0)
          {
           a=n%10;
           temp=a*a*a;
           n=n/10;
           sum=sum+temp;

          }
   
   if(sum!=0)
   {
     if(sum==num)
       {
       System.out.println("Armstrong number");
       }
     else
      {
       System.out.println("not an armstrong number");
       }
    }
 }
}