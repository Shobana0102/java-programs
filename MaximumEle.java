
import java.util.Scanner;
class MaximumEle
{
    public static void main(String[] args)
    {
    int n;
    int a=0, b=0;
   
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
      System.out.println();
      for(int i=0;i<arr.length;i++)
       {
        arr[i]=s.nextInt();
       }
    for(int i=0;i<arr.length;i++)
       {
        if(a<arr[i])
         {
         a=arr[i];
         }
       }
    System.out.println("maximum element in array:"+a);
    }
}