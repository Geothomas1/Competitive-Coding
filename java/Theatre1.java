import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

class Theatre1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Theatre[] t=new Theatre[4];
        for(int i=0;i<t.length;i++)
        {
            t[i]=new Theatre(Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Boolean.parseBoolean(sc.nextLine()));
        }
        int tid=Integer.parseInt(sc.nextLine());
        int capacity=Integer.parseInt(sc.nextLine());

        String ans=function1(t,tid);
        if(ans==null)
        {
            System.out.print("no output for given category");
        }else
        {
            System.out.println(ans);
        }
        Theatre[] ans2=function2(t, capacity);
        if(ans2==null)
        {
            System.out.println("no result");
        }else{
            for(int i=0;i<ans2.length;i++)
            {
            System.out.println(ans2[i].getid());
            }
        }

    }
    public static String function1(Theatre[] t,int tid)
    {
        for(int i=0;i<t.length;i++)
        {
            if(t[i].getid()==tid)
            {
                if(t[i].getav() && t[i].getrating()>4)
                {
                    return "Ultra Premium";
                }else if(t[i].getav() && t[i].getrating()>=3 && t[i].getrating()<4)
                {
                    return "Premium";
                }else{
                    return "Normal";
                }
            }
        }
        return null;
    }
    public static String function2(Theatre[] t,int capacity)
    {
        int j=0;
        Theatre[] res;
        for(int i=0;i<t.length;i++)
        {
            if(t[i].getseat()>capacity)
            {
                j++;
            }
        }
        res=new Theatre()

    }
    
}
class Theatre{
    private int id;
    private String name;
    private  int seat;
    private double rate;
    private double rating;
    private boolean av;
    Theatre(int id,String name,int seat,double rate,double rating,boolean av)
    {
        this.id=id;
        this.name=name;
        this.seat=seat;
        this.rate=rate;
        this.rating=rating;
        this.av=av;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public int getseat()
    {
        return seat;
    }
    public double getrate()
    {
        return rate;
    }
    public double getrating()
    {
        return rating;
    }
    public boolean getav()
    {
        return av;
    }



}
