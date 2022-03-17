public class Overloading {
        public int Addnumbers(int a, int b) {
            return a + b;
        }

        public int Addnumbers(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            Overloading p = new Overloading();
            Integer result1 = p.Addnumbers(4, 5);
            Integer result2 = p.Addnumbers(4, 5, 6);
            System.out.println("Addition of 2 numbers:" + result1);
            System.out.println("Addition of 3 numbers:" + result2);

        }
}
