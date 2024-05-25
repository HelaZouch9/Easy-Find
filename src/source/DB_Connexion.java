
package source;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class DB_Connexion {
    private static final String url = "jdbc:mysql://localhost:3307/immobilier";
    private static final String user = "root";
    private static final String password = "A4892@hela#2024";
    private Connection connection;

    public DB_Connexion() {
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println(connection); //a supprimer plus tard
            e.printStackTrace();
        }
    }

    public boolean verifierExistence(Agent a) {
        try{
            System.out.println("dans agent");
            String query = "SELECT COUNT(*) FROM Agent WHERE username_agent = ? AND mdp = ?";
            /*si on ajoute static on ne peut pas acceder a une methode non static a partir d'une methode 
            static donc cette ligne devient dans ce cas fausse*/
            //PreparedStatement preparedStatement = connection.prepareStatement(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);//on prepare la requete
            preparedStatement.setString(1, a.getUsername());//on donne les informations necessaire
            preparedStatement.setString(2, a.getMdp());//on donne les informations necessaire
            ResultSet resultSet = preparedStatement.executeQuery();//on passe a l'execution
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.println(count);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean verifierExistence(Administrateur a) {
        try{
            System.out.println("dans admin");
            String query = "SELECT COUNT(*) FROM Administrateur WHERE username_admin = ? AND mdp = ?";
            /*si on ajoute static on ne peut pas acceder a une methode non static a partir d'une methode 
            static donc cette ligne devient dans ce cas fausse*/
            //PreparedStatement preparedStatement = connection.prepareStatement(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);//on prepare la requete
            preparedStatement.setString(1, a.getUsername());//on donne les informations necessaire
            preparedStatement.setString(2, a.getMdp());//on donne les informations necessaire
            ResultSet resultSet = preparedStatement.executeQuery();//on passe a l'execution
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.println(count);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public int[] displayNumbers() {
        int [] t= new int[3];
    try {
        // Compter le nombre d'appartements
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(id_app) FROM Appartement");
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            t[0]=count;
        }
        // Compter le nombre de clients
        resultSet = statement.executeQuery("SELECT COUNT(cin_client) FROM Client");
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            t[1]=count;
        }
        // Compter le nombre de locations
        resultSet = statement.executeQuery("SELECT COUNT(id_app) FROM Appartement WHERE etat='occupé'");
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            t[2]=count;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return t;
    }
    public ResultSet afficher_client(Client c){
        ResultSet resultSet = null; 
        StringBuffer query1 = new StringBuffer("SELECT cin_client, nom_client, prenom_client, tel_client, email_client ,date_naissance_client FROM Client WHERE ");
        String cin = c.getCin();
        String nom = c.getNom();
        String prenom = c.getPrenom();
        String tel = c.getTel();
        String email = c.getEmail();
        System.out.println(cin+nom+prenom+tel+email);
        if (! cin.equals(""))
            query1.append("cin_client=? AND ");
        if (! nom.equals(""))
            query1.append("nom_client=? AND ");
        if (! prenom.equals(""))
            query1.append("prenom_client=? AND ");
        if (! tel.equals(""))
            query1.append("tel_client=? AND ");
        if (! email.equals(""))
            query1.append("email_client=? AND ");
        System.out.println(query1);
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
        }
        query1.append(" ;");
        String query=query1.toString();
        System.out.println(query);
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int index = 1;
        if (!cin.equals(""))
            preparedStatement.setString(index++,cin);
        if (!nom.equals(""))
            preparedStatement.setString(index++, nom);
        if (!prenom.equals(""))
            preparedStatement.setString(index++, prenom);
        if (!tel.equals(""))
            preparedStatement.setString(index++, tel);
        if (!email.equals(""))
            preparedStatement.setString(index++, email);
        resultSet = preparedStatement.executeQuery();//on passe a l'execution  
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public ResultSet get_regulier(){
        ResultSet resultSet = null;
        String query = "SELECT cin_loc, COUNT(*) AS 'nb_locations' FROM Location GROUP BY cin_loc ORDER BY nb_locations DESC LIMIT 1";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }



public ResultSet refresh_client(){
        // Créer une requête SQL pour sélectionner tous les clients
        String sql = "SELECT cin_client, nom_client, prenom_client, tel_client, email_client, date_naissance_client FROM Client";
        ResultSet rs=null;
        try{
        PreparedStatement ps = connection.prepareStatement(sql); 
        rs = ps.executeQuery();
        return rs;
        }
        catch (SQLException e){
            e.printStackTrace();
            return rs;
        }
    }
    public boolean add_client(Client c){
        String cin = c.getCin();
        String nom = c.getNom();
        String prenom = c.getPrenom();
        String tel = c.getTel();
        String email = c.getEmail();
        String query="INSERT INTO Client (cin_client, nom_client, prenom_client, tel_client, email_client) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, cin);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setString(4, tel);
            ps.setString(5, email);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }         
    }




public boolean update_client(Client c){
        String cin = c.getCin();
        String nom = c.getNom();
        String prenom = c.getPrenom();
        String tel = c.getTel();
        String email = c.getEmail();
        StringBuffer query1=new StringBuffer ("UPDATE Client SET ");  
        if (!nom.equals(""))
            query1.append("nom_client=? ,");
        if (!prenom.equals(""))
            query1.append("prenom_client=? ,");
        if (!tel.equals(""))
            query1.append("tel_client=? ,");
        if (!email.equals(""))
            query1.append("email_client=? , ");
        if (query1.toString().endsWith(", ")){
            query1.delete(query1.length() -3, query1.length());
        }
        query1.append("WHERE cin_client=?;");
        String query=query1.toString();
        System.out.println(query);
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            int index=1;
            if (!nom.equals(""))
                ps.setString(index++, nom);
            if (!prenom.equals(""))
                ps.setString(index++, prenom);
            if (!tel.equals(""))
                ps.setString(index++,tel);
            if (!email.equals(""))
                ps.setString(index++,email);
            ps.setString(index++, cin);
            ps.executeUpdate();
            return true;
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean remove_client(Client c){
        ResultSet rs=null;
        String cin = c.getCin();
        String nom = c.getNom();
        String prenom = c.getPrenom();
        String tel = c.getTel();
        String email = c.getEmail();
        StringBuffer query1=new StringBuffer ("SELECT * FROM Client WHERE ");
        String querydelete="DELETE FROM Client WHERE cin_client=?";
        query1.append("cin_client=? AND ");
        if (!nom.equals(""))
            query1.append("nom_client=? AND ");
        if (!prenom.equals(""))
            query1.append("prenom_client=? AND ");
        if (!tel.equals(""))
            query1.append("tel_client=? AND ");
        if (!email.equals(""))
            query1.append("email_client=? AND ");
        if (query1.toString().endsWith("AND ")){
            query1.delete(query1.length() -5, query1.length());
        }
        query1.append(";");
        String query=query1.toString();
        System.out.println("ici"+query);
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            int index=1;
            if (!cin.equals(""))
                ps.setString(index++, cin);
            if (!nom.equals(""))
                ps.setString(index++, nom);
            if (!prenom.equals(""))
                ps.setString(index++, prenom);
            if (!tel.equals(""))
                ps.setString(index++,tel);
            if (!email.equals(""))
                ps.setString(index++,email);
            rs=ps.executeQuery();
            if (rs.next()){
                System.out.println("donnée existe dans la base");
                ps=connection.prepareStatement(querydelete);
                ps.setString(1, cin);
                ps.executeUpdate();
                return true;
            }
            else
                return false;
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }   
    }




    public ResultSet affiche_location(Location location){
        ResultSet resultSet = null; //il faut la declarer a l'exterieur de try pourque retun la reconnait et l'initialiser
        StringBuffer query1 = new StringBuffer("SELECT id_location, cin_loc, id_app, cin_pro, datedebut, datefin FROM Location WHERE ");
        String id_location=location.get_location();
        String id_app=location.get_app();
        String cin_loc=location.get_cinloc();
        String cin_pro=location.get_cinpro();
        Date datedebut=location.get_datedebut() ;
        Date datefin=location.get_datefin() ;
        if (! id_location.equals(""))
            query1.append("id_location=? AND ");
        if (! id_app.equals(""))
            query1.append("id_app=? AND ");
        if (! cin_loc.equals(""))
            query1.append("cin_loc=? AND ");
        if (! cin_pro.equals(""))
            query1.append("cin_pro=? AND ");
        if (datedebut!=null)
            query1.append("datedebut>=? AND ");
        if (datefin!=null)
            query1.append("datefin<=? AND ");
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
        }
        query1.append(" ;");
        String query=query1.toString();
        System.out.println(query);
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int index = 1;
        if (!id_location.equals(""))
            preparedStatement.setInt(index++, Integer.parseInt(id_location));
        if (!id_app.equals(""))
            preparedStatement.setInt(index++, Integer.parseInt(id_app));
        if (!cin_loc.equals(""))
            preparedStatement.setString(index++, cin_loc);
        if (!cin_pro.equals(""))
            preparedStatement.setString(index++, cin_pro);
        if (datedebut != null)
            preparedStatement.setDate(index++, new java.sql.Date(datedebut.getTime()));
        if (datefin != null)
            preparedStatement.setDate(index++, new java.sql.Date(datefin.getTime()));
        resultSet = preparedStatement.executeQuery();//on passe a l'execution  
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public ResultSet agent_refresh(){
        ResultSet resultSet = null;
        String query="SELECT * FROM Agent";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public Boolean add_agent(Agent a){
        String username=a.getUsername();
        String cin=a.getCin();
        String nom=a.getNom();
        String prenom=a.getPrenom();
        String tel=a.getTel();
        String email=a.getEmail();
        String mdp=a.getMdp();
        Double salaire=a.getSalaire();
        Date date_naissance_util=a.getDate_naissance();
        String query="INSERT INTO Agent VALUES (?,?,?,?,?,?,?,?,?)";
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,cin);
        preparedStatement.setString(3,nom);
        preparedStatement.setString(4,prenom);
        java.sql.Date date_naissance_sql = new java.sql.Date(date_naissance_util.getTime());
        preparedStatement.setDate(5,date_naissance_sql);   
        preparedStatement.setString(6,tel);
        preparedStatement.setString(7,email);
        preparedStatement.setString(8,mdp);
        preparedStatement.setDouble(9,salaire);
        preparedStatement.executeUpdate();
        return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
                    
        }
        
    }
    public ResultSet afficher_agent(Agent a){
        ResultSet resultSet = null; 
        StringBuffer query1 = new StringBuffer("SELECT * FROM Agent WHERE ");
        String username=a.getUsername();
        String cin=a.getCin();
        String nom=a.getNom();
        String prenom=a.getPrenom();
        String tel=a.getTel();
        String email=a.getEmail();
        String mdp=a.getMdp();
        Double salaire=a.getSalaire();
        Date date_naissance=a.getDate_naissance();
        if (! username.equals(""))
            query1.append("username_agent=? AND ");
        if (! cin.equals(""))
            query1.append("cin_agent=? AND ");
        if (! nom.equals(""))
            query1.append("nom_agent=? AND ");
        if (! prenom.equals(""))
            query1.append("prenom_agent=? AND ");
        if (! tel.equals(""))
            query1.append("tel_agent=? AND ");
        if (! email.equals(""))
            query1.append("email_agent=? AND ");
        if (! mdp.equals(""))
            query1.append("mdp=? AND ");
        if (salaire!=0)
            query1.append("salaire=? AND ");
        if (date_naissance!=null)
            query1.append("date_naissance_agent=?");
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
        }
        query1.append(" ;");
        String query=query1.toString();
        System.out.println(query);
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int index = 1;
        if (!username.equals(""))
            preparedStatement.setString(index++, username);
        if (! cin.equals(""))
            preparedStatement.setString(index++, cin);
        if (! nom.equals(""))
            preparedStatement.setString(index++, nom);
        if (! prenom.equals(""))
            preparedStatement.setString(index++, prenom);
        if (! tel.equals(""))
            preparedStatement.setString(index++, tel);
        if (! email.equals(""))
            preparedStatement.setString(index++, email);
        if (! mdp.equals(""))
            preparedStatement.setString(index++, mdp);
        if (salaire!=0)
            preparedStatement.setDouble(index++, salaire);
        if (date_naissance!=null){
            java.sql.Date date_naissance_sql = new java.sql.Date(date_naissance.getTime());
            preparedStatement.setDate(index++,date_naissance_sql);
        }
        resultSet = preparedStatement.executeQuery();//on passe a l'execution 
        
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public Boolean remove_agent(Agent a){
        StringBuffer query1 = new StringBuffer("DELETE FROM Agent WHERE ");
        StringBuffer query2 = new StringBuffer("SELECT * FROM Agent WHERE ");
        String username=a.getUsername();
        String cin=a.getCin();
        String nom=a.getNom();
        String prenom=a.getPrenom();
        String tel=a.getTel();
        String email=a.getEmail();
        String mdp=a.getMdp();
        Double salaire=a.getSalaire();
        Date date_naissance=a.getDate_naissance();
        if (! username.equals("")){
            query1.append("username_agent=? AND ");
            query2.append("username_agent=? AND ");}
        if (! cin.equals("")){
            query1.append("cin_agent=? AND ");
            query2.append("cin_agent=? AND ");}
        if (! nom.equals("")){
            query1.append("nom_agent=? AND ");
            query2.append("nom_agent=? AND ");}
        if (! prenom.equals("")){
            query1.append("prenom_agent=? AND ");
            query2.append("prenom_agent=? AND ");}
        if (! tel.equals("")){
            query1.append("tel_agent=? AND ");
            query2.append("tel_agent=? AND ");}
        if (! email.equals("")){
            query1.append("email_agent=? AND ");
            query2.append("email_agent=? AND ");}
        if (! mdp.equals("")){
            query1.append("mdp=? AND ");
            query2.append("mdp=? AND ");}
        if (salaire!=0){
            query1.append("salaire=? AND ");
            query2.append("salaire=? AND ");}
        if (date_naissance!=null){
            query1.append("date_naissance_agent=?");
            query2.append("date_naissance_agent=?");}
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
            query2.delete(query2.length() - 5, query2.length());
        }
        query1.append(" ;");
        query2.append(" ;");
        String query=query1.toString();
        String query3=query2.toString();
        System.out.println(query);
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
        int index = 1;
        if (!username.equals("")){
            preparedStatement.setString(index, username);
            preparedStatement3.setString(index++, username);}
        if (! cin.equals("")){
            preparedStatement.setString(index, cin);
            preparedStatement3.setString(index++, cin);}
        if (! nom.equals("")){
            preparedStatement.setString(index, nom);
            preparedStatement3.setString(index++, nom);}
        if (! prenom.equals("")){
            preparedStatement.setString(index, prenom);
            preparedStatement3.setString(index++, prenom);}
        if (! tel.equals("")){
            preparedStatement.setString(index, tel);
            preparedStatement3.setString(index++, tel);}
        if (! email.equals("")){
            preparedStatement.setString(index, email);
            preparedStatement3.setString(index++, email);}
        if (! mdp.equals("")){
            preparedStatement.setString(index, mdp);
            preparedStatement3.setString(index++, mdp);}
        if (salaire!=0){
            preparedStatement.setDouble(index, salaire);
            preparedStatement3.setDouble(index++, salaire);}
        if (date_naissance!=null){
            java.sql.Date date_naissance_sql = new java.sql.Date(date_naissance.getTime());
            preparedStatement.setDate(index,date_naissance_sql);
            preparedStatement3.setDate(index++,date_naissance_sql);
        }
        ResultSet rs =preparedStatement3.executeQuery();
        System.out.println(rs);
        if (rs.next()){
            preparedStatement.executeUpdate();
            return true;
        }
        else
            return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public Boolean update_agent(Agent a){
        StringBuffer query1 = new StringBuffer("UPDATE Agent SET ");
        StringBuffer query2 = new StringBuffer("SELECT * FROM Agent WHERE ");
        String username=a.getUsername();
        String cin=a.getCin();
        String nom=a.getNom();
        String prenom=a.getPrenom();
        String tel=a.getTel();
        String email=a.getEmail();
        String mdp=a.getMdp();
        Double salaire=a.getSalaire();
        Date date_naissance=a.getDate_naissance();
        if (! cin.equals("")){
            query2.append("cin_agent=? ;");
            if (! username.equals("")){
                query1.append("username_agent=? ,");
                }
            if (! nom.equals("")){
                query1.append("nom_agent=? , ");
                }
            if (! prenom.equals("")){
                query1.append("prenom_agent=? , ");
                }
            if (! tel.equals("")){
                query1.append("tel_agent=? , ");
               }
            if (! email.equals("")){
                query1.append("email_agent=? , ");
                }
            if (! mdp.equals("")){
                query1.append("mdp=? , ");
                }
            if (salaire!=0){
                query1.append("salaire=? , ");
               }
            if (date_naissance!=null){
                query1.append("date_naissance_agent=? , ");
              }
            if (query1.toString().endsWith(", ")) {
                query1.delete(query1.length() - 3, query1.length());
            }

            query1.append(" WHERE cin_agent=? ;");
            String query=query1.toString();
            String query3=query2.toString();
            System.out.println(query);
            System.out.println(query3);
            try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
            int index = 1;
            preparedStatement3.setString(1, cin);
            if (!username.equals("")){
                preparedStatement.setString(index++, username);
                }
            if (! nom.equals("")){
                preparedStatement.setString(index++, nom);}
            if (! prenom.equals("")){
                preparedStatement.setString(index++, prenom);}
            if (! tel.equals("")){
                preparedStatement.setString(index++, tel);}
            if (! email.equals("")){
                preparedStatement.setString(index++, email);}
            if (! mdp.equals("")){
                preparedStatement.setString(index++, mdp);}
            if (salaire!=0){
                preparedStatement.setDouble(index++, salaire);}
            if (date_naissance!=null){
                java.sql.Date date_naissance_sql = new java.sql.Date(date_naissance.getTime());
                preparedStatement.setDate(index++,date_naissance_sql);
            }
            preparedStatement.setString(index++, cin);
            ResultSet rs =preparedStatement3.executeQuery();
            if (rs.next()){
                preparedStatement.executeUpdate(); 
            }
            else
                return false;
            return true;
            }
            catch (SQLException e){
                e.printStackTrace();
                return false;
            }
            }
        else 
            return false;
    }
    public ResultSet location_refresh(){
        ResultSet resultSet = null;
        String query="SELECT * FROM Location";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    private boolean verifierDisponibiliteAppartement(String id_app, Date datedebut, Date datefin) throws SQLException {
        LocalDate dateSysteme=LocalDate.now();
        Instant instant=datedebut.toInstant();
        LocalDate dd=instant.atZone(ZoneId.systemDefault()).toLocalDate();
        String query;
        PreparedStatement preparedStatement;
        ResultSet rs=null;
        int count;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(datefin); // Définir la datefin actuelle
        calendar.add(Calendar.DAY_OF_MONTH, 1); // Ajouter un jour à la datefin
        java.sql.Date dateFinPlusUnJour = new java.sql.Date(calendar.getTimeInMillis());
        //pour etre sur de la date de sortie eventuelle
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatee = sdf.format(dateFinPlusUnJour);
        System.out.println(dateFormatee);
        System.out.println(dateFinPlusUnJour);
        System.out.println("debut de verifier disponibilité");
        if (dd.compareTo(dateSysteme)==0){
            System.out.println("1 er cas");
            query="SELECT COUNT(*) FROM Appartement WHERE id_app = ? AND disponibilite=TRUE ";
            try{
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1,id_app);
                rs=preparedStatement.executeQuery();
                rs.next();
                count = rs.getInt(1);
                if (count==0){
                   System.out.println("1 er cas ou l'appartement n'est pas dispo");
                    return false;}
            query="SELECT COUNT(*) FROM Location WHERE id_app = ? AND datedebut<=? AND datedebut>?";   //datedebut>? //AND  datefin >= ?
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,id_app);
            preparedStatement.setDate(2,dateFinPlusUnJour);
            preparedStatement.setDate(3,new java.sql.Date(datedebut.getTime()));
            rs=preparedStatement.executeQuery();
            rs.next();
            count = rs.getInt(1);
            if (count==0){
                System.out.println("1 er cas location apres qui empeche celle la ");
                    return true;}
            return false;
            }
            catch (SQLException e){
            e.printStackTrace();
            return false;
        }
            
        }
        else if (dd.compareTo(dateSysteme)<0){
            System.out.println("2 eme cas");
            return false;}
        else{
            System.out.println("3 eme cas");
            query="SELECT COUNT(*) FROM Location WHERE id_app=? and ((datedebut>=? AND datedebut<=?)OR(datefin>=? AND datefin<=?))";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,id_app);
            preparedStatement.setDate(2,new java.sql.Date(datedebut.getTime()));
            preparedStatement.setDate(3,dateFinPlusUnJour);
            preparedStatement.setDate(4,new java.sql.Date(datedebut.getTime()));
            preparedStatement.setDate(5,dateFinPlusUnJour);
            rs=preparedStatement.executeQuery();
            rs.next();
            count = rs.getInt(1);
            System.out.println("la valeur de count "+count);
            if (count==0){
                    System.out.println("je dois retourner un true");
                    return true;}
            return false;
        }
    }
    public boolean add_location(Location location){
        StringBuffer query1 = new StringBuffer("INSERT INTO Location(id_location,id_app,cin_loc,cin_pro,datedebut,datefin) VALUES (?,?,?,?,?,?) ");
        String id_location=location.get_location();
        String id_app=location.get_app();
        String cin_loc=location.get_cinloc();
        String cin_pro=location.get_cinpro();
        Date datedebut=location.get_datedebut() ;
        Date datefin=location.get_datefin() ;
        String query=query1.toString();
        PreparedStatement preparedStatement;
        try{
        System.out.println("avant de verifier cin et id apparte");
        String query2="SELECT cin_propri FROM Appartement WHERE id_app=?";
        preparedStatement = connection.prepareStatement(query2);
        preparedStatement.setString(1,id_app);
        ResultSet rs=preparedStatement.executeQuery();
        String cin;
        if (rs.next()) {
            cin= rs.getString("cin_propri");
            if (!cin.equals(cin_pro)){
                System.out.println("hhhhhhhhh");
                return false;}
            else{
                boolean appartementDisponible = verifierDisponibiliteAppartement(id_app, datedebut, datefin);
                System.out.println("la valeur retourner de veriffier disponibilité au niveau de add location "+appartementDisponible);
                if (appartementDisponible) {
                preparedStatement = connection.prepareStatement(query);
                int index = 1;
                preparedStatement.setString(index++,id_location);
                preparedStatement.setString(index++,id_app);
                preparedStatement.setString(index++, cin_loc);
                preparedStatement.setString(index++, cin_pro);
                preparedStatement.setDate(index++, new java.sql.Date(datedebut.getTime()));
                preparedStatement.setDate(index++, new java.sql.Date(datefin.getTime()));
                preparedStatement.executeUpdate();  
                return true;}
                else
                    return false;
                }
            }
        
        else
            return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public ResultSet affiche_appart(Appartement a){
        ResultSet resultSet = null; //il faut la declarer a l'exterieur de try pourque retun la reconnait et l'initialiser
        StringBuffer query1 = new StringBuffer("SELECT id_app, cin_propri, nbre_piece, nbre_personne_max, type_location, gouvernorat,prix,meublé FROM Appartement WHERE  ");
        String id_appart=a.getId_app();
        String cin_prop=a.getCin_propri();
        String prix=a.getPrix();
        String nb_piece=a.getNb_piece();
        String max_personne=a.getNb_personne_max();
        String type=a.getType_loc();
        String gouv=a.getGouvernorat();
        boolean meuble=a.isMeublé();
        String testetat=a.getTestetat();        //meuble
        if(!id_appart.equals(""))
            query1.append("id_app=? AND ");
        if(!cin_prop.equals(""))
            query1.append("cin_propri=? AND ");
        if(!prix.equals(""))
            query1.append("prix=? AND ");
        if(!nb_piece.equals("0"))
            query1.append("nbre_piece=? AND ");
        if(!max_personne.equals("0"))
            query1.append("nbre_personne_max=? AND ");
        if(!type.equals("choisir"))
            query1.append("type_location=? AND ");
        if(!gouv.equals("choisir"))
            query1.append("gouvernorat=? AND ");
        if(testetat!=null)
            query1.append("meublé=? AND ");
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
        }
        query1.append(" ;");
        String query=query1.toString();
        System.out.println(query);
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int index = 1;
        if (!id_appart.equals(""))
            preparedStatement.setString(index++, id_appart);
        if (!cin_prop.equals(""))
            preparedStatement.setString(index++, cin_prop);
        if (!prix.equals(""))
            preparedStatement.setString(index++, prix);
        if (!nb_piece.equals("0"))
            preparedStatement.setString(index++, nb_piece);
        if (!max_personne.equals("0"))
            preparedStatement.setString(index++, max_personne);
        if (!type.equals("choisir"))
            preparedStatement.setString(index++, type);
        if (!gouv.equals("choisir"))
            preparedStatement.setString(index++, gouv);
        if(testetat!=null)
            preparedStatement.setBoolean(index++, meuble);
        resultSet = preparedStatement.executeQuery();//on passe a l'execution  
        }
        catch (SQLException e){
            e.printStackTrace();
            return resultSet;
        }
        return resultSet;
                  
    }
    public ResultSet appartement_demande(){
        ResultSet resultSet = null;
        StringBuffer query=new StringBuffer("SELECT a.id_app, COUNT(l.id_location) AS nombre_de_locations "
                + "FROM Appartement a LEFT JOIN Location l "
                + "ON a.id_app = l.id_app "
                + "GROUP BY a.id_app "
                + "ORDER BY nombre_de_locations DESC "
                + "LIMIT 1;");
        try{
           PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
           resultSet = preparedStatement.executeQuery();
           return resultSet;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public void miseajourappartement(){
        // Obtenir la date actuelle
        java.util.Date dateActuelle = new java.util.Date();

        // Convertir la date actuelle en java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(dateActuelle.getTime());
        String query="UPDATE Appartement SET etat='occupé' ,disponibilite=FALSE"
                + " WHERE id_app in (SELECT id_app FROM Location WHERE DATEDEBUT=?)";
        try{
           PreparedStatement preparedStatement = connection.prepareStatement(query); 
           preparedStatement.setDate(1,sqlDate);
           preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    public ResultSet afficher_penalite(){
        // Obtenir la date actuelle
        java.util.Date dateActuelle = new java.util.Date();

        // Convertir la date actuelle en java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(dateActuelle.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new java.util.Date()); // Utiliser SYSDATE
        calendar.add(Calendar.DAY_OF_MONTH, -1); // Soustraire un jour
        java.sql.Date dateHier = new java.sql.Date(calendar.getTimeInMillis());
        //uniquement pour l'affichage
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatee = sdf.format(dateHier);
        System.out.println(dateHier);
        System.out.println(sqlDate);
        ResultSet rs = null;
        String query= "SELECT l.id_location, l.id_app, l.cin_loc, c.prenom_client, c.nom_client, c.tel_client, c.email_client, c.date_naissance_client, l.datedebut, l.datefin, a.penalite"
        + " FROM Location l, Client c, Appartement a"
        + " WHERE l.id_app = a.id_app AND l.cin_loc = c.cin_client AND l.datesortie=? AND l.datefin = ?";
        String query1="UPDATE Location SET datesortie=? WHERE datefin = ? ";
        String query2="UPDATE Appartement SET etat='libre' , disponibilite=TRUE WHERE id_app IN (SELECT id_app FROM Location WHERE datesortie=? AND datefin = ? )";
        try{
            PreparedStatement preparedStatement1 = connection.prepareStatement(query1); 
            preparedStatement1.setDate(1,sqlDate);
            preparedStatement1.setDate(2,dateHier);
            preparedStatement1.executeUpdate();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(1,sqlDate);
            preparedStatement.setDate(2,dateHier);
            rs = preparedStatement.executeQuery();
            System.out.println("update de date sortie fait");
            PreparedStatement preparedStatement2 = connection.prepareStatement(query2); 
            preparedStatement2.setDate(1,sqlDate);
            preparedStatement.setDate(2,dateHier);
            System.out.println("update etat des appartements");
            return rs;
        }
        catch (SQLException e){
            e.printStackTrace();
            return rs;
        }
        
    }
    public Boolean remove_location(Location a){
        StringBuffer query1 = new StringBuffer("DELETE FROM Location WHERE ");
        StringBuffer query2 = new StringBuffer("SELECT * FROM Location WHERE ");
        String id_location=a.get_location();
        String id_app=a.get_app();
        String cin_loc=a.get_cinloc();
        String cin_pro=a.get_cinpro();
        Date datedebut=a.get_datedebut() ;
        Date datefin=a.get_datefin() ;
        if (! id_location.equals("")){
            query1.append("id_location=? AND ");
            query2.append("id_location=? AND ");}
        if (! id_app.equals("")){
            query1.append("id_app=? AND ");
            query2.append("id_app =? AND ");}
        if (! cin_loc.equals("")){
            query1.append("cin_loc=? AND ");
            query2.append("cin_loc=? AND ");}
        if (! cin_pro.equals("")){
            query1.append("cin_pro=? AND ");
            query2.append("cin_pro=? AND ");}
        if (datedebut!=null){
            query1.append("datedebut=? AND ");
            query2.append("datedebut=? AND ");}
        if (datefin!=null){
            query1.append("datefin=? AND ");
            query2.append("datefin=? AND ");}
        // Supprimer le "AND" supplémentaire à la fin
        if (query1.toString().endsWith("AND ")) {
            query1.delete(query1.length() - 5, query1.length());
            query2.delete(query2.length() - 5, query2.length());
        }
        query1.append(" ;");
        query2.append(" ;");
        String query=query1.toString();
        String query3=query2.toString();
        try{
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
        int index = 1;
        if (!id_location.equals("")){
            System.out.println("1 champ");
            preparedStatement.setString(index, id_location);
            preparedStatement3.setString(index++, id_location);}
        if (! id_app.equals("")){
            System.out.println("2 champ");
            preparedStatement.setString(index, id_app);
            preparedStatement3.setString(index++, id_app);}
        if (! cin_loc.equals("")){
            System.out.println("3 champ");
            preparedStatement.setString(index, cin_loc);
            preparedStatement3.setString(index++, cin_loc);}
        if (! cin_pro.equals("")){
            System.out.println("4 champ");
            preparedStatement.setString(index, cin_pro);
            preparedStatement3.setString(index++, cin_pro);}
        if (datedebut!=null){
            System.out.println("5 champ");
            java.sql.Date datedebut_sql = new java.sql.Date(datedebut.getTime());
            preparedStatement.setDate(index,datedebut_sql);
            preparedStatement3.setDate(index++,datedebut_sql);
        }
        if (datefin!=null){
            System.out.println("6 champ");
            java.sql.Date datefin_sql = new java.sql.Date(datefin.getTime());
            preparedStatement.setDate(index,datefin_sql);
            preparedStatement3.setDate(index++,datefin_sql);
        }
        ResultSet rs =preparedStatement3.executeQuery();
        System.out.println(rs);
        if (rs.next()){
            preparedStatement.executeUpdate();//on passe a l'execution 
            return true;
        }
        else
            return false;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        
    }
    public boolean update_location(Location a){
            ResultSet rs = null;
            PreparedStatement preparedStatement;
            String queryupdate="UPDATE Location SET datesortie=?,datefin=? WHERE id_location=?";
            String queryupdate1="UPDATE Location SET datesortie=? WHERE id_location=?";
            String queryappartement="UPDATE Appartement SET etat='libre' , disponibilite=TRUE WHERE id_app IN (SELECT id_app FROM Location WHERE id_location=?)";

            StringBuffer query1 = new StringBuffer("SELECT * FROM Location WHERE ");
            String id_location=a.get_location();
            String id_app=a.get_app();
            String cin_loc=a.get_cinloc();
            String cin_pro=a.get_cinpro();
            Date datedebut=a.get_datedebut() ;
            Date datefin=a.get_datefin() ;
            Date datesortie=a.getDatesortie();
            

            query1.append("id_location=? AND ");
            if (! id_app.equals(""))
            query1.append("id_app=? AND ");
            if (! cin_loc.equals(""))
                query1.append("cin_loc=? AND ");
            if (! cin_pro.equals(""))
                query1.append("cin_pro=? AND ");
            if (datedebut!=null)
                query1.append("datedebut>=? AND ");
            if (datefin!=null)
                query1.append("datefin<=? AND ");
            query1.append("datesortie IS NULL AND ");
            if (query1.toString().endsWith("AND ")) {
                query1.delete(query1.length() - 5, query1.length());
            }
            query1.append(" ;");
            String query=query1.toString();
            try{
                preparedStatement = connection.prepareStatement(query);
                int index = 1;
                if (!id_location.equals(""))
                    preparedStatement.setString(index++, id_location);
                if (!id_app.equals(""))
                    preparedStatement.setString(index++,id_app);
                if (!cin_loc.equals(""))
                    preparedStatement.setString(index++, cin_loc);
                if (!cin_pro.equals(""))
                    preparedStatement.setString(index++, cin_pro);
                if (datedebut != null)
                    preparedStatement.setDate(index++, new java.sql.Date(datedebut.getTime()));
                if (datefin != null)
                    preparedStatement.setDate(index++, new java.sql.Date(datefin.getTime()));
                rs = preparedStatement.executeQuery();//on passe a l'execution 
                if(rs.next()){
                   Date datefin1 = rs.getDate("datefin");
                   Date datedebut1=rs.getDate("datedebut");
                   if (datesortie!=null){
                      if (datesortie.compareTo(datedebut1)<0)
                        return false;
                      else{
                         if(datesortie.compareTo(datefin1)<0){
                            preparedStatement = connection.prepareStatement(queryupdate);
                            preparedStatement.setDate(1,new java.sql.Date(datesortie.getTime()));
                            preparedStatement.setDate(2,new java.sql.Date(datesortie.getTime()));
                            preparedStatement.setString(3,id_location);
                            preparedStatement.executeUpdate();
                            preparedStatement = connection.prepareStatement(queryappartement);
                            preparedStatement.setString(1,id_location);
                            preparedStatement.executeUpdate();}

                        if(datesortie.compareTo(datefin1)==0){
                            preparedStatement = connection.prepareStatement(queryupdate1);
                            preparedStatement.setDate(1,new java.sql.Date(datesortie.getTime()));
                            preparedStatement.setString(2,id_location);
                            preparedStatement.executeUpdate();
                            preparedStatement = connection.prepareStatement(queryappartement);
                            preparedStatement.setString(1,id_location);
                            preparedStatement.executeUpdate();
                        }
                        return true;
                    }//fin else 
                               
                   }
                   else
                        return false;
                }
                //if kbira
                
            }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;  
    }
    public boolean update_appart(Appartement a) {
        StringBuffer query1 = new StringBuffer("UPDATE Appartement SET ");
        String id_app = a.getId_app();
        String surface = a.getSurface();
        String nb_piece = a.getNb_piece();
        String gouvernorat = a.getGouvernorat();
        String num = a.getNum();
        String rue = a.getRue();
        String code_postal = a.getCode_postal();
        String prix = a.getPrix();
        boolean meuble = a.isMeublé();
        String type_loc = a.getType_loc();
        String nb_personne_max = a.getNb_personne_max();
        String penalite = a.getPenalité();
        String etat = a.getEtat();
        boolean disponibilite = a.isDisponibilité();
        String cin_propri = a.getCin_propri();

        query1.append("cin_propri=?, ");
        query1.append("prix=?, ");
        query1.append("nbre_piece=?, ");
        query1.append("nbre_personne_max=?, ");
        query1.append("type_location=?, ");
        query1.append("gouvernorat=?, ");
        query1.append("etat=?, ");
        query1.append("meublé=?, ");
        query1.append("disponibilite=?, ");
        query1.append("penalite=?, ");
        query1.append("rue=?, ");
        query1.append("code_postal=?, ");
        query1.append("surface=?, ");
        query1.append("num=? ");

        // Supprimer la dernière virgule et l'espace
        if (query1.toString().endsWith(", ")) {
            query1.delete(query1.length() - 2, query1.length());
        }

        query1.append(" WHERE id_app=?");

        String query = query1.toString();
        System.out.println(query);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int index = 1;
            preparedStatement.setString(index++, cin_propri);
            preparedStatement.setString(index++, prix);
            preparedStatement.setString(index++, nb_piece);
            preparedStatement.setString(index++, nb_personne_max);
            preparedStatement.setString(index++, type_loc);
            preparedStatement.setString(index++, gouvernorat);
            preparedStatement.setString(index++, etat);
            preparedStatement.setBoolean(index++, meuble);
            preparedStatement.setBoolean(index++, disponibilite);
            preparedStatement.setString(index++, penalite);
            preparedStatement.setString(index++, rue);
            preparedStatement.setString(index++, code_postal);
            preparedStatement.setString(index++, surface);
            preparedStatement.setString(index++, num);
            preparedStatement.setString(index++, id_app);

            preparedStatement.executeUpdate(); // Exécution de la requête

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    
    
    
    
    
    
    
    
    //fin de DB_Connexion
  }   
