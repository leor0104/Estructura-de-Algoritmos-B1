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
class Nodo {
int valor;
Nodo izq;
Nodo der;
Nodo aux;


    public Nodo(int valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
        this.aux = null;
    }
    
    
}
