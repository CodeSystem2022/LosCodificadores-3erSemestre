package UTN.datos;


import UTN.dominio.Estudiante;

public class EstudianteDAO {
    







    //Metodo listar
    public List<Estudiante> listar(){






        String sql = "SELECT * FROM estudiantes ORDER BY estudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiante2022"));
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        }
    }

































































    //Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES(?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Ocurrio un error al agregar estudiante: "+e.getMessage());
        }//Fin catch
        finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
    }//Fin metodo agregarEstudiante

    public static void main(String[] args){
        //Listar los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiante();
        estudiantes.forEach(System.out::println); //Función Lambda para imprimir

        //Agregar estudiante
        var nuevoEstudiante = new Estudiante("Carlos", "Lara", "5495544223", "carlosl@mail.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("Estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);
    }
}
