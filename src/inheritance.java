public class inheritance {
        int a,b,c;
        void sum(){
            a=10;
            b=10;
            c=a+b;
            System.out.println(c);
        }
    }
    class Child{
        float x,y,z;
        void sum(){
            x=10;
            y=5;
            z=x+y;
        }
    }
    class Result extends Child{
        int p,q,r;
        void sum(){
            q=10;
            p=10;
            r=q+p;
            System.out.println("r:"+r);
        }
    }
    class sample{
        public static void main(String[] args) {
            Result obj=new Result();
            obj.sum();
        }
}
