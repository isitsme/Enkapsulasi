
package enkapsulasi;

public class User {
    private String username;
    private String password;
    private int id;
    private  boolean status;
    
    public User(String username, String password, int id){ 
        this.username = username ;
        this.password = password ;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
