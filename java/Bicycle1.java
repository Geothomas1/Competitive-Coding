import java.util.Scanner;

class Bicycle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bicycle[] b = new Bicycle[4];
        for (int i = 0; i < b.length; i++) {
            b[i] =new Bicycle(sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));            
        }
        String ibrand = sc.nextLine();
        int iage = Integer.parseInt(sc.nextLine());
        
        Bicycle[] res = findBicycleByAgeGrp(b, iage);
        if (res == null) {
            System.out.print("Bicycle is not availabe for the given Age group");
        } else {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }
        int res2 = TotalCostByBrand(b, ibrand);
        if (res2 <= 0) {
            System.out.println("No bicycle is available for the given brand");
        } else {
            System.out.println(res2);
        }

    }

    public static Bicycle[] findBicycleByAgeGrp(Bicycle[] b, int iage) {
        int j = 0;
        Bicycle[] ans;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getage() <= iage) {
                j++;
            }
        }
        ans = new Bicycle[j];
        j = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getage() <= iage) {
                ans[j] = b[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (ans[k].getcost() < ans[i].getcost()) {
                    Bicycle temp = ans[k];
                    ans[k] = ans[i];
                    ans[i] = temp;
                }
            }
        }
        if (j == 0) {
            return null;
        } else {
            return ans;
        }

    }

    public static int TotalCostByBrand(Bicycle[] b, String ibrand) {
        int total = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getbrand().equalsIgnoreCase(ibrand)) {
                total += b[i].getcost();
            }
        }
        return total;
    }

}

class Bicycle {

    private String name;
    private String brand;
    private int cost;
    private int age;

    Bicycle(String name, String brand, int cost, int age) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.age = age;
    }

    public String getname() {
        return name;

    }

    public String getbrand() {
        return brand;
    }

    public int getcost() {
        return cost;
    }

    public int getage() {
        return age;
    }

}
