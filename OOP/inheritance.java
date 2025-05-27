package OOP;

class person
{
    String name;
    int age;
    void setinfo(String n,int a)
    {
        name=n;
        age=a;
    }


    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Age is :"+age);
    }
}
class prof extends person
        {
            String profession;


            @Override
            void displayinfo() {
                super.displayinfo();
                System.out.println("profession :"+profession);
            }
        }
public class inheritance {
    public static void main(String[] args) {
        prof p1 = new prof();
        p1.name="Mun";
        p1.age=12;
        p1.profession="student";
        p1.displayinfo();
    }
}
