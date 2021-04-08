import java.io.*;
import java.util.*;
import java.lang.*;

class Hotel1{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        Hotel[] ht=new Hotel[4];
        for(int i=0;i<ht.length;i++)
        {
            Hotel x=new Hotel();
            x.regno=sc.nextInt();
            sc.nextLine();
            x.hotelname=sc.nextLine();
            x.roomtype=sc.nextLine();
            x.price=sc.nextInt();
            x.wifi=sc.nextBoolean();

        }
        sc.nextLine();
        String type = sc.nextLine();

        double ans=findAveragePriceForGivenType(ht,type);
        if(ans!=0)
        {
            System.out.println(ans);
        }else
        {
            System.out.println("no such hotel");
        }
        Hotel ans1=findHotelWithSecondHighestPackagePrice(ht);
        if(ans1==null)
        {
            System.out.println("No such hotel with that ...");
        }else{
            System.out.println(ans1.hotelname);
            System.out.println(ans1.price);
        }

    }
    public static double findAveragePriceForGivenType(Hotel[] ht,String type)
    {
        double avg=0;
        int count=0;
        for(int i=0;i<ht.length;i++)
        {
            if((ht[i].roomtype).equalsIgnoreCase(type))
            {
            if(ht[i].wifi==true)
            {
                avg+=ht[i].price;
                count++;
            }
        }
        }
        if (count==0)
        return 0.0;
        else
        return avg/count;

    }
    public static Hotel findHotelWithSecondHighestPackagePrice(Hotel[] ht)
    {
        for(int i=0;i<ht.length;i++)
        {
            for(int j=1;j<ht.length;j++)
            {
                if(ht[j].price<ht[+1].price)
                {
                    Hotel temp=ht[j];
                    ht[j]=ht[j+1];
                    ht[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<ht.length;i++)
        {
            if(ht[i].wifi)
            {
                count++;
                if(count==2)
                {
                    return ht[i];
                }
            }
        }
        return null;

    }
}

class Hotel
{

    public int regno;
    public String hotelname;
    public String roomtype;
    public int price;
    public boolean wifi;

    Hotel()
    {
        this.regno=0;
        this.hotelname="";
        this.roomtype="";
        this.price=0;
        this.wifi=false;
    }
}