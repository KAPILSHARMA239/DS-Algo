
import java.util.ArrayList;

public class xorquery {

    
	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
 
        ArrayList<Integer>ar=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>>xor=new ArrayList<>();
        int i=0;
  int txor=0;
        boolean f1=false;
        for(ArrayList<Integer>er:queries)
        {
          if(er.get(0)==1)
          {
              if(f1)
              {
                  f1=false;
                     ArrayList<Integer>tmp=new ArrayList<Integer>();
                 tmp.add(ar.size());
                   tmp.add(txor);
                    xor.add(tmp);
        
                  txor=0;
                
              }
             ar.add(er.get(1));
          }
          else
            {
             
             f1=true;
                  txor^=er.get(1);
              
            }
              
        }
        if(txor!=-1)
        {
               ArrayList<Integer>tmp=new ArrayList<Integer>();
                 tmp.add(ar.size());
                   tmp.add(txor);
                    xor.add(tmp);
        }
//         for(ArrayList<Integer> er:xor)
//         {
//             System.out.println(er);
//         }
        i=xor.size()-2;
        while(i>=0)
        {
            xor.get(i).set(1,xor.get(i+1).get(1)^xor.get(i).get(1));
            i--;
        }
        i=0;
        int j=0;
        
  while(i<ar.size()&&j<xor.size())
  {
      if(i<(xor.get(j)).get(0))
      {
          ar.set(i,ar.get(i)^(xor.get(j)).get(1));
      }
      else
      {
          j++;
       continue;
      }
      
      i++;
  }
      
//        while(i<ar.size())
//        {
//            if(i<xor.get(j).get(0))
//            {
//                ar.add(i,ar.get(i)^xor.get(j).get(1));
//            }
//            else
//            {
//                j++;
//                i--;
//            }
//            i++;
//        }

		return ar;
	}
}