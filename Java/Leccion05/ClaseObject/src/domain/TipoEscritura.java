package domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String description;
    
    private TipoEscritura(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
}
