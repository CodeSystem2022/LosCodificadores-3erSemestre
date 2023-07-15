package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos algunos objetos que son necesarios para la comunicación cono la base de datos.
        PreparedStatement ps; // Envía la sentencia a la base de datos.
        ResultSet rs; // Se obtiene el resultado de la base de datos.
        // Se rea un objeto de tipo conexión
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes ORDER BY estudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiante2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        }
        finally {
            try{
                con.close()
            }catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion con la base de datos: " + e.getMessage());
            }
        }
        return estudiantes;
    }//Fin metodo listar

    //Metodo por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudianrr){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs,next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Se encontro un registro
            }//Fin if
        } catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }//Fin del catch
        finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            } //Fin catch
        }//Fin finally
        return false;
        //Buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.printl("Estudiantes antes de la bsuqyeda: "+estudiante1);
        var encontrado = EstudianteDAO.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.printl("Estudiante encontrado: " +estudiante1);
        else
            System.out.printl("No se encontro el estudiante: "+estudiante1.getIdEstudiante());
        