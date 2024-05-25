package source;

import java.util.Date;

public class Agent extends Personne {
    private String username;
    private String mdp;
    private double salaire;
    public Agent(String username,String mdp){
        this.username=username;
        this.mdp=mdp;
    };

    public Agent(String username,String cin, String nom, String prenom, String tel, String email, String mdp, double salaire,Date date_naissance) {
        super(nom, prenom, tel, cin, email, date_naissance);
        this.username = username;
        this.mdp = mdp;
        this.salaire = salaire;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Agent(String username,String nom,String prenom,String tel,String cin,String email,Date date_naissance,String mdp,double salaire){
        super(nom,prenom,tel,cin,email,date_naissance);
        this.mdp=mdp;
        this.salaire=salaire;
    }

    public String getUsername() {
        return username;
    }
    
    public String getMdp(){
        return mdp;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;  
    }
    
}
