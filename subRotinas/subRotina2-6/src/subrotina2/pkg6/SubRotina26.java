
package subrotina2.pkg6;

/**
 * Sem recursividade.
Um programa com uma subrotina que receba um vetor e retorna outro vetor com os elementos invertidos.
Exemplo: {1, 2, 3, 4} → {4, 3, 2, 1}
 */
public class SubRotina26 {

    static int[] fazerInverso(int vetor[]){
        int invertido[] = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            invertido[vetor.length-1-i] = vetor[i];
        }
        return invertido;
    }
    
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4};
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(fazerInverso(vetor)[i]);
        }
    }
    
}
