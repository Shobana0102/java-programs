//Getting inputs by using BufferedReader
import java.io.*;

public class BufferIO
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        
        //getting integer as an input  value
        String s=b.readLine();
        int intval=Integer.parseInt(s);
        System.out.println(intval);
       
        //getting double as an input value
         s=b.readLine();
        double doubleval=Double.parseDouble(s);
        System.out.println(doubleval);
        
        //getting boolean as an input value.For boolean, default value is false.(i.e)if we are given an input as "hi" it will print "false"
        s=b.readLine();
        boolean boolval=Boolean.valueOf(s);
        System.out.println(boolval);
        
        //getting float value as an input  value
        s=b.readLine();
        float floatval=Float.valueOf(s);
        System.out.println(floatval);
        
        //getting string as an input  value
        s=b.readLine();
        String stringval=String.valueOf(s);
        System.out.println(stringval);
        
        //getting short as an input value
        s=b.readLine();
        Short shortval=Short.valueOf(s);
        System.out.println(shortval);
    }
}