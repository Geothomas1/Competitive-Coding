import java.util.Scanner;

class myaccount{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        account[] ac=new account[4];
        for(int i=0;i<ac.length;i++)
        {
            ac[i]=new account(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
        }
        String acname=sc.nextLine();
        double balance=Double.parseDouble(sc.nextLine());
        int res=countaccountbyname(acname,ac);
        if(res==0)
        {
            System.out.println("No Account found with given account name");
        }else
        {
            System.out.println(res);
        }
        account[] res2=searchbybalance(balance,ac);
        if(res2==null)
        {
            System.out.println("No such Account exists");
        }else
        {
            for(int i=0;i<res2.length;i++)
            {
                System.out.println(res2[i].getaccountName());
            }
        }

    }
    public static int countaccountbyname(String acname,account[] ac)
    {
        int count=0;
        for(int i=0;i<ac.length;i++)
        {
            if(ac[i].getaccountName().equalsIgnoreCase(acname))
            {
                count++;
            }
            
        }
        if(count==0)
            return 0;
            else
            return count;

    }
    public static account[] searchbybalance(double balance,account[] ac)
    {
        int j=0;
        account[] ans;
        for(int i=0;i<ac.length;i++)
        {
            if(ac[i].getaccountBalance()>=balance)
            {
                j++;
            }
        }
        ans=new account[j];
        j=0;
        for(int i=0;i<ac.length;i++)
        {
            if(ac[i].getaccountBalance()>=balance)
            {
                ans[j]=ac[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            for(int k=i+1;k<j;k++)
            {
                if(ans[k].getaccountBalance()<ans[i].getaccountBalance())
                {
                    account temp=ans[k];
                    ans[k]=ans[i];
                    ans[i]=temp;
                }
            }
        }
        if(j==0)
        return null;
        else
        return ans;
    }


}

class account{
    private int accountNumber;
    private String accountName;
    private String accountType;
    private double accountBalance;
    public account(int accountNumber,String accountName,String accountType,double accountBalance )
    {
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.accountType=accountType;
        this.accountBalance=accountBalance;
    }
    public int getaccountNumber()
    {
        return accountNumber;
    }
    public String getaccountName()
    {
        return accountName;
    }
    public String getaccoutType()
    {
        return accountType;
    }
    public double getaccountBalance()
    {
        return accountBalance;
    }


}