

public class POO_ejemplo {

    //variables o propiedades de la propia clase 
    //con su respectivo encapsulamiento.
    private boolean estado;
    

    //funcion constructor;
    public POO_ejemplo() {
        this.estado=true;
    }

    /*
     * @param estado the estado to set
     */

     //ejemplo de setters y getters
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean getEstado() {
        return this.estado;
        
    }
    
}
