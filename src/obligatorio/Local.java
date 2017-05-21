package obligatorio;


public class Local {
  
    //variables de instancia
    private String nombre;
    private String direccion;
    private String tipo;
 
    //constructores
    
    //constructor vacio
    public Local(){
        this.setNombre("Sin definir");
        this.setDireccion("Sin definir");
        this.setTipo("Sin definir");
    }
    
    //constructor con parámetros
    public Local(String unNombre, String unaDireccion, String unTipo){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setTipo(unTipo);
    }
  
    //Acceso y modificacion
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
  
    public String getDireccion(){
        return direccion;
    }
  
    public void setTipo(String unTipo){
        tipo = unTipo;
    }
  
    public String getTipo(){
        return  tipo;
    }
  
  
    @Override
    public String toString(){
      return "El local se llama " + this.getNombre() + " su dirección es " + this.getDireccion() + " y es de tipo " + this.getTipo();
    }

    
}
