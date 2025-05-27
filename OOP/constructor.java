package OOP;

class boys
{
    String name;
    String school;
    int age;
    boys()
    {
        System.out.println("No Value");
    }
    boys(String n,String sh,int a)
    {
        this.name=n;
        this.school=sh;
        this.age=a;
    }
    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Schl :"+school);
        System.out.println("Age :"+age);
    }


}
public class constructor {
    public static void main(String[] args) {
        boys b1 = new boys("Munna","Urhs",16);
        boys b2= new boys("Mun","rgc",17);
        b1.displayinfo();
        b2.displayinfo();
        boys b3 = new boys();
        b3.displayinfo();
    }
}
