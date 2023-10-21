/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package full.listascirculares;

/**
 *
 * @author Sebastian
 */
public class ListasCirculares {

    public static void main(String[] args) {
        OperacionesNodos op = new OperacionesNodos(new Nodo(5));
        op.insertarFinal(new Nodo(7));
        op.insertarFinal(new Nodo(6));
        op.insertarFinal(new Nodo(10));
        op.insertarInicio(new Nodo(90));
        op.insertarInicio(new Nodo(900));
        op.insertarDespuesNodo(new Nodo(100),new Nodo(5) );
        op.imprimir();
        op.eliminarNodo(new Nodo(900));
        op.eliminarNodo(new Nodo(5));
        op.eliminarNodo(new Nodo(7));
        op.eliminarNodo(new Nodo(6));
        op.eliminarNodo(new Nodo(10));
        op.eliminarNodo(new Nodo(100));
        op.eliminarNodo(new Nodo(90));
        op.imprimir();
    }
}
