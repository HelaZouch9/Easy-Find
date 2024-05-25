package source;

import java.util.Date;

public class Personne {
    private String cin;
    private String nom,prenom;
    private String tel;
    private String email; 
    private Date date_naissance;
    public Personne(){}
    public Personne(String nom, String prenom, String tel,String cin, String email) {  //rania
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
    }
    public Personne(String nom, String prenom, String tel,String cin, String email, Date date_naissance) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.date_naissance = date_naissance;
    }
    
    public String getNom(){   //fazet polymorphisme
        return nom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getCin() {
        System.out.println(cin);
        return cin;
        
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        System.out.println(tel);
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
