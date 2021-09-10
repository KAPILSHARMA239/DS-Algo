
public class product_of_array_except_itself {

    public static int[] getProductArrayExceptSelf(int[] arr) {
        int p=1,c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
            else
            {
                p*=arr[i];
            }
        }
   if(c==1)
   {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
               arr[i]=p;
            else
            {
                arr[i]=0;
            }
        }
       
   }
        else if(c>1)
        {
            for(int i=0;i<arr.length;i++)
        {
          
                arr[i]=0;
            
        }
        }
        else
        {
               for(int i=0;i<arr.length;i++)
        {
          
                arr[i]=p/arr[i];
            
        }
        }
         return arr;
    }
    

}