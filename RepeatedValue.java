//Finding repeated values
import java.util.Scanner;
class RepeatedValue
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int count=0;
     int n=sc.nextInt();
     int arr[]=new int[n];
      System.out.println();
      for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
      System.out.println();  
      for(int i = 0; i < n; i++)
        {  
          for(int j = i + 1; j < n; j++)
            {  
              if(arr[i] == arr[j])  
              {
                 System.out.println(arr[i]);  
              }
               
            }
        }
    }
}