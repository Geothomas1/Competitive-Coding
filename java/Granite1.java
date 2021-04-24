import java.util.Scanner;


class Granite1 {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Granite[] g=new Granite[4];
        for(int i=0;i<g.length;i++)
        {
            g[i]=new Granite(Integer.parseInt(sc.nextLine()),sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine());
        }
        String gname=sc.nextLine();
        int total=Integer.parseInt(sc.nextLine());
        String q=sc.nextLine();
        double res=gettotalprice(g,gname,total);
        if(res==0)
        {
            System.out.println("Granite Name is not found");
        }else
        {
            System.out.println(res);
        }
        Granite res2=findgranitebased(g,q);
        if(res2==null)
        {
            System.out.println("No result found");
        }
        else
        {
            System.out.println(res2.getname());
            System.out.println(res2.getquality());
            System.out.println(res2.getprice());
        }

    }
    public static double gettotalprice(Granite[] g,String gname,int total)
    {
        double totalprice=0.0;
        for(int i=0;i<g.length;i++)
        {
            if(g[i].getname().equalsIgnoreCase(gname))
            {
                totalprice = g[i].getprice() * total + (0.2*total);
            }
        }
        return totalprice;
    }
    public static Granite findgranitebased(Granite[] g,String q)
    {
        int j=0;
        Granite[] ans;
        for(int i=0;i<g.length;i++)
        {
            if(g[i].getquality().equalsIgnoreCase(q))
            {
                j++;
            }

        }
        ans=new Granite[j];
        j=0;
        for(int i=0;i<g.length;i++)
        {
            if(g[i].getquality().equalsIgnoreCase(q))
            {
                ans[j]=g[i];
                j++;

            }
        }
        for(int i=0;i<j-1;i++)
            {
                for(int k=0;k<j-1;k++)
                {
                    if(ans[k].getprice() > ans[k+1].getprice())
                    {
                        Granite t=ans[k];
                        ans[k]=ans[k+1];
                        ans[k+1]=t;
                    }
                }
            }
        if(j==0)
        return null;
        else
        return ans[1];
    }
}

class Granite
{
    private int id;
    private String name;
    private String use; 
    private int price;
    private String quality;
    Granite(int id,String name,String use,int price,String quality)
    {
        this.id=id;
        this.name=name;
        this.use=use;
        this.price=price;
        this.quality=quality;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getuse()
    {
        return use;
    }
    public int getprice()
    {
        return price;
    }
    public String getquality()
    {
        return quality;
    }

    


    
}
