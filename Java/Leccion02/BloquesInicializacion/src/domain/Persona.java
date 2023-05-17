package domain;

        
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // Bloque de inicialización estático (antes del constructor y de otro no estático):
    static{
        System.out.println("Ejecucion del bloque estático");    // Para 'verlo'.
        ++Persona.contadorPersonas;
        // idPersona no es un atributo estático, por lo que aquí daría un error.
    }
    
    // Bloque de inicialización no estático (contexto dinámico):
    {
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;            // Incremento del atributo.
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int idPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
}
