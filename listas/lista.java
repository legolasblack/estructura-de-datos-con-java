package listas;

public class lista {

    public nodo inicio;
    public nodo fin;
    public nodo bandera;
//constructor de la lista
    public lista() {
        this.fin=null;
        this.inicio=null;
        this.bandera=null;       
    }
    /*
     * @return the bandera
     */
    public nodo getBandera() {
        return bandera;
    }
    /*
     * @return the fin
     */
    public nodo getFin() {
        return fin;
    }
    /**
     * @return the inicio
     */
    public nodo getInicio() {
        return inicio;
    }
    /**
     * @param bandera the bandera to set
     */
    public void setBandera(nodo bandera) {
        this.bandera = bandera;
    }
    /**
     * @param fin the fin to set
     */
    public void setFin(nodo fin) {
        this.fin = fin;
    }
    /**
     * @param inicio the inicio to set
     */
    public void setInicio(nodo inicio) {
        this.inicio = inicio;
    }
    
    public void insertarelemento(int numero){
        if(this.inicio==null){
            nodo nodoauxiliar=new nodo(numero);
            this.inicio=nodoauxiliar;
            this.fin=nodoauxiliar;
        }
        else{
            nodo nodoauxiliar = new nodo(numero);
            this.fin.setSiguiente(nodoauxiliar);
            nodoauxiliar.setAnterior(this.fin);
            this.fin=nodoauxiliar;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello word");
        lista listpractice= new lista();
        listpractice.insertarelemento(10);
        listpractice.insertarelemento(5);
        System.out.println("todo quedo insertado:");
        System.out.println(listpractice.getInicio().get_objeto());
        System.out.println(listpractice.getFin().get_objeto());
//en este punto la lista esta terminada con el metodo de insertado falta agregar mas funciones a la lista pero ya funciona la estructura
    }

}