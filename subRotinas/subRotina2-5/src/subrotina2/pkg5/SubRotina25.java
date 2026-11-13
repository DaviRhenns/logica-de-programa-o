
package subrotina2.pkg5;

/**
 *
 * Sem recursividade.

Um programa com uma subrotina que
receba um vetor e um número, e diga
se o número está presente
(retornando true/false).
 */
public class SubRotina25 {

    static boolean taDentro(int vetor[], int numero){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]==numero) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5};
        int numero = 3;
        
        System.out.println(taDentro(vetor, numero));
    }
    
}
