package DomainEntities;

import javaTesting.Resources.Passwordutils;

public class User {
    public String name;
    public String password;
    private String salt; // diferent a cada usuari
    // password == Hash(password_real + salt);

    public User(){
        this("Tomeu","secret");
    }

    public User(String name, String password){
        this.name = name;
        this.salt = Passwordutils.genSalt();
        this.password = Passwordutils.hashedPassword(password, this.salt);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean verifyPassword(String passwordEntered){
        return Passwordutils.verifyUserPassword(passwordEntered,salt,password);
    }

    public void setPassword(String password) {
        this.password = Passwordutils.hashedPassword(password,salt);
    }
}
