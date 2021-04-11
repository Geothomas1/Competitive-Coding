import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Voter1{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        Voter[] v=new Voter[4];
        for(int i=0;i<v.length;i++)
        {
            v[i]=new Voter(Integer.parseInt(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()), Boolean.parseBoolean(sc.nextLine()),sc.nextLine());
        }
        String con=sc.nextLine();
        int ans=function1(v,con);
        if(ans>0)
        {
            System.out.println(ans+"\n");
        }else
        {
            System.out.println("No vote is casted");
        }
        Voter[] ans1=function2(v);
        if(ans1==null)
        {
            System.out.println("No such voter");
        }
        else
        {
            for(int i=0;i<ans1.length;i++)
            {
                System.out.println(ans1[i].getvoterid()+"\n");
            }
        }
    }
    public static int function1(Voter[] v,String con)
    {
        int sum=0;
        for(int i=0;i<v.length;i++)
        {
            if((v[i].getconsituency()).equalsIgnoreCase(con))
            {
                if(v[i].getisvotecasted())
                {
                    sum++;
                }

            }
        }
        return sum;

    }
    public static Voter[] function2(Voter[] v)
    {
       
        int j=0;
        Voter[] help = new Voter[4];

        for(int i=0;i<v.length;i++)
        {
            if(v[i].getvoterage()<30)
            {
                help[j]=v[i];
                j++;
            }
        }
        
        
        for(int i=0;i<j;i++)
        {
            for(int k=i+1;k<j;k++)
            {
                if(help[k].getvoterid()<help[i].getvoterid())
                {
                    Voter temp = help[k];
                    help[k] = help[i];
                    help[i] = temp;
                }
            }
        }

        if(j==0) 
        return null;
        else
        return help;
    }

    }
class Voter {
    private int voterid;
    private String votername;
    private int voterage;
    private boolean isvotecasted;
    private String consituency;
    public int getvoterid()
    {

        return voterid;
    }
    public String getvotername()
    {
        return votername;
    }
    public int getvoterage()
    {
        return voterage;
    }
    public boolean getisvotecasted()
    {
        return isvotecasted;
    }
    public String getconsituency()
    {
        return consituency;
    }

    Voter(int voterid,String votername,int voterage,boolean isvotecasted,String consituency)
    {
        this.voterid=voterid;
        this.votername=votername;
        this.voterage=voterage;
        this.isvotecasted=isvotecasted;
        this.consituency=consituency;

    }
    
}

