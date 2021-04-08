import java.util.*;
import java.lang.*;
import java.io.*;

public class Engine1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Engine[] eng=new Engine[4];
        for(int i=0;i<4;i++)
        {
            Engine x=new Engine();
            x.engineid=sc.nextInt();
            sc.nextLine();
            x.enginename=sc.nextLine();
            x.enginetype=sc.nextLine();
            x.engineprice=sc.nextDouble();
            eng[i]=x;
        }
        sc.nextLine();
        String itype=sc.nextLine();
        String iname=sc.nextLine();
        double ans=findAvgEnginePriceByType(eng,itype);
        if(ans>0)
        {
            System.out.println(ans);
        }else
        {
            System.out.println("There are no engine with given type");
        }
       
        Engine[] ans1=searchEngineByName(eng,iname);
        if(ans1==null)
        {
            System.out.println("There are no engine with the given name");

        }else{
            for(int i=0;i<ans1.length;i++)
            {
                System.out.println(ans1[i].engineid);
            }

        }

        
    }
    public static double findAvgEnginePriceByType(Engine[] eng,String itype)
    {
        int count=0;
        double avg=0;
        for(int i=0;i<eng.length;i++)
        {
            if((eng[i].enginetype).equalsIgnoreCase(itype))
            {
                avg+=eng[i].engineprice;
                count++;
            }
        }
        avg=avg/count;
        return avg;
    }

    public static Engine[] searchEngineByName(Engine[] eng,String iname)
    {
        for(int i=0;i<eng.length;i++)
        {
            for(int j=1;j<eng.length;j++)
            {
                if(eng[j].engineid<eng[j-1].engineid)
                {
                Engine temp=eng[j];
                eng[j-1]=eng[j];
                eng[j]=temp;
                }
            }
        }
        int j=0;
        Engine[] ans=new Engine[4];
        for(int i=0;i<ans.length;i++)
        {
            if((eng[i].enginename).equalsIgnoreCase(iname))
            {
                ans[j]=eng[i];
                j++;
            }
        }
        return ans;

    }
}
class Engine{
   public int engineid;
   public String enginename;
   public String enginetype;
   public double engineprice;
   Engine()
   {
       this.engineid=0;
       this.enginename="";
       this.enginetype="";
       this.engineprice=0.0;

   } 

}
