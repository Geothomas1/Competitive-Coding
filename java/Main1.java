import java.util.*;

public class Main1 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        resortguest[] rg = new resortguest[4];

        for(int i=0;i<4;i++)
        {
            resortguest x = new resortguest();
            x.guestid = sc.nextInt();
            sc.nextLine();
            x.guestname = sc.nextLine();
            x.dateofbooking = sc.nextLine();
            x.numberofroomsbooked=sc.nextInt();
            sc.nextLine();
            x.mealoption=sc.nextLine();
            x.totalbill = sc.nextDouble();

            rg[i] = x;
        }

        sc.nextLine();

        String month = sc.nextLine();
        String meal = sc.nextLine();

        int y = numberofroomsbookedinmonth(rg,month);

        if(y==0) System.out.println("no such rooms");

        else System.out.println(y);

        resortguest t = searchresortguestbymealopted(rg,meal);

        if(t==null) System.out.println("no meals");

        else System.out.println(t.guestid);

    }

    public static int numberofroomsbookedinmonth(resortguest[] rg , String month)
    {
        int count = 0;

        for(int i=0;i<rg.length;i++)
        {
            String[] s = (rg[i].dateofbooking).split("-");
            String currentmonth = s[1];

            if(currentmonth.equalsIgnoreCase(month))
            {
                count+=rg[i].numberofroomsbooked;
            } 
        }

        return count;
    }

    public static resortguest searchresortguestbymealopted(resortguest[] rg , String meal)
    {
        resortguest sho = null;
        resortguest ho = null;

        double sh = -1;
        double h = -1;

        for(int i=0;i<rg.length;i++)
        {
            if(rg[i].totalbill>h && (rg[i].mealoption).equalsIgnoreCase(meal))
            {
                h = rg[i].totalbill;
            }
        }

        if(h==-1) return null;

        for(int i=0;i<rg.length;i++)
        {
            if(rg[i].totalbill>sh && (rg[i].mealoption).equalsIgnoreCase(meal) && rg[i].totalbill!=h)
            {
                sh = rg[i].totalbill;
                sho=rg[i];
            }
        }

        return sho;

    }

}

class resortguest{

    public int guestid,numberofroomsbooked;
    public String guestname,dateofbooking,mealoption;
    public double totalbill;

    resortguest()
    {
        this.guestid=0;
        this.numberofroomsbooked=0;
        this.guestname="";
        this.dateofbooking="";
        this.mealoption="";
        this.totalbill=0;
    }

};