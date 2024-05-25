package source;

public class Appartement {
    private String id_app;
    private String surface;
    private String nb_piece;
    private String gouvernorat;
    private String num;
    private String rue;
    private String code_postal;
    private String prix;
    private boolean meublé;
    private String type_loc;
    private String nb_personne_max;
    private String penalité;
    private String etat;
    private boolean disponibilité;
    private String cin_propri;
    private String testetat;
    private String testdispo;
    
    public Appartement(String id_app,String surface,String nb_piece,String gouvernorat,String num,String rue,String code_postal,String prix,boolean meublé,String type_loc,String nb_personne_max,String penalité,boolean disponibilité,String cin_propri,String etat){
        this.id_app=id_app;
        this.cin_propri=cin_propri;
        this.code_postal=code_postal;
        this.disponibilité=disponibilité;
        this.etat=etat;
        this.meublé=meublé;
        this.gouvernorat=gouvernorat;
        this.prix=prix;
        this.rue=rue;
        this.surface=surface;
        this.type_loc=type_loc;
        this.nb_personne_max=nb_personne_max;
        this.num=num;
        this.penalité=penalité;
        this.nb_piece=nb_piece;
        this.testetat=testetat;
        this.testdispo=testdispo;
    }
    //constructeur utilisé pour le update
    public Appartement(String id_app,String surface,String nb_piece,String gouvernorat,String num,String rue,String code_postal,String prix,boolean meublé,String type_loc,String nb_personne_max,String penalité,boolean disponibilité,String cin_propri,String etat,String testetat,String testdispo){
        this.id_app=id_app;
        this.cin_propri=cin_propri;
        this.code_postal=code_postal;
        this.disponibilité=disponibilité;
        this.etat=etat;
        this.meublé=meublé;
        this.gouvernorat=gouvernorat;
        this.prix=prix;
        this.rue=rue;
        this.surface=surface;
        this.type_loc=type_loc;
        this.nb_personne_max=nb_personne_max;
        this.num=num;
        this.penalité=penalité;
        this.nb_piece=nb_piece;
        
    }

    public Appartement(String id_app, String nb_piece, String gouvernorat, String prix, boolean meublé, String type_loc, String nb_personne_max, String cin_propri,String testetat) {
        this.id_app = id_app;
        this.nb_piece = nb_piece;
        this.gouvernorat = gouvernorat;
        this.prix = prix;
        this.meublé = meublé;
        this.type_loc = type_loc;
        this.nb_personne_max = nb_personne_max;
        this.cin_propri = cin_propri;
        this.testetat=testetat;
    }

    public String getId_app() {
        return id_app;
    }

    public void setTestetat(String testetat) {
        this.testetat = testetat;
    }

    public void setTestdispo(String testdispo) {
        this.testdispo = testdispo;
    }

    public String getTestetat() {
        return testetat;
    }

    public String getTestdispo() {
        return testdispo;
    }

    public String getSurface() {
        return surface;
    }

    public String getNb_piece() {
        return nb_piece;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public String getNum() {
        return num;
    }

    public String getRue() {
        return rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getPrix() {
        return prix;
    }

    public boolean isMeublé() {
        return meublé;
    }

    public String getType_loc() {
        return type_loc;
    }

    public String getNb_personne_max() {
        return nb_personne_max;
    }

    public String getPenalité() {
        return penalité;
    }

    public String getEtat() {
        return etat;
    }

    public boolean isDisponibilité() {
        return disponibilité;
    }

    public String getCin_propri() {
        return cin_propri;
    }

    public void setId_app(String id_app) {
        this.id_app = id_app;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public void setNb_piece(String nb_piece) {
        this.nb_piece = nb_piece;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setMeublé(boolean meublé) {
        this.meublé = meublé;
    }

    public void setType_loc(String type_loc) {
        this.type_loc = type_loc;
    }

    public void setNb_personne_max(String nb_personne_max) {
        this.nb_personne_max = nb_personne_max;
    }

    public void setPenalité(String penalité) {
        this.penalité = penalité;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setDisponibilité(boolean disponibilité) {
        this.disponibilité = disponibilité;
    }

    public void setCin_propri(String cin_propri) {
        this.cin_propri = cin_propri;
    }
    
    
    
}