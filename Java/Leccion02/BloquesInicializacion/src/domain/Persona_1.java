package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // Bloque de inicialización estático (antes del constructor y de otro no estático).
    static{ 
        System.out.println("Ejecución del bloque estático");    // Para 'verlo'.
        ++Persona.contadorPersonas;
        // idPersona no es un atributo estático, por lo que aquí daría un error.
    }
    // Bloque de inicialización no estático (contexto dinámico)
    {
        System.out.println("Ejecución del bloque no estático");
        this.idPersona = Persona.contadorPersonas++;            // Incremento del atributo.
    }
}
