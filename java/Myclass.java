
import java.util.*;

import java.lang.*;

import java.io.*;

public class Myclass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee[] emp=new Employee[4];
        for(int i=0;i<4;i++)
        {
            Employee x=new Employee();
            x.employeeid=sc.nextInt();
            sc.nextLine();
            x.name=sc.nextLine();
            x.branch=sc.nextLine();
            x.rating=sc.nextDouble();
            x.ctransport=sc.nextBoolean();
            emp[i]=x;


        }
        sc.nextLine();
        String ibranch=sc.nextLine();
        int ans1=findcountofemployeesusingcomptransport(emp,ibranch);
        if(ans1>0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("No such Employee Found");
        }
        Employee ans2=findEmployeeWithSecondHighestRating(emp);
        if(ans2==null)
        {
            System.out.println(ans2.employeeid);
            System.out.println(ans2.name);

        }
        else
        {
            System.out.println("All employees using company_transport");
        }
    }

        public static int findcountofemployeesusingcomptransport(Employee[] emp,String ibranch)
        {
            int count=0;
            for(int i=0;i<emp.length;i++)
            {
                if((emp[i].branch).equalsIgnoreCase(ibranch))
                {
                    if(emp[i].ctransport==true)
                    {
                        count++;
                    }
                    
                }
            }
            return count;

        }

        public static Employee findEmployeeWithSecondHighestRating(Employee[] emp)
        {
            for(int i=0;i<emp.length;i++)
            {
                for(int j=1;j<emp.length;j++)
                {
                    if(emp[j].rating>emp[j-1].rating)
                    {
                        Employee temp=emp[j];
                        emp[j]=emp[j-1];
                        emp[j-1]=temp;
                    }
                }
            }
        
            int count=0;
            for(int i=0;i<emp.length;i++)
            {
                if(emp[i].ctransport==false)
                {
                    count++;
                    
                    if(count==2) return emp[i];
                    
                }
            }
            return null;
        }
    }




class Employee {
    public int employeeid;
    public String name;
    public String branch;
    public double rating;
    public boolean ctransport;

    Employee() {
        this.employeeid = 0;
        this.name = "";
        this.branch = "";
        this.rating = 0.0;
        this.ctransport = false;
    }
}
