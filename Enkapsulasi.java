package enkapsulasi;

public class Enkapsulasi {

    public static void main(String[] args) {
        
        User Gusti = new user (username:"APA",password:"OPO");


        Gusti.setUsername("Gusti");
        Gusti.setPassword("Sg2alokOnly");


        System.out.println("Username: " + Gusti.getUsername());
        System.out.println("Password: " + Gusti.getPassword());  
    }
    
}
