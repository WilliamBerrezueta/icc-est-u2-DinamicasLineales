## Dinamicas Lineales

# Estudiante:

### William Berrezueta

# Fecha:08/06/2026

## Descripción:

### LinkedList, Queue y Stack;

En esta clase nos enseñaron el uso básico de tres estructuras de datos en Java: `LinkedList`, `Queue` y `Stack`.  
Se nos explico cómo almacenar elementos, agregar nuevos datos y eliminar elementos según cada estructura.

- `LinkedList`: permite guardar datos en una lista enlazada.
- `Queue`: funciona como una cola, donde el primer dato que entra es el primero en salir.
- `Stack`: funciona como una pila, donde el último dato que entra es el primero en salir.

## Ejercicio 1: Invertir una cadena con pila

En este ejercicio creamos un método llamado `invertString`, el cual recibe una cadena de texto y devuelve esa misma cadena invertida.

Para lograrlo, se uso una pila con `Deque<Character>` y `ArrayDeque` y primero, el texto se convierte en caracteres con `toCharArray()` y cada letra se guarda en la pila usando `push()`.

Después, se van sacando las letras con `pop()` y como la pila funciona con **LIFO** (último en entrar, primero en salir), las letras salen en orden contrario.

### Implementación de codigo:

````java
public class Ejercicio1 {
    public String invertString(String texto){
        texto.toCharArray();

        Deque<Character> pila = new ArrayDeque<>();
        for(char c : texto.toCharArray()){
            pila.push(c);
        }
        String invertido = "";
        while(!pila.isEmpty()){
            invertido += pila.pop();
        }

        return invertido;
    }
}
````
### Captura de salida en consola

````java
Ejercicio 1
Texto original: COMPUTACION
Texto invertido: NOICATUPMOC
````

## 2. Ejercicio Palíndromo

# Fecha:10/06/2026

## Descripción:

En este ejercicio creamos el método `esPalindromo`, el cual recibe una cadena de texto y verifica si se lee igual de izquierda a derecha y de derecha a izquierda.

Para hacerlo, se usa la clase `Ejercicio1`, específicamente el método `invertString`, que nos permite invertir el texto recibido, para luego, el programa compara el texto original con el texto invertido usando `equals()`.

Si ambos textos son iguales, el método devuelve `true`.  
Si son diferentes, devuelve `false`.

### Método implementado

````java
public class Ejercicio2 {
    public boolean esPalindromo(String texto){
        Ejercicio1 Ejercicio1 = new Ejercicio1();
        String invertido = Ejercicio1.invertString(texto);
        return texto.equals(invertido);
    }
}
````
### Captura de salida en consola:

````java
Ejercicio 2

Palabra: radar
Es palindromo? 
true

Palabra: computacion
Es palindromo? 
false
````



