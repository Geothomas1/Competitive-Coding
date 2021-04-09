import java.util.Scanner;

class Voter1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Voter[] v=new Voter[4];
        for(int i=0;i<v.length;i++)
        {
            Voter x=new Voter();
            x.voterid=sc.nextInt();
            sc.nextLine();
            x.votername=sc.nextLine();
            x.voterage=sc.nextInt();
            x.isvotecasted=sc.nextBoolean();
            sc.nextLine();
            x.consituency=sc.nextLine();
            v[i]=x;
        }
        String con=sc.nextLine();
        int ans=function1(v,con);
        if(ans>0)
        {
            System.out.println(ans);
        }else
        {
            System.out.println("No vote is casted");
        }
        Voter[] ans1=function2(v);
        if(ans1==null)
        {
            System.out.println("No such voter");
        }else
        {
            for(int i=0;i<ans1.length;i++)
            {
                System.out.println(ans1[i].voterid);
            }
        }
    }
    public static int function1(Voter[] v,String con)
    {
        int sum=0;
        for(int i=0;i<v.length;i++)
        {
            if((v[i].consituency).equalsIgnoreCase(con))
            {
                if(v[i].isvotecasted)
                {
                    sum++;
                }

            }
        }
        return sum;

    }
    public static Voter[] function2(Voter[] v)
    {
        for(int i=0;i<v.length;i++)
        {
            for(int j=1;j<v.length;j++)
            {
                 if(v[j].voterid<v[j+1].voterid)
                 {
                     Voter temp=v[j];
                     v[j]=v[j+1];
                     v[j+1]=temp;
                 }

            }
        }
        int j=0;
        Voter[] t=new Voter[4];
        for(int i=0;i<v.length;i++)
        {
            if(v[i].voterid<30)
            {
                t[j]=v[i];
                j++;
            }
        }
        if(j==0) return null;
        else
        return v;
    }

    }
class Voter {
    public int voterid;
    public String votername;
    public int voterage;
    public boolean isvotecasted;
    public String consituency;

    Voter()
    {
        this.voterid=0;
        this.votername="";
        this.voterage=0;
        this.isvotecasted=false;
        this.consituency="";

    }
    
}

