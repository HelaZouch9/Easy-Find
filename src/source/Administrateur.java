package source;

public class Administrateur extends Personne {
    private String username;
    private String mdp;
    private double salaire;

    public Administrateur(String username, String password) {
        this.username = username;
        this.mdp = password;
    }
    public String getUsername() {
        return username;
    }
    public String getMdp() {
        return mdp;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.mdp = password;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}

