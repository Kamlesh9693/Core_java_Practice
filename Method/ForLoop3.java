public class ForLoop3 {
    void meth1(int b){
        int a=10;
        while(a<=20)
        {
            if(a==15)
            {
                while(b<=30)
                {
                    if(b==25)
                    {
                        break;
                    }
                    System.out.println("b value: "+b);
                    b++;
                }
            }
            System.out.println("a value: "+a);
            a++;

        }
    }
    public static void main(String[] args) {
        ForLoop3 obj=new ForLoop3();
        obj.meth1(20);
    }    
}
