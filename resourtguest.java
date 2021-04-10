import java.security.Provider;
import java.util.Scanner;

class resourtguest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        resourtguest1[] rg=new resourtguest1[4];
        for(int i=0;i<rg.length;i++)
        {
            int guestid=Integer.parseInt(sc.nextLine());
            String guestname=sc.nextLine();
            String dateofbookinig=sc.nextLine();
            int noofroombooked=Integer.parseInt(sc.nextLine());
            String mealoption=sc.nextLine();
            double totalbill=Double.parseDouble(sc.nextLine());
            rg[i]=new resourtguest1(guestid,guestname,dateofbookinig,noofroombooked,mealoption,totalbill);
            
        }
        sc.nextLine();
        String month=sc.nextLine();
        String mealtype=sc.nextLine();
        int ans=function1(rg,month);
        if(ans>0)
        {
            System.out.println("No room booked");

        }else
        {
            System.out.println(ans);
        }
        resourtguest1 ans1=function2(rg,mealtype);
        if(ans1==null)
        {
            System.out.println("No meals");
        }else{
            System.out.println(ans1.getguestId());
        }
    }
    public static int function1(resourtguest1[] rg,String month)
    {
        int count=0;
        for(int i=0;i<rg.length;i++)
        {
            String[] S=(rg[i].getdateofBooking()).split("-");
            String cdate=S[1];
            if(cdate.equalsIgnoreCase(month))
            {
                count+=rg[i].getnoofroomBooked();
            }
        }
        return count;
    }
    public static resourtguest1 function2(resourtguest1[] rg,String mealtype)
    {
        for(int i=0;i<rg.length;i++)
        {
            for(int j=1;j<rg.length;j++)
            {
                if(rg[j].gettotalBill()>rg[j-1].gettotalBill())
                {
                    resourtguest1 temp=rg[j];
                    rg[j]=rg[j-1];
                    rg[j-1]=temp;
                }


            }
        }
        int count=0;
        for(int i=0;i<rg.length;i++)
        {
            if((rg[i].getmealOption()).equalsIgnoreCase(mealtype))
            {
                count++;
                if(count==2)
                return rg[i];
            }
        }
        return null;


    }


    } 
    


class resourtguest1{
    private int guestid;
    private String guestname;
    private String dateofbooking;
    private int noofroombooked;
    private String mealoption;
    private double totalbill;

    public int getguestId()
    {
        return guestid;

    }
    public void setguestId(int guestid)
    {
        this.guestid=guestid;
    }

    public String getguestName()
    {
        return guestname;

    }
    public void setguestName(String guestname)
    {
        this.guestname=guestname;
    }

    public String getdateofBooking()
    {
        return dateofbooking;

    }
    public void setdateofBooking(String dateofbooking)
    {
        this.dateofbooking=dateofbooking;
    }
    public int getnoofroomBooked()
    {
        return noofroombooked;

    }
    public void setnoofroomBooked(int noofroombooked)
    {
        this.noofroombooked=noofroombooked;
    }
    public String getmealOption()
    {
        return mealoption;
    }
    public void setmealoption(String mealoption)
    {
        this.mealoption=mealoption;
    }
    public double gettotalBill()
    {
        return totalbill;
    }
    public void settotalBill(double totalbill)
    {
        this.totalbill=totalbill;
    }

    public resourtguest1(int guestid,String guestname,String dateofbooking,int noofroombooked,String mealoption,double totalbill)
    {
        this.guestid=0;
        this.guestname="";
        this.dateofbooking="";
        this.noofroombooked=0;
        this.mealoption="";
        this.totalbill=0;
    }

}
