import java.util.*;
public class Main
{
    static int ArmstrongNumber(int a)
    {
        //int count=0;
        int arm=0;
        String b=String.valueOf(a);
        int c=b.length();
        while(a>0)
        {
            int n=a%10;
            arm=arm+(int)Math.pow(n,c);
            a=a/10;
           // count++;
        }
        return arm;
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c =ArmstrongNumber(a);
        boolean d=(c==a)?Armstrong number:Not a armstrong number;
        System.out.println(d);
        
    }
}// import java.util.*;
// public class ArmstrongNumber
// {
//     public static void main(String[] args)//153
    
//     {
//         int n,a,sum=0,temp;
        
//         Scanner sc=new Scanner(System.in);
//          n=sc.nextInt();
//          int num=n;
//         while(n>0)
//           {
//            a=n%10;
//            temp=a*a*a;
//            n=n/10;
//            sum=sum+temp;

//           }
   
//    if(sum!=0)
//    {
//      if(sum==num)
//        {
//        System.out.println("Armstrong number");
//        }
//      else
//       {
//        System.out.println("not an armstrong number");
//        }
//     }
//  }
// }
