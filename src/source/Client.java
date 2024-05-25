package source;

import java.util.Date;

public class Client extends Personne {
    
    public Client(String nom,String prenom,String cin,String tel, String email){
        super(nom,prenom,tel,cin,email);
    }
    public Client(String nom,String prenom,String cin,String tel, String email,Date date_naissance){
        super(nom,prenom,tel,cin,email,date_naissance);
    }
  
}