import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
    ///
    /// metodo que devuelve una cadena de texto invertida
    /// texto -> COMPUTACION
    /// return -> NOITACUTOPMOC
    /// usar solo pilas

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
