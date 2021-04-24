import java.util.*;
class MyClass2{
    static double findAvgEnginePriceByType(Engine[] eng, String etype){
        int count = 0;
        double avg = 0;
        for(int i=0; i<eng.length; i++){
            if((eng[i].getEngineType()).equalsIgnoreCase(etype)){
                avg+=eng[i].getEnginePrice();
                count++;
            }
        }
        return avg/count;
    }
    static Engine[] searchEngineByName(Engine[] eng, String ename){
        boolean f = false;
        for(int i=0; i<eng.length; i++){
            if(eng[i].getEngineName().equalsIgnoreCase(ename)){
                f = true;
            }
            for(int j=i+1; j<eng.length; j++){
                if(eng[i].getEngineId() > eng[j].getEngineId()){
                    Engine temp = eng[i];
                    eng[i] = eng[j];
                    eng[j] = temp;
                }
            }
        }
        if (f){
            return eng;
        } else{
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] eng = new Engine[4];
        for (int i=0; i<4; i++){
            Engine e = new Engine(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            eng[i] = e;
        }
        String etype = sc.nextLine();
        String ename = sc.nextLine();
        double ans1=findAvgEnginePriceByType(eng,etype);
        Engine[] ans2=searchEngineByName(eng,ename);
        System.out.println(ans1);
        sc.close();
    }
}

class Engine{
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;
    // Engine(){
    //    this.engineId=0;
    //    this.engineName="";
    //    this.engineType="";
    //    this.enginePrice=0.0;

    // }
    Engine(int eid, String ename, String etype, double eprice){
        this.engineId = eid;
        this.engineName = ename;
        this.engineType = etype;
        this.enginePrice = eprice;
    }
    public int getEngineId(){
        return this.engineId;
    }
    public String getEngineName(){
        return this.engineName;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public double getEnginePrice(){
        return this.enginePrice;
    }
}