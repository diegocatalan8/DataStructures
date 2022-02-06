
package Clase6BaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    
    //ATRIBUTO con de la Clase Connection
   public Connection  con;
   
    //Constructor de la clase
    public Conexion(){
        
    }
    
    //METODO para generar la conexion
    public void conexion_db() throws ClassNotFoundException{
        // con la funcion property obtenemos la ubcación del archivo ejecutable.
        String url= System.getProperty("user.dir");   
    
        
        try{     
        // obtenemos acceso ala base de datos con el paquete de clases jdbc
         // JDBC significa Java Database Conection conjunto de librerias para conectase a base de datos
         
        Class.forName("org.sqlite.JDBC");
       //cargamos la clase org.sqlite.jdbc esta linea de codigo es vital para el proceso

        //Cargamos la conexion pasando la ruta de la base de datos
        con = DriverManager.getConnection("jdbc:sqlite:"+url+"/"+"alumnos.db");       
      
       // Validamos si la conexión es nula
        if (con!=null) {
            // solo por temas de control mostramos el estado de la conexión
            System.out.println("Conectado");
        }
    }
    // control de errores de tipo slq
    catch (SQLException ex) 
        {
            // error de conexión mostrando el mensaje de error
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
             JOptionPane.showMessageDialog(null,"No se ha podido conectar a la base de datos"+ex.getMessage());
        }
}
    
    /*
    Metodo publico para cerrar la base de datos
    */
 public void close(){
     /*
     lo cargamos en un try por temas de seguridad del cierre de la conexión
     */   
     try {
            con.close();
        } catch (SQLException ex) 
        {
            // trazas de aplicaciones y con la clase de excepción y el nivel de excepción.
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
 public void eliminarAlumno(int id)
 {
     try
     {
         if(con!=null)
         {
                         PreparedStatement st = con.prepareStatement("delete  from alumnos where id="+id+"");
                         st.execute();
                         
         }              
         else
         {
               System.out.println("Error no es posible realizar la operacion");
                 JOptionPane.showMessageDialog(null,"Error no es posible realizar la operacion");
           
         }
         
     }
     catch(Exception ex)
     {
         System.out.println("Error al realizar la actualización por"+ex.getMessage());
          JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+ex.getMessage());
     }
 }
 
 public void editarAlumno(Alumno alumno,int id)
 {
     try
     {
         if(con!=null)
         {
            PreparedStatement st = con.prepareStatement("update alumnos set carnet='"+alumno.getCarnet()+"',nombre='"+alumno.getNombre()+"',curso='"+alumno.getCurso()+"' where id="+id+"");
            st.execute();
            
             
         }
         else
         {
             System.out.println("Error no es posible realizar la operacion");
             
             
         }
     }
     catch(Exception ex)
     {
           JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+ex.getMessage());
     }
     
 }
 // metodo para guardar alumno
 public void guardarAlumno(Alumno alumno)
 {
        try
        {
          if (con!=null) 
            {
            PreparedStatement st = con.prepareStatement("insert into alumnos (carnet,nombre,curso) values (?,?,?)");
            st.setString(1,alumno.getCarnet());
            st.setString(2, alumno.getNombre());     
            st.setString(3, alumno.getCurso());    
            // apasamos parametros al a base de datos
            st.execute();
            // ejecutamos la instrucción
            }
            else
            {   // mostramos que no esta conectamos nosotro decidimos que hacer con este apartado
                System.out.println("no esta conectado");
            
            }
           
        } catch (SQLException ex) 
        {
            // en caso de error mostramos el mensaje de error.
              JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+ex.getMessage());
        }
 
    }
   
  
  
}
