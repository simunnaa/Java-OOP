package OOP;

class versity
{
    String name;
    int reg;
    static String uniname="SUST";
    static int cnt=1;
    versity(String n,int r)
    {
        name=n;
        reg=r;

    }
    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Id :"+reg);
        System.out.println("Uni :"+uniname);
        System.out.println("Count :"+cnt++);

    }

}
public class staticvariable {
    public static void main(String[] args) {
        versity s1 = new versity("Munna",9913);
        versity s2 = new versity("MUnnnn",9921);
        s1.displayinfo();
        s2.displayinfo();
    }
}
