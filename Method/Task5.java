public class Task5 {
    static int x=10;
    static int y=20;
    static{
        System.out.println("----test 11 sbi called---");
        System.out.println("X : "+x);
        System.out.println("y :"+y);


    }
    static void m1(){
         int x=100;
    System.out.println("static method called");
    System.out.println("x :"+x);
    System.out.println("y :"+y );

    }
   
       public static void main(String[] args) {
        m1();
    }
    static{
        System.out.println("---test11 sb2 called---");
        System.out.println("x :"+x);
        System.out.println("y : "+y);
    }
    
}
