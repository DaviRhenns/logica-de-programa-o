package subrotina2.pkg3;

/**
 *Sem recursividade.
 * Um programa com uma subrotina que recebe um vetor de números por
parâmetro e retorna o maior número.
 */
public class SubRotina23 {

    static int decobrirMaior(int vetor[]){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]>maior) {
                maior = vetor[i];
            }
        }
        
        return maior;
    }
    
    public static void main(String[] args) {
        int vetor[] = {9,2,6,4,0,10};
        System.out.println(decobrirMaior(vetor));
    }
    
}
