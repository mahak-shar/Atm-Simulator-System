
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        //mySQL is an external entity ,so there are chances of error at runtime,hence to catch these errors we will use tryCatch
        try{
            //it will automatically register the driver
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Priyanka1551@"); 
            //paste the name of ur database after 3 slash
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e); //we are simply printing whatever the error is coming
        }
    }
}


