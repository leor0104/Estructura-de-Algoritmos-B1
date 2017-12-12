/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayenlazada;

import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class ArrayEnlazada {
            Scanner scan = new Scanner(System.in);

   private Nodo head;
   private Nodo cola;
   int n;
   int x;
   int A[];

    public ArrayEnlazada() {
        this.head = null;
        this.cola = null;
        this.n = 7;
    }
    public void add_Array(){
        this.A = new int[n];
        for (int i=0; i<n; i++) {
            System.out.printf("Ingrese el valor en la posicion [%d]: ");
            x = scan.nextInt();
            A[i]=x;
        }
        
    }
    public void insertar (int x){
        Nodo nuevo = new Nodo (this.x);
        if (head ==null){
            head = nuevo;
        }else{
            if (this.x<head.valor){
                nuevo.sig=head;
                head=nuevo;
            }else{
                Nodo aux = head;
                while (aux.sig != null){
                    if (aux.sig.valor > x){
                        aux=aux.sig;
                    }else{
                        nuevo=nuevo.sig;
                        aux.sig=nuevo;
                    }   
                }
            }
        }
    }        
    public void add_Nodo(int valor){
        Nodo nuevo = new Nodo(valor);
        if(head ==  null){
            head = nuevo;
            cola = nuevo;
        }else{
            nuevo.sig=head;
            head.ant = nuevo;
            head = nuevo;
        }
    }
   
    public void add_Final(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo actual = head;
        if(head ==  null){
            head = nuevo;
            cola = nuevo;
        }else{
            cola.sig = nuevo;
            nuevo.ant = cola;
            cola = nuevo;
        }    

    }
    
    public void mostrar(){
        Nodo actual = head;
        while (actual != null){
            System.out.print("["+actual.valor+"]->");
            actual = actual.sig;
        }
        System.out.println("NULL");
    }
    
    public void ordenar(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo actual = head;
        if(head ==  null){
            head = nuevo;
        }else{
            
        }
    }
    
    public void eliminar(int valor){
        Nodo actual = head;
        while(actual != null){
            if(actual.valor == valor){
                head = head.sig;
                break;
            }else if(actual.sig.valor == valor){
                actual.sig = actual.sig.sig;
                break;
            }else{
                actual = actual.sig;
                break;
            }
        }
    }

    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        int op, elem, num;
        ArrayEnlazada miLista = new ArrayEnlazada();
        do{
            System.out.println("1.Ingresar un nuevo nodo al Inicio\n2.Ingresar un nuevo nodo al Final\n3.Listar\n4.Eliminar\n0.Salir");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("ELemento:");
                    elem = scan.nextInt();
                    miLista.add_Nodo(elem);
                    break;
                                    
                case 2:
                    System.out.println("ELemento:");
                    elem = scan.nextInt();
                    miLista.add_Final(elem);
                    break;
                    
                case 3:
                    miLista.mostrar();
                    break;
                    
                case 4:
                    System.out.println("Eliminar elemento: ");
                    num = scan.nextInt();
                    miLista.eliminar(num);
                    break;
                    
                default: break;
            }
        } while (op != 0);
        
    }
    
}