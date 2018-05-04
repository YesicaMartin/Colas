
package colas;

/**
 * @author Yesica
 * Implementacion de colas
 */
public class Cola {
    
    private NodoCola primero;
    private NodoCola ultimo;
    private int cont;
    
    public Cola(){
        this.primero = null;
        this.ultimo = null;
        this.cont = 0;
    }
    
    //Vaciar cola
    public void vaciarCola(){
        this.primero = null;
        this.ultimo = null;
        this.cont = 0;
    }
    
    //Comprobar si esta vacia
    public boolean estaVacia(){
        return(this.primero == null);
    }
    
    //Para insertar elemento
    public void put (Object dato){
        if(primero ==null){
            this.primero = new NodoCola(dato);
            this.ultimo = primero;
        }
        else{
            this.ultimo.insertarSiguiente(dato);
            this.ultimo = this.ultimo.getSiguiente();
        }
        this.cont++;
    }
    
    //Para devolver el elemento del frente
    public Object mostrarFrente(){
        if(this.primero != null){
            return this.primero.getElemento();
        }
        else{
            return null;
        }
    }
    
    //Para borrar elemento del frente
    public void borrarFrente(){
        if(this.primero != null){
            this.primero = this.primero.getSiguiente();
            this.cont--;    
        }
    }
    
    //Para desencolar el elemento al frente
    public Object get(){
        if(this.primero == null){
            return null;
        }
        else{
            this.cont--;
            NodoCola nodoTemporal = this.primero;
            this.primero = this.primero.getSiguiente();
            return nodoTemporal.getElemento();
        }
    }
    
    //TamaÃ±o de la cola
    public int sizeCola(){
        return this.cont;
    }
}

