package obligatorio;

public class Oferta {

    //variables de instancia (comercio y articulo son asociaciones entre la clase oferta-local y oferta-articulo)
    private Local comercio ;
    private Articulo articulo ;
    private String txtDescr ;
    private int valor ;
    
    //Constructor
    public Oferta(Local unLocal, Articulo unArticulo){
        this.setComercio(unLocal);
        this.setArticulo(unArticulo);
        this.setTxtDescr("Sin definir");
        this.setValor(0);
    }

    //Acceso y modificacion
    public Local getComercio() {
        return comercio ;
    }
    
    public void setComercio(Local unComercio){
        comercio = unComercio ;
    }
    
    public Articulo getArticulo(){
        return articulo ;
    }
    
    public void setArticulo(Articulo unArticulo){
        articulo = unArticulo ;
    }
    
    public String getTxtDescr(){
        return txtDescr ;
    } 
    
    public void setTxtDescr(String unTxtDescr){
        txtDescr = unTxtDescr ;
    }
    
    public int getValor(){
        return valor ;
    }
    
    public void setValor(int unValor){
        valor = unValor ;
    }
    
        
    @Override
    public String toString(){
      return this.getComercio() +" "+ this.getArticulo() + " su texto descriptivo es " + this.getTxtDescr() + " y el valor de la oferta es de " + this.getValor();
    }
       
}
