package domain;

        
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // Bloque de inicializaci�n est�tico (antes del constructor y de otro no est�tico):
    static{
        System.out.println("Ejecucion del bloque est�tico");    // Para 'verlo'.
        ++Persona.contadorPersonas;
        // idPersona no es un atributo est�tico, por lo que aqu� dar�a un error.
    }
    
    // Bloque de inicializaci�n no est�tico (contexto din�mico):
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
