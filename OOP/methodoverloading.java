package OOP;

class addition
{
    int num1;
    int num2;
    int num3;
    void add(int n,int n1,int n2)
    {
        num1=n;
        num2=n1;
        num3=n2;
    }
    void add(int n,int n1)
    {
        num1=n;
        num2=n1;
    }
    void add(int n)
    {
        num1=n;
    }
    void add()
    {
        System.out.println("None");
    }
    void displayinfo()
    {
        int sum=num1+num2+num3;
        System.out.println("Num 1 :"+num1);
        System.out.println("Num 2 :"+num2);
        System.out.println("Num 3 :"+num3);
        System.out.println("Sum :"+sum);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        addition a1 = new addition();
        addition a2 = new addition();
        addition a3 = new addition();
        addition a4 = new addition();
        a1.add(10,20,30);
        a2.add(10,20);
        a3.add(10);
        a4.add();
        a1.displayinfo();
        a2.displayinfo();
        a3.displayinfo();


    }
}
