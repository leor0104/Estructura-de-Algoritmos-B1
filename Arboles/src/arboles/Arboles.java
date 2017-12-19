/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Salas
 */
public class Arboles {

    Nodo raiz = null;

    public Arboles(int valor) {
        this.raiz = new Nodo(valor);
    }

    public void addNodo(Nodo raiz, int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo actual = raiz;

        if (arbolVacio()) {
            raiz = nuevo;
        } else {
            if (nuevo.valor < actual.valor) {
                addNodo(actual.izq, nuevo.valor);

            } else {
                addNodo(actual.der, nuevo.valor);
            }
        }
    }

    public void addNodo2(Nodo raiz, int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo actual = raiz;

        if (arbolVacio()) {
            raiz = nuevo;
        } else {
            if (nuevo.valor < actual.valor) {
                if (actual.izq == null) {
                    actual.izq = nuevo;
                } else {
                    addNodo2(actual.izq, nuevo.valor);
                }
            } else {
                if (actual.der == null) {
                    actual.der = nuevo;
                } else {
                    addNodo2(actual.der, nuevo.valor);
                }
            }
        }
    }

    public boolean arbolVacio() {
        boolean continuar = false;
        if (raiz == null) {
            continuar = true;
        }
        return continuar;
    }
}
