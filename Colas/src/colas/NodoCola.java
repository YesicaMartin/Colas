
package colas;

/**
 * @author Yesica
 * Implementacion de colas
 */
public class NodoCola {
    
    private Object  elemento;
    private NodoCola siguiente;
    
    public NodoCola(Object elemento, NodoCola siguiente){  
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    public NodoCola(Object elemento){   
        this.elemento = elemento;
        this.siguiente = null;
    }
    
    public Object getElemento(){
        return elemento;
    }
    
    public NodoCola getSiguiente(){
        return siguiente;
    }
    
    public void insertarSiguiente(Object dato){
        NodoCola nuevoNodo = new NodoCola(dato, this.siguiente);
        this.siguiente = nuevoNodo;
    }
}

/*
Referencias: 
<< https://www.youtube.com/watch?v=tWN9L7zfy9A >>
<< https://www.youtube.com/watch?v=FhI93FxzSTc >>

*/