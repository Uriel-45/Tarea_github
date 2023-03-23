package ABB;

public class Nodo_generico<V> {
	 
    private V value;
    private Nodo_generico<V> izq;
    private Nodo_generico<V> der;
     
    public Nodo_generico(V value, Nodo_generico<V> izq, Nodo_generico<V> der) {
        super();
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
 
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
 
    public Nodo_generico<V> getIzq() {
        return izq;
    }
 
    public void setIzq(Nodo_generico<V> izq) {
        this.izq = izq;
    }
 
    public Nodo_generico<V> getDer() {
        return der;
    }
 
    public void setDer(Nodo_generico<V> der) {
        this.der = der;
    }
}
