//package arboles;

public class Nodo {
    private int contenido;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(int objeto_enviado) {
        this.contenido=objeto_enviado;
        this.derecho=null;
        this.izquierdo=null;
        
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    /**
     * @param derecho the derecho to set
     */
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    /**
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    /**
     * @return the contenido
     */
    public int getContenido() {
        return contenido;
    }
    /**
     * @return the derecho
     */
    public Nodo getDerecho() {
        return derecho;
    }
    /**
     * @return the izquierdo
     */
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    
}