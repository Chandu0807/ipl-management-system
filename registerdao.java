package dbms_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Register;

public class registerdao {

    public int registerEmployee(Register register) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (first_name, last_name, username, password, address, contact) VALUES " +
            " (?, ?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/ipl", "root", "chandu@0807");
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, register.getFirstName());
            preparedStatement.setString(2, register.getLastName());
            preparedStatement.setString(3, register.getUsername());
            preparedStatement.setString(4, register.getPassword());
            preparedStatement.setString(5, register.getAddress());
            preparedStatement.setString(6, register.getContact());

            System.out.println(preparedStatement);
      
            result = preparedStatement.executeUpdate();           
        }
        
    catch (SQLException e) {
        	 e.printStackTrace();
        }    
        
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from employee"); 
        	System.out.println("\n\n...................................................*************************IPL DATABASE************************..............................................................");
        	System.out.println("\n\n                               ***************register details *******************\n");
        	System.out.println("                    first_name      lastname       usename        password          address            contact      ");
        	System.out.println("                    ____________________________________________________________________________________________");
        	
        	while(rs.next())  
        	System.out.println("                       "+rs.getString(1)+"         "+rs.getString(2)+"     "+rs.getString(3)+"        "+rs.getString(4)+"          "+rs.getString(5)+"              "+rs.getString(6));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    }  
        
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	 
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from fixtures");  
        	System.out.println("\n\n                       ***************fixture details *******************\n");
        	System.out.println("                    id      team1id       team2id       venue id     umpire id          completed      ");
        	System.out.println("                    ___________________________________________________________________________________");
        	
        	while(rs.next())  
        	System.out.println("                        "+rs.getInt(1)+"    "+rs.getInt(2)+"        "+rs.getInt(3)+"             "+rs.getInt(4)+"         "+rs.getInt(5)+"           "+rs.getInt(6));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    } 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from matches");  
        	System.out.println("\n\n                    ********************match details***********************\n");
        	System.out.println("                    fix_id      winid      momid");
        	System.out.println("                    _____________________________");
        	
        	while(rs.next())  
        	System.out.println("                    "+rs.getInt(1)+"        "+rs.getInt(2)+"        "+rs.getInt(3));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    } 
        
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from owners");  
        	System.out.println("\n\n                               ***************owner details *******************\n");
        	System.out.println("                     ownerid        name          profession         teamname");
        	System.out.println("                    ___________________________________________________________");
        	
        	while(rs.next())  
        	System.out.println("                     "+rs.getInt(1)+"       "+rs.getString(2)+"       "+rs.getString(3)+"        "+rs.getString(4));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    } 
        
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	  
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from players");  
        	System.out.println("\n\n                               ***************player details *******************\n");
        	System.out.println("                     playerid     name     totalruns     played               strikerate");
        	System.out.println("                    ______________________________________________________________________");
        	
        	while(rs.next())  
        	System.out.println("                     "+rs.getInt(1)+"             "+rs.getString(2)+"      "+rs.getInt(3)+"          "+rs.getInt(4)+"              "+rs.getDouble(5));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    } 
        
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from teams");  
        	System.out.println("\n\n                               ***************IPL TEAMS*******************\n");
        	System.out.println("                     TEAMID     NAMES");
        	System.out.println("                    __________________");
        	
        	while(rs.next())  
        	System.out.println("                     "+rs.getInt(1)+"    "+rs.getString(2));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    }
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
        	
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from umpires");  
        	System.out.println("\n\n                               ***************umpire details*******************\n");
        	System.out.println("                     id       name             nationality");
        	System.out.println("                    ________________________________________");

        	
        	while(rs.next())  
        	System.out.println("                     "+rs.getInt(1)+"    "+rs.getString(2)+"       "+rs.getString(3));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    }
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/ipl","root","chandu@0807");  
         
        	java.sql.Statement stmt=con.createStatement();  
        	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from venues");  
        	System.out.println("\n\n                               ***************venue details*******************\n");
        	System.out.println("                     id           location");
        	System.out.println("                    ________________________");
        	
        	while(rs.next())  
        	System.out.println("                     "+rs.getInt(1)+"          "+rs.getString(2));  
        	con.close();  
        	}catch(Exception e)

        	{
        	     System.out.println(e);
        	    }
		return result;        
    }
    }

	