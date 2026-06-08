## Dinamicas Lineales

# Estudiante:

William Berrezueta

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

### Captura del codigo:

![alt text](<Captura de pantalla 2026-06-08 085506.png>)


