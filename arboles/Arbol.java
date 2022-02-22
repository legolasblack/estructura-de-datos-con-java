//package arboles;

public class Arbol {
    private Nodo raiz;

    public Arbol(){
        this.raiz=new Nodo(50);
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }
    public void insertar_nodo(Nodo nodo_raiz, int numero_a_guardar){
        if(nodo_raiz.getContenido()>numero_a_guardar){
            if(nodo_raiz.getIzquierdo()==null){
                Nodo nodo_insertar=new Nodo(numero_a_guardar);
                nodo_raiz.setIzquierdo(nodo_insertar);
                System.out.println("el nodo "+nodo_insertar.getContenido()+" fue insertado debajo de "+ nodo_raiz.getContenido()+" como hijo izquierdo");
            }
            else{
                this.insertar_nodo(nodo_raiz.getIzquierdo(), numero_a_guardar);
            }
        }else{
            if(nodo_raiz.getDerecho()==null){
                Nodo nodo_insertar=new Nodo(numero_a_guardar);
                nodo_raiz.setDerecho(nodo_insertar);
                System.out.println("el nodo "+nodo_insertar.getContenido()+" fue insertado debajo de "+ nodo_raiz.getContenido()+" como hijo derecho");
            }else{
                this.insertar_nodo(nodo_raiz.getDerecho(), numero_a_guardar);
            }

        }

    }


}