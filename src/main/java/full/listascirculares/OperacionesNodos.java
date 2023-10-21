/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package full.listascirculares;

/**
 *
 * @author Sebastian
 */
public class OperacionesNodos {

    private Nodo aux;
    private Nodo sig;
    private Nodo cabeza;

    public OperacionesNodos(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void imprimir() {
        aux = cabeza;
        int i = 0;
        System.out.println(i + "=" + aux.getDato());
        if (aux.getSiguiente() != null) {
            i++;
            sig = aux.getSiguiente();
            aux = sig;
            while (!aux.equals(cabeza)) {
                System.out.println(i + "=" + aux.getDato());
                i++;
                sig = aux.getSiguiente();
                aux = sig;
            }
        }
    }

    public boolean insertarFinal(Nodo nodo) {
        aux = cabeza;
        if (aux.getSiguiente() != null) {
            while (!aux.getSiguiente().equals(cabeza)) {
                sig = aux.getSiguiente();
                aux = sig;
            }
        }
        aux.setSiguiente(nodo);
        nodo.setSiguiente(cabeza);
        return true;
    }

    public boolean insertarInicio(Nodo nodo) {
        insertarFinal(nodo);
        cabeza = nodo;
        return true;
    }

    public boolean insertarDespuesNodo(Nodo nodo, Nodo ref) {
        aux = cabeza;
        if (aux.getSiguiente() != null) {
            while (aux.getDato() != ref.getDato()) {
                sig = aux.getSiguiente();
                aux = sig;
                if (aux.equals(cabeza)) {
                    return false;
                }
            }
            sig = aux.getSiguiente();
            aux.setSiguiente(nodo);
            nodo.setSiguiente(sig);
            return true;
        } else {
            if (ref.equals(cabeza)) {
                insertarFinal(nodo);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean eliminarNodo(Nodo ref) {
        aux = cabeza;
        if (aux.getSiguiente() != null && ref.getDato() != cabeza.getDato()) {
            while (aux.getSiguiente().getDato() != ref.getDato()) {
                sig = aux.getSiguiente();
                aux = sig;
                if (aux.equals(cabeza)) {
                    return false;
                }
            }
            sig = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(sig);
            return true;
        } else {
            if (cabeza.getSiguiente() != null && !cabeza.getSiguiente().equals(cabeza)) {
                while (!aux.getSiguiente().equals(cabeza)) {
                    sig = aux.getSiguiente();
                    aux = sig;
                }
                sig = cabeza.getSiguiente();
                aux.setSiguiente(sig);
                cabeza = sig;
                return true;
            } else {
                System.out.println("No puede eliminar la cabeza");
                return false;
            }
        }
    }

}
