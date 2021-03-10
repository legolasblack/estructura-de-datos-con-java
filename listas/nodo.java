package listas;

public class nodo {

    private nodo siguiente;
    private nodo anterior;
    private int objeto;
//constructor
   /* public void nodo(nodo sig,nodo ant, int obj){
        this.siguiente=sig;
        this.anterior=ant;
        this.objeto=obj;

    }*/
    public nodo(int obj){
        this.siguiente=null;
        this.anterior=null;
        this.objeto=obj;
    }

    public int get_objeto(){
        return this.objeto;
    }
    public nodo get_nodosig(){
        return this.siguiente;
    }
    public nodo get_nodoant(){
        return this.anterior;
    }
    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }
    /**
     * @param objeto the objeto to set
     */
    public void setObjeto(int objeto) {
        this.objeto = objeto;
    }
    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

}