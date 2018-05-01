
package colas;
import javax.swing.JOptionPane;

/**
 * @author Yesica Martin
 * Implementacion de Colas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cola cl = new Cola();
        int opcion = 0;
        int elemento = 0;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "\t\tCOLA\n"
                        + "\t1. Crear cola\n"
                        + "\t2. Insertar elemento\n"
                        + "\t3. Mostrar primer elemento de la cola\n"
                        + "\t4. Borrar elemento de la cola\n"
                        + "\t5. Desencolar elemento\n"
                        + "\t6. Mostrar tamaño de la cola\n"        
                        + "\t7. Vaciar cola \n"
                        + "\t8. Comprobar si esta vacia\n"
                        + "\t9. Salir\n"
                        + "Elige una opcion",JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1://Crear cola
                        if(cl.estaVacia()){
                            //cl.vaciarCola();
                            JOptionPane.showMessageDialog(null,"Se ha creado una nueva cola ", "Ya tienes una nueva cola",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Ya hay una cola creada ", "No se puede crear otra cola ",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 2://Insertar elemento
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresar nuevo elemento a la cola: ", JOptionPane.INFORMATION_MESSAGE));
                        cl.put(elemento);
                        break;
                        
                    case 3://Mostrar primer elemento de la cola
                        if(!cl.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El primer elemento de la cola es (" + cl.mostrarFrente()+ ")",
                            "Primer elemento", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No hay elementos en la cola","Cola vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4://Borrar elemento de la cola
                        if(!cl.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Borrando elemento: (" + cl.mostrarFrente()+ ")",
                            "Elemento de la cima", JOptionPane.INFORMATION_MESSAGE);
                            cl.borrarFrente();
                            JOptionPane.showMessageDialog(null, "Elemento borrado",
                            "Elemento de la cima", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No hay elementos en la cola","Cola vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5://Desencolar elemento
                        if(!cl.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento desencolado es: (" + cl.get()+ ")",
                            "Desencolado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No hay elementos en la cola","Cola vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 6://Mostrar tamaño de la cola  
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es: (" + cl.sizeCola()+ ")",
                        "Desencolado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    case 7://Vaciar cola
                        if(!cl.estaVacia()){
                            cl.vaciarCola();
                            JOptionPane.showMessageDialog(null,"Se ha vaciado la cola", "Ya tienes una nueva cola",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La cola ya estaba vacia", "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 8://Comprobar si esta vacia
                        if(cl.estaVacia()){
                            JOptionPane.showMessageDialog(null,"La cola esta vacia ", "Cola vacia ", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia ", "La cola contiene elementos",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 9://Salir
                        JOptionPane.showMessageDialog(null, "Aplicación de Colas finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }  
            catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                }
        }
        while (opcion!=9);
                
    }
    
}
