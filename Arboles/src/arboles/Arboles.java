/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Arboles {

    private Nodo head;
    private Nodo cola;

    /**
     * @param args the command line arguments
     */

    public Arboles() {
        this.head = null;
        this.cola = null;
    }

    public void addNodo(Nodo actual, int dato) {
        if (actual == null) {
            Nodo nuevo = new Nodo(dato);
            actual = nuevo;
        } else {
            if (dato > actual.valor) {
                addNodo(actual.der, dato);
            } else {
                addNodo(actual.izq, dato);
            }
        }
    }

    public static void preOrden(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.valor + "-");
            preOrden(actual.izq);
            preOrden(actual.der);
        }

    }
    
    public static void eliminar(Nodo actual, int valor) {
        if ((actual.valor != valor) && (actual != null)) {
            if (valor > actual.valor) {
                eliminar(actual.der, valor);
            } else {
                eliminar(actual.izq, valor);
            }

        } else {
            if ((actual.der == null) && (actual.izq == null)) {
                actual = null;
            } else {
                if (actual.izq != null) {
                    Nodo aux = actual.izq;
                    while (aux.der != null) {
                        aux = aux.der;
                    }
                    actual.valor = aux.valor;
                    aux = aux.izq;
                } else {
                    Nodo aux = actual.der;
                    while (aux.izq != null) {
                        aux = aux.izq;
                    }
                    actual.valor = aux.valor;
                    aux = aux.izq;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Arboles arb = new Arboles();
        int op, elem = 0;
        Nodo head = null;
        do {
            System.out.println("1. Ingrese nuevo nodo\n2. Listar");
            System.out.print(" --> ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Elemento: ");
                    elem = input.nextInt();
                    arb.addNodo(head, elem);
                    break;
                case 2:
                        Arboles.preOrden();
                    break;
            }
        } while (op > 0 && op < 3);
    }
}
