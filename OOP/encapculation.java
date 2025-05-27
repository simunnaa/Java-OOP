package OOP;

class setget
{
    private String name;
   private int age;
   public String getName()
   {
       return name;
   }
   public void setName(String name)
   {
       this.name=name;
   }
   public int getAge()
   {
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }




}
public class encapculation {
    public static void main(String[] args) {
        setget s1 = new setget();
        s1.setName("Munna");
        s1.setAge(22);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
