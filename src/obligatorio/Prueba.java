
package obligatorio;

import java.util.*;

public class Prueba {

    public static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        
        
        //String descripcion = "hola";
        //if(descripcion.contains("il")) {
        //    System.out.println("contiene ol");
        //}
        
        
        
        
        
        Local l1 = ingresoLocal();
        System.out.println(l1); // al final lo sacamos
        Articulo a1 = ingresoArticulo();
        System.out.println(a1); // al final lo sacamos
        
        int opc;
        
        
        do {
            
            opc = pedirDato(1,4,"** Bienvenid@ al menu principal de la Oficina de Defensa al Consumidor ** \n 1) Actualización del precio del artículo \n 2) Actualización del local \n 3) Proceso de ofertas \n 4) Terminar \n Ingrese la opción deseada");
            input.nextLine();
                     
            switch (opc) {
            
                case 1:
                    System.out.println("Ajustar el precio de referencia e indicar si el nuevo valor es menor, igual, o mayor al que se tenia registrado \n");
                    int nuevoprecio = input.nextInt();
                    int cont = 0;
                    while (cont != 1) {
                    
                        
                    if (nuevoprecio > 0 ){
                    
                    
                        if (nuevoprecio == a1.getPref()) {
                            System.out.println("El actual precio de referencia es igual al anterior \n");
                        }else if(nuevoprecio > a1.getPref()){
                            System.out.println("El actual precio de referencia es mayor al anterior \n");
                        }else {
                            System.out.println("El actual precio de referencia es menor al anterior \n");
                        }
                        cont ++;
                        a1.setPref(nuevoprecio);
                    } else if (nuevoprecio <= 0 ){
                        System.out.println("El precio de referencia ingresado es incorrecto porfavor ingreselo nuevamente");
                        nuevoprecio = input.nextInt();
                    }
                
                    }
                    
                break;
            
                case 2:
                    System.out.println("Ingrese la nueva dirección del local");
                    l1.setDireccion(input.nextLine());
                    System.out.println("La nueva dirección registrada para el local " + l1.getNombre() + " es " + l1.getDireccion() + "\n");
                break;
            
                case 3:
                    System.out.println("Defina tres ofertas porfavor");
                    
                    // temporalmente y para verificar errores ingreso las ofertas de esta manera
                    Oferta o1 = new Oferta (l1,a1); 
                    Oferta o2 = new Oferta (l1,a1);
                    Oferta o3 = new Oferta (l1,a1);
                    
                    
                    
                    System.out.println("Ingrese el valor de cada oferta");
                    System.out.println("o1:\n");
                    o1.setValor(input.nextInt());
                    System.out.println(o1+"\n");
                    System.out.println("o2:\n");
                    o2.setValor(input.nextInt());
                    System.out.println(o2+"\n");
                    System.out.println("o3:\n");
                    o3.setValor(input.nextInt());
                    System.out.println(o3+"\n");
                    
                    String opc1;
                    input.nextLine();
                    
                    do {
                        
                        System.out.println("a) Consulta de artículo");
                        System.out.println("b) Consulta de precio promedio");
                        System.out.println("c) Consulta de infracción");
                        System.out.println("d) Volver al menú principal \n");     
                        
                        
                        System.out.println("Escriba la opción deseada");
                        opc1 = input.nextLine();
                        
                        switch (opc1) {
                            
                            case "a":
                                System.out.println("Indicar el rango de precios de las 3 ofertas registradas \n");
                                int maxp = Math.max(o1.getValor(), o2.getValor());
                                int max = Math.max(maxp, o3.getValor());
                                int minp = Math.min(o1.getValor(), o2.getValor());
                                int min = Math.min(minp, o3.getValor());
                                System.out.println("El rango de precios es "+min+" - "+max);
                            break;
                            
                            case "b":
                                System.out.println("Mostrar el precio promedio del articulo, considerando las 3 ofertas \n");
                                float promedio = (o1.getValor()+o2.getValor()+o3.getValor())/3;
                                System.out.println("El promedio es "+promedio);
                            break;
                            
                            case "c":
                                estaEnInfraccion(o1.getValor(), o2.getValor(), o3.getValor(), a1.getPref());
                            break;
                            
                            default:
                                System.out.println("La opción no es válida \n");
                            break;
                                                        
                        }
                                
                    } while (opc1.compareTo("d") != 0) ;
                
                break;

                case 4:
                    System.out.println("Gracias por su visita! \n");
                    System.exit(0);
                break;
                                
            }
        } while ( opc != 4) ;   
    }
    
    // METODO DEL INGRESO DEL LOCAL
    
    public static Local ingresoLocal (){
      
        int opc;
        String unTipo = "";  
        
        
        System.out.println("Ingrese el nombre de su local, porfavor");
        String unNombre = input.nextLine();
        
        System.out.println("Ingrese la dirección de su local, porfavor"); 
        String unaDireccion = input.nextLine();
                
        
        
        
        opc = pedirDato(1, 5, "Seleccione un tipo de local \n 1) Almacén \n 2) Supermercado \n 3) Hipermercado \n 4) Kiosco \n 5) Otro" );
                
        
        
            
        
        switch (opc){
            case 1:
                unTipo = "Almacén";
            break;
            case 2:
                unTipo = "Supermercado";
            break;
            case 3:
                unTipo = "Hipermercado";
            break;
            case 4:
                unTipo = "Kiosco";
            break;
            case 5:
                unTipo = "Otro";
            break;
            
        }
        
        
      Local l1 = new Local (unNombre, unaDireccion, unTipo); 
             
    return l1;
    
    }
        
    // METODO DE INGRESO DEL ARTICULO
    
    public static Articulo ingresoArticulo(){
        
        int opc;
        String unRubro = "";
        input.nextLine();
        System.out.println("Ingrese la descripcion de su artículo");
        String unaDescripcion = input.nextLine();
        System.out.println("Ingrese su código de barras");
        String unCdb = input.nextLine();
        
        
        opc = pedirDato(1, 8, "Seleccione el rubro de su artículo \n 1) Congelado \n 2) Bebida sin alcoho \n 3) Bebida con alcohol \n 4) Fruta / Verdura \n 5) Alimento \n 6) Producto para bebés \n 7) Limpieza \n 8) Otros \n" );
        
        switch (opc){
            case 1:
                unRubro = "Congelado";
            break;
            
            case 2:
                unRubro = "Bebida sin alcohol"; 
            break;
            
            case 3:
                unRubro = "Bebida con alcohol";
            break;
            
            case 4:
                unRubro = "Fruta / Verdura";
            break;
            
            case 5:
                unRubro = "Alimento";
            break;
            
            case 6:
                unRubro = "Producto para bebés";
            break;
            
            case 7:
                unRubro = "Limpieza";
            break;
            
            case 8:
                unRubro = "Otro";
            break;
            
        }
                
        
        
        System.out.println("Ingrese el precio de referencia del artículo");
        int unPref = input.nextInt();
        input.nextLine();
        
        Articulo a1 = new Articulo (unaDescripcion, unCdb, unRubro, unPref); 
        return a1; 
    }
    
    // metodo hecho por marck para ingresar opcion para el meno
    public static int pedirDato(int min, int max, String msg){
        
        System.out.println(msg); // ejemplo "porfavor ingrese la opcion deseada"
        
        int opc = input.nextInt();
        while (opc < min || opc > max){
            System.out.println("La opción ingresada no es válida \n" + msg);
        }
        return opc;
    }
    
    // ponerlo directamente en el submenu
    public static void estaEnInfraccion(int valorO1,int valorO2,int valorO3,int prefA1){
        boolean enInfraccion = false;
        if ((valorO1)  > (prefA1*2) || (valorO2) > (prefA1*2) || (valorO3) > (prefA1*2) ){
            enInfraccion = true;
            System.out.println("El local está en infraccion");
        } else { 
            System.out.println("El local no está en infracción"); 
            System.out.println("Probando cambio git");
        }
    }
}
    

