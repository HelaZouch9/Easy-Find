package source;

import java.util.Date;

public class Location {
    private String id_location;
    private String id_app;
    private String cin_loc;
    private String cin_pro;
    private Date datedebut ;
    private Date datefin ;
    private Date datesortie;
    public Location(String id_location,String id_app,String cin_loc,String cin_pro, Date datedebut, Date datefin ){
        this.cin_loc=cin_loc;
        this.cin_pro=cin_pro;
        this.datedebut=datedebut;
        this.datefin=datefin;
        this.id_app=id_app;
        this.id_location=id_location;
}

    public String getId_location() {
        return id_location;
    }

    public String getId_app() {
        return id_app;
    }

    public String getCin_loc() {
        return cin_loc;
    }

    public String getCin_pro() {
        return cin_pro;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public Date getDatesortie() {
        return datesortie;
    }
    public Location(String id_location,String id_app,String cin_loc,String cin_pro, Date datedebut, Date datefin,Date datesortie ){
        this(id_location,id_app,cin_loc,cin_pro,datedebut,datefin);
        this.datesortie=datesortie;
}
    public String get_location(){
        return id_location;
    }
    public String get_app(){
        return id_app;
    }
    public String get_cinpro(){
        return cin_pro;
    }
    public String get_cinloc(){
        return cin_loc;
    }
    public Date get_datedebut(){
        return datedebut;
    }
    public Date get_datefin(){
        return datefin;
    }
}
