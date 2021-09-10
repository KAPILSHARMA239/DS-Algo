
import java.util.*;
public class SumofInfinityarray {
private static int mod = (int) 1e9 + 7;
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
 List <Integer>out=new ArrayList<Integer>();
   
       
       
    
 for(int i=0;i<q;i++)
 {
     int  sum=0;
     
 long l=(queries.get(i)).get(0)-1;
 long r=(queries.get(i)).get(1)-1;
     for(long j=l;j<=r;j++)
     {
        int index=(int)j%n;
         sum=(sum+arr[index])%mod;
         
     }
 sum%=mod;
     out.add(sum);
 
              
 }
     
   
        
return out;
    }
   
}