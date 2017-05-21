package obligatorio;

public class Articulo {
    
    //variables de instancia
    private String descripcion;
    private String cdb;
    private String rubro;
    private int pref;
  
    //constructores
    
    //constructor vacio
    public Articulo(){
        this.setDescripcion("Sin Definir");
        this.setCdb("Sin definir");
        this.setRubro("Sin Definir");
        this.setPref(0);
    }
    
    //constructor con parámetros
    public Articulo (String unaDescripcion, String unCdb, String unRubro, int unPref){
        this.setDescripcion(unaDescripcion);
        this.setCdb(unCdb);
        this.setRubro(unRubro);
        this.setPref(unPref);
    }
  
    //Acceso y modificacion
    public void setDescripcion(String unaDescripcion){
        descripcion = unaDescripcion;
    }
  
    public String getDescripcion(){
        return descripcion;
    }
  
    public void setCdb(String unCdb){
        cdb = unCdb;
    }
  
    public String getCdb(){
        return cdb;
    }
  
    public void setRubro(String unRubro){
        rubro = unRubro;
    }
  
    public String getRubro(){
        return rubro;
    }
  
    public void setPref(int unPref){
        pref = unPref;
    }
    public int getPref(){
        return pref;
    }
  
    @Override
    public String toString(){
        return "El articulo es " + this.getDescripcion() + " su código de barra es " + this.getCdb() + " y pertenece al rubo de " + this.getRubro();
    }
}
