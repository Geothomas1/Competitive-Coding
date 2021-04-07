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
        int ans=findAvgEnginePriceByType(eng,itype);
        if(ans>0)
        {
            System.out.println(ans);
        }else
        {
            System.out.println("There are no engine with given type");
        }
        String iname=sc.nextLine();
        Engine[] ans1=searchEngineByName(iname,eng);
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
