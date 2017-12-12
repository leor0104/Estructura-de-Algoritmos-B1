/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enlazada;

/**
 *
 * @author Salas
 */
class Nodo {
  int valor;
  Nodo sig;
  Nodo actual;
  Nodo ant;

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
        this.actual = null;
        this.ant = null;
    }
     
}