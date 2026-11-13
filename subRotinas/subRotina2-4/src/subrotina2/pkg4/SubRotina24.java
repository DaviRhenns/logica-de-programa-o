package subrotina2.pkg4;

/**
 *
 * @author alunos
 */
public class SubRotina24 {

    /**
     * Sem recursividade.

Um programa com uma subrotina que recebe um vetor de números (double)
por parâmetro e retorna o valor médio desses números.
     */
    static double descMedia(double numeros[]){
        double acum = 0;
        for (int i = 0; i < numeros.length; i++) {
            acum += numeros[i];
        }
        
        return 1.0 * acum / numeros.length;
    }
    
    public static void main(String[] args) {
        double vetor[] = {2, 2, 3, 2};
        System.out.println(descMedia(vetor));
    }
    
}
