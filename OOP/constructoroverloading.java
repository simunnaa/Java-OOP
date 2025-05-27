package OOP;

class bank
{
    String name;
    int ac;
    int ph;
    bank(String n,int a,int p)
    {
        name=n;
        ac=a;
        ph=p;
    }
    bank(String n,int a)
    {
        name=n;
        ac=a;
    }
    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Account Number :"+ac);
        System.out.println("Phone : :"+ph);
    }

}

public class constructoroverloading {
    public static void main(String[] args)
    {
        bank a1=new bank("Munnaa",223322,897898);
        bank a2=new bank("Mun",221144);
        a1.displayinfo();
        a2.displayinfo();
    }
}
