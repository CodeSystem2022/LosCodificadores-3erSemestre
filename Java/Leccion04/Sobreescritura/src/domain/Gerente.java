package domain;


public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //Sobreescribimso el metodo
    @Override
    public String obtenerDetalles(){//no podemos cambiar su modificador de acceso
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
    }
}
