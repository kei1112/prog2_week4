public class Main {
    
    public static void main(String[] args){
        System.out.println("main method runs");
    
        Chatbot bot1 = new Chatbot();
        bot1.greeting();

        Chatbot bot2 = new Chatbot("kei");
        bot2.greeting();

        bot2.setName("kuro");
        bot2.greeting();
        
         
    }
}

