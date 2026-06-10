public class Ejercicio2 {
    public boolean esPalindromo(String texto){
        Ejercicio1 Ejercicio1 = new Ejercicio1();
        String invertido = Ejercicio1.invertString(texto);
        return texto.equals(invertido);
    }
}
