package OOP;

class students
{
  String name;
  String hobby;
  int phone;
  void setinfo(String n,String hb,int ph)
  {
      name=n;
      hobby=hb;
      phone=ph;
  }
  void displayinfo()
  {
      System.out.println("Name : "+name);
      System.out.println("Hobbby :"+hobby);
      System.out.println("Phone :"+phone);
  }
}
public class methood {
    public static void main(String[] args) {
        students s1=new students();
        students s2=new students();
        s1.setinfo("Munna","Football",897634);
        s2.setinfo("Mun","Cricket",23233);
        s1.displayinfo();
        s2.displayinfo();
    }
}
