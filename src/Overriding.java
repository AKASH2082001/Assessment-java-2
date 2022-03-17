public class Overriding {
        void run(){
            System.out.println("Music Playing");
        }
    }
    class Drums extends Overriding{
        void run(){
            System.out.println("Drums will play loudly");
        }
        public static void main(String args[]){
            Drums obj = new Drums();
            obj.run();
        }
}
