package cr.ac.una.est.minidiscord.business.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID=1l;
    private final String username;

    public User(String username){
        this.username= username;
    }

    public String getUsername() {
        return username;
    }
}
