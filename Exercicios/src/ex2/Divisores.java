package ex2;

import java.util.ArrayList;

/**
 *
 * @author Renata
 */
public class Divisores {
    
    public static ArrayList<Integer> quaisDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            if(numero%i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
    
    public static void imprimeDivisores(int numero) {
        System.out.println("Divisores de " + numero + ":");
        quaisDivisores(numero).forEach((i) -> {
            System.out.println(i);
        });
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        imprimeDivisores(15);
        imprimeDivisores(7);
        imprimeDivisores(22);
        imprimeDivisores(220);
        imprimeDivisores(6);
        imprimeDivisores(5);
    }
}
