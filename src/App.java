import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println();
        System.out.println("Ejercicio 1");
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertido);

        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println();
        Ejercicio2 ejercicio2 = new Ejercicio2();

        String palabra1 = "radar";
        String palabra2 = "computacion";

        System.out.println("Palabra: " + palabra1);
        System.out.println("Es palindromo? ");
        System.out.println(ejercicio2.esPalindromo(palabra1));
        System.out.println();
        System.out.println("Palabra: " + palabra2);
        System.out.println("Es palindromo? ");
        System.out.println(ejercicio2.esPalindromo(palabra2));
    }

    private static void runStack() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("A");
        pila3.push("A");
        pila.pop();
        pila.pop();
    }

    private static void runQueue() {
        System.out.println("Cola/Queue");
        Queue<String> cola = new ArrayDeque<>();

        cola.offer("Juan");
        cola.offer("Maria");
        cola.offer("Pedro");

        System.out.println();
        System.out.println("Cola/Queue(con valores)");

        System.out.println("Tamanio: " + cola.size());
        System.out.println("Esta vacia? " + cola.isEmpty());
        System.out.println("Primer elemento: " + cola.peek());
        System.out.println("Tamanio: " + cola.size());

        System.out.println();
        System.out.println("Eliminando el primer elemento: " + cola.poll());
        System.out.println("Tamanio: " + cola.size());

        System.out.println();
        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendi a: " + cliente);
        }

        //ofer->agrega un elemento al final
        //poll->devuelve el primero y lo elimina
        //peek->devuelve el primero sin eliminar
    }

    private static void runLinkedList() {
        System.out.println("Lista Enlasada/Linked List");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Esta vacia? " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Diego");

        System.out.println();
        System.out.println("Lista Enlasada/Linked List(con valores)");

        System.out.println("Tamanio: " + nombres.size());
        System.out.println("Esta vacia? " + nombres.isEmpty());
        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Ultimo elemento: " + nombres.getLast());
        System.out.println("Elemento en la posicion 2: " + nombres.get(2));

        System.out.println();
        System.out.println("El primer elemento: " + nombres.peek());
        System.out.println("Tamanio: " + nombres.size());

        System.out.println();
        System.out.println("Eliminando el primer elemento: " + nombres.pop());
        System.out.println("Tamanio: " + nombres.size());

    }
    
}
