package OOP;

class student{
    String name,gender;
    int ph;
    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("Phone :"+ph);
    }
}

public class objectclass {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Munna";
        s1.gender="Male";
        s1.ph=231233;
        s1.displayinfo();

        student s2=new student();
        s2.name="Mun";
        s2.gender="Male";
        s2.ph=235533;
        s2.displayinfo();

    }
}
