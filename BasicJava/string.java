package BasicJava;

public class string {
    public static void main(String[] args) {
        String s1="Munna";
        String s2=new String("Munna");
        System.out.println(s1);
        System.out.println(s2);
       String s3=s1.concat(s2);
        System.out.println(s3);
        String s4=s3.toUpperCase();
        System.out.println(s4);
        String s5=s3.replace('n','a');
        System.out.println(s5);
    }
}
